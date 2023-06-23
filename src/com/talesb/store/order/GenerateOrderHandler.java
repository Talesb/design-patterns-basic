package com.talesb.store.order;

import java.time.LocalDateTime;
import java.util.List;

import com.talesb.store.budget.Budget;
import com.talesb.store.order.actions.AfterOrderActions;

public class GenerateOrderHandler {

	private List<AfterOrderActions> actions ;
	
	public GenerateOrderHandler(List<AfterOrderActions> actions) {
		this.actions = actions;
	}

	public void doExecute(GenerateOrder generateOrder) {
		Budget budget = new Budget(generateOrder.getBudgetValue(), generateOrder.getBudgetItemsQuantity());
		Order order = new Order(generateOrder.getCustomer(), LocalDateTime.now(), budget);
		actions.forEach(action -> action.doExecute(order));
	}

}

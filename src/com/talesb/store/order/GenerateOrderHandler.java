package com.talesb.store.order;

import java.time.LocalDateTime;

import com.talesb.store.actions.SaveOrderInDataBase;
import com.talesb.store.actions.SendOrderEmail;
import com.talesb.store.budget.Budget;

public class GenerateOrderHandler {

	public void doExecute(GenerateOrder generateOrder) {
		Budget budget = new Budget(generateOrder.getBudgetValue(), generateOrder.getBudgetItemsQuantity());

		Order order = new Order(generateOrder.getCustomer(), LocalDateTime.now(), budget);

		// Call a repository to save
		SaveOrderInDataBase saveOrder = new SaveOrderInDataBase();
		saveOrder.doExecute(order);

		// Call a email service
		SendOrderEmail sendEmail = new SendOrderEmail();
		sendEmail.doExecute(order);

	}

}

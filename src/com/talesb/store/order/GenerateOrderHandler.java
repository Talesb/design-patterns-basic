package com.talesb.store.order;

import java.time.LocalDateTime;

import com.talesb.store.budget.Budget;

public class GenerateOrderHandler {

	public void doExecute(GenerateOrder generateOrder) {
		Budget budget = new Budget(generateOrder.getBudgetValue(), generateOrder.getBudgetItemsQuantity());

		Order order = new Order(generateOrder.getCustomer(), LocalDateTime.now(), budget);

		// Call a repository to save
		System.out.println("Saving infos...");

		// Call a email service
		System.out.println("Sending an Email with order infos..");

	}

}

package com.talesb.store.order;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.talesb.store.budget.Budget;

public class GenerateOrder {

	private String customer;
	private BigDecimal budgetValue;
	private int budgetItemsQuantity;

	public GenerateOrder(String customer, BigDecimal budgetValue, int budgetItemsQuantity) {
		this.customer = customer;
		this.budgetValue = budgetValue;
		this.budgetItemsQuantity = budgetItemsQuantity;
	}

	public String getCustomer() {
		return customer;
	}

	public BigDecimal getBudgetValue() {
		return budgetValue;
	}

	public int getBudgetItemsQuantity() {
		return budgetItemsQuantity;
	}

	public void doExecute() {
		Budget budget = new Budget(this.budgetValue, this.budgetItemsQuantity);

		Order order = new Order(this.customer, LocalDateTime.now(), budget);

		// Call a repository to save
		System.out.println("Saving infos...");

		// Call a email service
		System.out.println("Sending an Email with order infos..");

	}

}

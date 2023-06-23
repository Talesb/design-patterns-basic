package com.talesb.store.order;

import java.time.LocalDateTime;

import com.talesb.store.budget.Budget;

public class Order {

	private String customerName;
	private LocalDateTime data;
	private Budget budget;

	public Order(String customerName, LocalDateTime data, Budget budget) {
		this.customerName = customerName;
		this.data = data;
		this.budget = budget;
	}

	public String getCustomerName() {
		return customerName;
	}

	public LocalDateTime getData() {
		return data;
	}

	public Budget getBudget() {
		return budget;
	}

}

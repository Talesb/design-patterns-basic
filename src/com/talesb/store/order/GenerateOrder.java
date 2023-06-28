package com.talesb.store.order;

import java.math.BigDecimal;
import java.util.List;

import com.talesb.store.budget.Budgetable;

public class GenerateOrder {

	private String customer;
	private List<Budgetable> items;

	public GenerateOrder(String customer, List<Budgetable> items) {
		this.customer = customer;
		this.items = items;
	}

	public String getCustomer() {
		return customer;
	}

	public BigDecimal getBudgetValue() {
		return this.items.stream().map(budgetItem -> budgetItem.getValue()).reduce(BigDecimal.ZERO, BigDecimal::add);
	}

	public int getBudgetItemsQuantity() {
		return this.items.size();
	}

	public List<Budgetable> getItems() {
		return items;
	}

	public void setItems(List<Budgetable> items) {
		this.items = items;
	}

	
	
	
}

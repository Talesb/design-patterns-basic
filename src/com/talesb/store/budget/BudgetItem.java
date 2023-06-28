package com.talesb.store.budget;

import java.math.BigDecimal;

public class BudgetItem implements Budgetable{

	private BigDecimal value;
	
	public BudgetItem(BigDecimal value) {
		super();
		this.value = value;
	}

	public BigDecimal getValue() {
		return value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}

}

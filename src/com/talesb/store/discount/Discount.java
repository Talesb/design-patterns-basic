package com.talesb.store.discount;

import java.math.BigDecimal;

import com.talesb.store.budget.Budget;

public abstract class Discount {
	
	protected Discount next;
	
	public Discount(Discount next) {
		super();
		this.next = next;
	}



	public abstract BigDecimal calculate(Budget budget);
	
	
	
	
	

}

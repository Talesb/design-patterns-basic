package com.talesb.store.discount;

import java.math.BigDecimal;

import com.talesb.store.budget.Budget;

public class WithoutDiscount extends Discount{

	public WithoutDiscount() {
		super(null);
	}

	public BigDecimal calculate(Budget budget) {
		 
		return BigDecimal.ZERO;
	}

}

package com.talesb.store.discount;

import java.math.BigDecimal;

import com.talesb.store.budget.Budget;

public class WithoutDiscount extends Discount{

	public WithoutDiscount() {
		super(null);
	}
 
	@Override
	protected boolean canCalculate(Budget budget) {
		return true;
	}

	@Override
	protected BigDecimal performCalculation(Budget budget) {
		return BigDecimal.ZERO;
	}

}

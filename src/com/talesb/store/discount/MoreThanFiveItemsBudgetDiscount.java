package com.talesb.store.discount;

import java.math.BigDecimal;

import com.talesb.store.budget.Budget;

public class MoreThanFiveItemsBudgetDiscount extends Discount{

	public MoreThanFiveItemsBudgetDiscount(Discount next) {
		super(next);
	}

	@Override
	protected boolean canCalculate(Budget budget) {
		return budget.getItemQuantity() > 5;
	}

	@Override
	protected BigDecimal performCalculation(Budget budget) {
		return budget.getValue().multiply(new BigDecimal("0.1"));
	}

 

}

package com.talesb.store.discount;

import java.math.BigDecimal;

import com.talesb.store.budget.Budget;

public class PriceGreaterThanFiveHundredBudgetDiscount extends Discount{

	public PriceGreaterThanFiveHundredBudgetDiscount(Discount next) {
		super(next);
	}

	@Override
	protected boolean canCalculate(Budget budget) {
		return budget.getValue().compareTo(new BigDecimal("500")) > 0;
	}

	@Override
	protected BigDecimal performCalculation(Budget budget) {
		return budget.getValue().multiply(new BigDecimal("0.05"));
	}

}

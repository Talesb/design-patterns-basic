package com.talesb.store.discount;

import java.math.BigDecimal;

import com.talesb.store.budget.Budget;

public class PriceGreaterThanFiveHundredBudgetDiscount extends Discount{

	public PriceGreaterThanFiveHundredBudgetDiscount(Discount next) {
		super(next);
	}

	public BigDecimal calculate(Budget budget) {
		if (budget.getValue().compareTo(new BigDecimal("500")) > 0) {
			return budget.getValue().multiply(new BigDecimal("0.05"));
		}
		return next.calculate(budget);
	}

}

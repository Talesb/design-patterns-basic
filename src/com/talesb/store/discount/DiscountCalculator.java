package com.talesb.store.discount;

import java.math.BigDecimal;

import com.talesb.store.budget.Budget;

public class DiscountCalculator {

	public BigDecimal calculate(Budget budget) {
		Discount discountChain = new MoreThanFiveItemsBudgetDiscount(new PriceGreaterThanFiveHundredBudgetDiscount(new WithoutDiscount()));
		return discountChain.calculate(budget);
	}

}

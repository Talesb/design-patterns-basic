package com.talesb.store.discount;

import java.math.BigDecimal;

import com.talesb.store.budget.Budget;

public class MoreThanFiveItemsBudgetDiscount extends Discount{

	public MoreThanFiveItemsBudgetDiscount(Discount next) {
		super(next);
	}

	public BigDecimal calculate(Budget budget) {
		if (budget.getItemQuantity() > 5) {
			return budget.getValue().multiply(new BigDecimal("0.1"));
		}
		return next.calculate(budget);
	}

 

}

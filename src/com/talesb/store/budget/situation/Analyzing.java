package com.talesb.store.budget.situation;

import java.math.BigDecimal;

import com.talesb.store.budget.Budget;

public class Analyzing extends BudgetSituation {

	@Override
	public BigDecimal calculateExtraDiscount(Budget budget) {
		return budget.getValue().multiply(new BigDecimal("0.05"));
	}

	@Override
	public void approve(Budget budget) {
		budget.setBudgetSituation(new Approved());
	}

	@Override
	public void disapprove(Budget budget) {
		budget.setBudgetSituation(new Disapproved());
	}
}

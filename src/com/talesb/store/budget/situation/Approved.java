package com.talesb.store.budget.situation;

import java.math.BigDecimal;

import com.talesb.store.budget.Budget;

public class Approved extends BudgetSituation {

	@Override
	public BigDecimal calculateExtraDiscount(Budget budget) {
		return budget.getValue().multiply(new BigDecimal("0.02"));
	}

	@Override
	public void conclude(Budget budget) {
		budget.setBudgetSituation(new Finished());
	}

}

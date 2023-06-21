package com.talesb.store.budget.situation;

import com.talesb.store.budget.Budget;

public class Disapproved extends BudgetSituation {

	@Override
	public void conclude(Budget budget) {
		budget.setBudgetSituation(new Finished());
	}

}

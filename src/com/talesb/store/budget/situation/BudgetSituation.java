package com.talesb.store.budget.situation;

import java.math.BigDecimal;

import com.talesb.store.budget.Budget;
import com.talesb.store.budget.exception.DomainException;

public abstract class BudgetSituation {

	public BigDecimal calculateExtraDiscount(Budget budget) {
		return BigDecimal.ZERO;
	}

	public void approve(Budget budget) {
		throw new DomainException("The Budget cant be Approved!");
	}

	public void disapprove(Budget budget) {
		throw new DomainException("The Budget cant be Disapproved!");
	}

	public void conclude(Budget budget) {
		throw new DomainException("The Budget cant be Finished!");
	}

}

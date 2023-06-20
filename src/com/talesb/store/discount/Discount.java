package com.talesb.store.discount;

import java.math.BigDecimal;

import com.talesb.store.budget.Budget;

public abstract class Discount {

	protected Discount next;

	public Discount(Discount next) {
		super();
		this.next = next;
	}

	public BigDecimal calculate(Budget budget) {
		if (canCalculate(budget)) {
			return performCalculation(budget);
		}
		return next.calculate(budget);

	};

	protected abstract boolean canCalculate(Budget budget);

	protected abstract BigDecimal performCalculation(Budget budget);

}

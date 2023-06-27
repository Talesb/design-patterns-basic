package com.talesb.store.tax;

import java.math.BigDecimal;

import com.talesb.store.budget.Budget;

public class ICMS extends Tax {

	public ICMS(Tax otherTax) {
		super(otherTax);
	}

	public ICMS() {
		super(null);
	}

	@Override
	public BigDecimal performsCalculation(Budget budget) {
		return budget.getValue().multiply(new BigDecimal("0.1"));
	}

}

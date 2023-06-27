package com.talesb.store.tax;

import java.math.BigDecimal;

import com.talesb.store.budget.Budget;

public class ISS extends Tax {

	public ISS(Tax otherTax) {
		super(otherTax);
	}

	public ISS() {
		super(null);
	}

	@Override
	public BigDecimal performsCalculation(Budget budget) {
		return budget.getValue().multiply(new BigDecimal("0.06"));
	}

}

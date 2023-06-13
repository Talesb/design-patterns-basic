package com.talesb.store.tax;

import java.math.BigDecimal;

import com.talesb.store.budget.Budget;

public class TaxCalculator {

	public BigDecimal calculate(Budget budget, TaxType taxtype) {

		switch (taxtype) {
			case ICMS: {
				return budget.getValue().multiply(new BigDecimal("0.1"));
			}
			case ISS: {
				return budget.getValue().multiply(new BigDecimal("0.06"));
			}
			default: {
				return BigDecimal.ZERO;
			}
		}

	}

}

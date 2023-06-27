package com.talesb.store.tax;

import java.math.BigDecimal;

import com.talesb.store.budget.Budget;

public abstract class Tax {

	private Tax otherTax;

	protected Tax(Tax otherTax) {
		super();
		this.otherTax = otherTax;
	}



	public Tax getTax() {
		return otherTax;
	}

 
	public abstract BigDecimal performsCalculation(Budget budget);

	public BigDecimal calculate(Budget budget) {
		BigDecimal currentTaxVal = this.performsCalculation(budget);
		BigDecimal decoratedTax = BigDecimal.ZERO;

		if (otherTax != null) {
			decoratedTax = otherTax.performsCalculation(budget);
		}

		return currentTaxVal.add(decoratedTax);
	}

}

package com.talesb.store.tax;

import java.math.BigDecimal;

import com.talesb.store.budget.Budget;

public class ICMSWithIss implements Tax {

	@Override
	public BigDecimal calculate(Budget budget) {

		BigDecimal icms = new ICMS().calculate(budget);
		BigDecimal iss = new ISS().calculate(budget);
		
		return icms.add(iss);
	}

}

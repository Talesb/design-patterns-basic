package com.talesb.store.tax;

import java.math.BigDecimal;

import com.talesb.store.budget.Budget;

public interface Tax {

	public BigDecimal calculate(Budget budget);

}

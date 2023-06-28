package com.talesb.store;

import java.math.BigDecimal;

import com.talesb.store.budget.Budget;
import com.talesb.store.budget.BudgetItem;
import com.talesb.store.tax.ICMS;
import com.talesb.store.tax.ISS;
import com.talesb.store.tax.TaxCalculator;

public class TaxTest {

	public static void main(String[] args) {

//		Budget budget = new Budget(new BigDecimal("100"));
//		TaxCalculator taxCalculator = new TaxCalculator();
//		System.out.println(taxCalculator.calculate(budget, new ICMS()));

		Budget budget = new Budget();
		BudgetItem b1 = new BudgetItem(new BigDecimal("100"));
		budget.addItem(b1);
		
		TaxCalculator calculator = new TaxCalculator();
		
		System.out.println(calculator.calculate(budget, new ISS(new ICMS())));
		
		
		
	}

}

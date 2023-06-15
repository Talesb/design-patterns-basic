package com.talesb.store;

import java.math.BigDecimal;

import com.talesb.store.budget.Budget;
import com.talesb.store.discount.DiscountCalculator;

public class DiscountTest {

	
	
	
	public static void main(String[] args) {
		
		Budget firstBudget = new Budget(new BigDecimal("200"),6);
		Budget secondBudget = new Budget(new BigDecimal("1000"),1);
		
		
		
		DiscountCalculator calculator = new DiscountCalculator();
		System.out.println(calculator.calculate(firstBudget));
		System.out.println(calculator.calculate(secondBudget));
		
	}
	
	
	
}

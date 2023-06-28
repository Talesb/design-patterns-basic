package com.talesb.store;

import java.math.BigDecimal;

import com.talesb.store.budget.Budget;
import com.talesb.store.budget.BudgetItem;

public class CompositionTests {

	
	public static void main(String[] args) {
		
		Budget oldBudget = new Budget();
		oldBudget.addItem(new BudgetItem(new BigDecimal("200")));
		
		Budget newBudget = new Budget();
		newBudget.addItem(new BudgetItem(new BigDecimal("500")));
		newBudget.addItem(oldBudget);
		
		System.out.println(newBudget.getValue());
		
		
		
		
	}
	
}

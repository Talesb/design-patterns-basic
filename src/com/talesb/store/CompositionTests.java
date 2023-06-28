package com.talesb.store;

import java.math.BigDecimal;

import com.talesb.store.budget.Budget;
import com.talesb.store.budget.BudgetItem;
import com.talesb.store.budget.BudgetProxy;

public class CompositionTests {

	
	public static void main(String[] args) {
		
		Budget oldBudget = new Budget();
		oldBudget.addItem(new BudgetItem(new BigDecimal("200")));
		
		Budget newBudget = new Budget();
		newBudget.addItem(new BudgetItem(new BigDecimal("500")));
		newBudget.addItem(oldBudget);
		
		
		BudgetProxy proxy = new BudgetProxy(newBudget);
		
		System.out.println(proxy.getValue());
		System.out.println(proxy.getValue());
		
		
		
		
	}
	
}

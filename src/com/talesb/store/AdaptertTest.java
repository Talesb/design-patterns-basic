package com.talesb.store;

import java.math.BigDecimal;

import com.talesb.store.adapters.JavaHttpClient;
import com.talesb.store.budget.Budget;
import com.talesb.store.budget.BudgetRegister;

public class AdaptertTest {

	public static void main(String[] args) {

		Budget budget = new Budget(BigDecimal.TEN, 1);
		budget.approve();
		budget.conclude();

		BudgetRegister registerService = new BudgetRegister(new JavaHttpClient());
		registerService.register(budget);

	}

}

package com.talesb.store;

import java.math.BigDecimal;

import com.talesb.store.budget.Budget;
import com.talesb.store.budget.BudgetItem;
import com.talesb.store.discount.DiscountCalculator;

public class DiscountTest {

	public static void main(String[] args) {

		Budget firstBudget = new Budget();
		BudgetItem b1 = new BudgetItem(new BigDecimal("200"));

		BudgetItem b2 = new BudgetItem(new BigDecimal("200"));

		BudgetItem b3 = new BudgetItem(new BigDecimal("200"));

		BudgetItem b4 = new BudgetItem(new BigDecimal("200"));

		BudgetItem b5 = new BudgetItem(new BigDecimal("200"));

		BudgetItem b6 = new BudgetItem(new BigDecimal("200"));

		firstBudget.addItem(b1);
		firstBudget.addItem(b2);
		firstBudget.addItem(b3);
		firstBudget.addItem(b4);
		firstBudget.addItem(b5);
		firstBudget.addItem(b6);

		Budget secondBudget = new Budget();

		BudgetItem bs1 = new BudgetItem(new BigDecimal("1000"));
		secondBudget.addItem(bs1);

		DiscountCalculator calculator = new DiscountCalculator();
		System.out.println(calculator.calculate(firstBudget));
		System.out.println(calculator.calculate(secondBudget));

	}

}

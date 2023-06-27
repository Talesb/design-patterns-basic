package com.talesb.store.budget;

import java.math.BigDecimal;

import com.talesb.store.budget.situation.Analyzing;
import com.talesb.store.budget.situation.BudgetSituation;
import com.talesb.store.budget.situation.Finished;

public class Budget {

	private BigDecimal value;
	private int itemQuantity;
	private BudgetSituation budgetSituation;

	public Budget(BigDecimal value, int itemQuantity) {
		super();
		this.value = value;
		this.itemQuantity = itemQuantity;
		this.budgetSituation = new Analyzing();
	}

	public int getItemQuantity() {
		return itemQuantity;
	}

	public void setItemQuantity(int itemQuantity) {
		this.itemQuantity = itemQuantity;
	}

	public Budget(BigDecimal value) {
		super();
		this.value = value;
	}

	public BigDecimal getValue() {
		return value;
	}

	public void applyExtraDiscount() {
		this.value.subtract(this.budgetSituation.calculateExtraDiscount(this));
	}

	public void approve() {
		this.budgetSituation.approve(this);
	}

	public void dispapprove() {
		this.budgetSituation.disapprove(this);
	}

	public void conclude() {
		this.budgetSituation.conclude(this);
	}

	public BudgetSituation getBudgetSituation() {
		return budgetSituation;
	}

	public void setBudgetSituation(BudgetSituation budgetSituation) {
		this.budgetSituation = budgetSituation;
	}

	public boolean isFinished() {
		return budgetSituation instanceof Finished;
	}

}

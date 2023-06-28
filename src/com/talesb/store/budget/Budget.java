package com.talesb.store.budget;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.talesb.store.budget.situation.Analyzing;
import com.talesb.store.budget.situation.BudgetSituation;
import com.talesb.store.budget.situation.Finished;

public class Budget {

	private BigDecimal value;
	private List<BudgetItem> items;
	private BudgetSituation budgetSituation;

	public Budget(BigDecimal value, int itemQuantity) {
		super();
		this.value = BigDecimal.ZERO;
		this.items = new ArrayList<>();
		this.budgetSituation = new Analyzing();
	}

	public int getItemQuantity() {
		return this.items.size();
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

	public void addItem(BudgetItem item) {
		this.value = value.add(item.getValue());
		this.items.add(item);
	}

}

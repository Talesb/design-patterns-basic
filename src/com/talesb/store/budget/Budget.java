package com.talesb.store.budget;

import java.math.BigDecimal;

public class Budget {

	private BigDecimal value;
	private int itemQuantity;
	private String budgetSituation;

	public Budget(BigDecimal value, int itemQuantity) {
		super();
		this.value = value;
		this.itemQuantity = itemQuantity;
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
		BigDecimal extraDiscountValue = BigDecimal.ZERO;
		if (this.budgetSituation.equals("ANALYZING")) {
			extraDiscountValue = new BigDecimal("0.05");
		} else if (this.budgetSituation.equals("APPROVED")) {
			extraDiscountValue = new BigDecimal("0.02");
		}
		this.value = this.value.subtract(this.value.multiply(extraDiscountValue));
	}

	public void aprove() {
		this.budgetSituation = "APPROVED";
	}

}

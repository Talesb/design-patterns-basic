package com.talesb.store.budget;

import java.math.BigDecimal;

public class Budget {
	
	private BigDecimal value;
	private int itemQuantity;
	
	
	
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
 

}

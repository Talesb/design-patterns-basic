package com.talesb.store;

import java.math.BigDecimal;

import com.talesb.store.order.GenerateOrder;

public class OrderTest {

	public static void main(String[] args) {

		String customer = args[0];
		BigDecimal budgetValue = new BigDecimal(args[1]);
		int budgetItemQuantity = Integer.parseInt(args[2]);
 

		GenerateOrder generateOrder = new GenerateOrder(customer, budgetValue, budgetItemQuantity);

		generateOrder.doExecute();
		
	}

}

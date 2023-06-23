package com.talesb.store;

import java.math.BigDecimal;
import java.util.Arrays;

import com.talesb.store.actions.SaveOrderInDataBase;
import com.talesb.store.actions.SendOrderEmail;
import com.talesb.store.order.GenerateOrder;
import com.talesb.store.order.GenerateOrderHandler;

public class OrderTest {

	public static void main(String[] args) {

		String customer = "Talesb";
		BigDecimal budgetValue = new BigDecimal("600");
		int budgetItemQuantity = 4;

		GenerateOrder generateOrder = new GenerateOrder(customer, budgetValue, budgetItemQuantity);

		GenerateOrderHandler handler = new GenerateOrderHandler(
				Arrays.asList(new SendOrderEmail(), new SaveOrderInDataBase()));
		handler.doExecute(generateOrder);

	}

}

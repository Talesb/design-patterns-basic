package com.talesb.store;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.talesb.store.actions.SaveOrderInDataBase;
import com.talesb.store.actions.SendOrderEmail;
import com.talesb.store.budget.BudgetItem;
import com.talesb.store.budget.Budgetable;
import com.talesb.store.order.GenerateOrder;
import com.talesb.store.order.GenerateOrderHandler;

public class OrderTest {

	public static void main(String[] args) {

		String customer = "Talesb";
		
		BudgetItem b1 = new BudgetItem(new BigDecimal("600"));
		BudgetItem b2 = new BudgetItem(new BigDecimal("600"));
		BudgetItem b3 = new BudgetItem(new BigDecimal("600"));
		BudgetItem b4 = new BudgetItem(new BigDecimal("600"));

		List<Budgetable> items = new ArrayList<>();
		
		items.add(b1);
		items.add(b2);
		items.add(b3);
		items.add(b4);
 

		GenerateOrder generateOrder = new GenerateOrder(customer, items);

		GenerateOrderHandler handler = new GenerateOrderHandler(
				Arrays.asList(new SendOrderEmail(), new SaveOrderInDataBase()));
		handler.doExecute(generateOrder);

	}

}

package com.talesb.store;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.talesb.store.budget.Budget;
import com.talesb.store.order.Order;

public class OrderTest {

	public static void main(String[] args) {

		Budget budget = new Budget(new BigDecimal("600"), 4);
		String customerName = "Talesb";
		LocalDateTime orderDate = LocalDateTime.now();
		
		Order order = new Order(customerName, orderDate, budget);
		
		
		//Call a repository to save
		System.out.println("Saving infos...");
		
		//Call a email service
		System.out.println("Sending a Email..");
		
		

	}

}

package com.talesb.store.actions;

import com.talesb.store.order.Order;

public class SaveOrderInDataBase {

	public void doExecute(Order order) {
		System.out.println("Saving order in database");
	}

}

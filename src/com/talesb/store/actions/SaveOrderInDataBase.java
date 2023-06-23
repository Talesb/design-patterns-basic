package com.talesb.store.actions;

import com.talesb.store.order.Order;
import com.talesb.store.order.actions.AfterOrderActions;

public class SaveOrderInDataBase implements AfterOrderActions{

	public void doExecute(Order order) {
		System.out.println("Saving order in database");
	}

}

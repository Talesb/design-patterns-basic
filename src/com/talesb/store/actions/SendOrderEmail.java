package com.talesb.store.actions;

import com.talesb.store.order.Order;
import com.talesb.store.order.actions.AfterOrderActions;

public class SendOrderEmail implements AfterOrderActions{

	public void doExecute(Order order) {
		System.out.println("Sendig email to: " + order.getCustomerName());
	}

}

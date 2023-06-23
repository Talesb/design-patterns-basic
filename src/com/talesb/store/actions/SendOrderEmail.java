package com.talesb.store.actions;

import com.talesb.store.order.Order;

public class SendOrderEmail {

	public void doExecute(Order order) {
		System.out.println("Sendig email to: " + order.getCustomerName());
	}

}

package com.talesb.store.order.actions;

import com.talesb.store.order.Order;

public interface AfterOrderActions {

	void doExecute(Order order);

}

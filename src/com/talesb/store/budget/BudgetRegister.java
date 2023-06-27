package com.talesb.store.budget;

import java.util.Map;

import com.talesb.store.adapters.HttpAdapter;
import com.talesb.store.budget.exception.DomainException;

public class BudgetRegister {
	private HttpAdapter httpAdapter;

	public BudgetRegister(HttpAdapter httpAdapter) {
		super();
		this.httpAdapter = httpAdapter;
	}

	public void register(Budget budget) {

		if (!budget.isFinished()) {
			throw new DomainException("Can't register unfinished budget");
		}

		this.httpAdapter.post("https://foo.bar/budget", Map.of("value", budget.getValue(), "itemQuantity", budget.getItemQuantity()));

	}

}

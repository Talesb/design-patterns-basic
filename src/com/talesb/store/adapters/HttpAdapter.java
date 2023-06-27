package com.talesb.store.adapters;

import java.util.Map;

public interface HttpAdapter {

	void post(String url, Map<String, Object> data);

}

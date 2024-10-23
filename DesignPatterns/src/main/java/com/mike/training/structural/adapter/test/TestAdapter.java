package com.mike.training.structural.adapter.test;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.mike.training.structural.adapter.DataAnalysisAdapter;
import com.mike.training.structural.adapter.util.StorageType;

/**
 * Functional test to verify the working of adapter design pattern
 * 
 * @author Lalit Mehra
 *
 */
public class TestAdapter {
	public static void main(String[] args) {
		DataAnalysisAdapter adapter = new DataAnalysisAdapter();
		Map<String, String> data = new HashMap<>();
		data.put("1", "Being Awesome!");
		Set<String> searchKeys = data.keySet();
		
		try {
			adapter.store(StorageType.FILE, data);
			System.out.println();
			adapter.store(StorageType.ELASTIC, data);
			System.out.println();
			adapter.fetch(StorageType.FILE, searchKeys);
			System.out.println();
			adapter.fetch(StorageType.ELASTIC, searchKeys);
		} catch(Exception e) {
			// handle exception
		}
	}
}

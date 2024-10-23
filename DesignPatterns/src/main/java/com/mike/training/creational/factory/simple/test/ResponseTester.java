package com.mike.training.creational.factory.simple.test;

import com.mike.training.creational.factory.Order;
import com.mike.training.creational.factory.ProcessResult;
import com.mike.training.creational.factory.ResponseType;
import com.mike.training.creational.factory.simple.Response;
import com.mike.training.creational.factory.simple.ResponseGenerator;

/**
 * @author Lalit Mehra
 *
 */
public class ResponseTester {
	
	public static void main(String[] args) {
		ResponseGenerator generator = new ResponseGenerator();
		
		Order order1 = new Order();
		ProcessResult result1 = new ProcessResult("101", order1 , "200");
		
		Order order2 = new Order();
		ProcessResult result2 = new ProcessResult("102", order2 , "400");
		
		Order order3 = new Order();
		ProcessResult result3 = new ProcessResult("103", order3 , "100");
		
		Response resp1 = generator.prepareResponse(result1, ResponseType.SUCCESS);
		System.out.println();
		Response resp2 = generator.prepareResponse(result2, ResponseType.FAILURE);
		System.out.println();
		Response resp3 = generator.prepareResponse(result3, ResponseType.TIMEOUT);
		
	}

}
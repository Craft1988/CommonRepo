package com.mike.training.creational.factory.simple.bean;

import com.mike.training.creational.factory.ProcessResult;
import com.mike.training.creational.factory.simple.Response;

/**
 * @author Lalit Mehra
 *
 */
public class Failure extends Response {

	public Failure(ProcessResult result) {
		super(result);
	}

	@Override
	public void process() {
		System.out.println("process failure information");
	}
}

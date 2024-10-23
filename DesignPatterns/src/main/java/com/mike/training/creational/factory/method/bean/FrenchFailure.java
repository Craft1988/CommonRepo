package com.mike.training.creational.factory.method.bean;

import com.mike.training.creational.factory.ProcessResult;
import com.mike.training.creational.factory.method.Response;

/**
 * @author Lalit Mehra
 *
 */
public class FrenchFailure extends Response {

	public FrenchFailure(ProcessResult result) {
		super(result);
	}

	@Override
	public void process() {
		System.out.println("process failure information");
	}
	
	@Override
	public void convert() {
		System.out.println("convert response to french dialect");
	}

}

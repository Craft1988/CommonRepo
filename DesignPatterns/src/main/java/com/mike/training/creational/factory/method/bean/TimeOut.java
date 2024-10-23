package com.mike.training.creational.factory.method.bean;

import com.mike.training.creational.factory.ProcessResult;
import com.mike.training.creational.factory.method.Response;

/**
 * @author Lalit Mehra
 *
 */
public class TimeOut extends Response {

	public TimeOut(ProcessResult result) {
		super(result);
	}

	@Override
	public void convert() {
		System.out.println("conversion not required");
	}

}

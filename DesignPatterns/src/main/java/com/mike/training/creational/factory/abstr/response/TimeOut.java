package com.mike.training.creational.factory.abstr.response;

import com.mike.training.creational.factory.ProcessResult;
import com.mike.training.creational.factory.abstr.Response;

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

	@Override
	public void setup() {
		System.out.println("setup not required");
	}

}

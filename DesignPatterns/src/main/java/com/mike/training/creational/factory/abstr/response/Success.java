package com.mike.training.creational.factory.abstr.response;

import com.mike.training.creational.factory.ProcessResult;
import com.mike.training.creational.factory.abstr.Response;

/**
 * @author Lalit Mehra
 *
 */
public class Success extends Response {

	public Success(ProcessResult result) {
		super(result);
	}

	@Override
	public void process() {
		System.out.println("process success information");
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

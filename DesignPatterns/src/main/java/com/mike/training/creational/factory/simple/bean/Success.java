package com.mike.training.creational.factory.simple.bean;

import com.mike.training.creational.factory.ProcessResult;
import com.mike.training.creational.factory.simple.Response;

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

}

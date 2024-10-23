package com.mike.training.creational.factory.method.bean;

import com.mike.training.creational.factory.ProcessResult;
import com.mike.training.creational.factory.method.Response;

/**
 * @author Lalit Mehra
 *
 */
public class FrenchTimeOut extends Response {

	public FrenchTimeOut(ProcessResult result) {
		super(result);
	}

	@Override
	public void convert() {
		System.out.println("convert response to french dialect");
	}

}

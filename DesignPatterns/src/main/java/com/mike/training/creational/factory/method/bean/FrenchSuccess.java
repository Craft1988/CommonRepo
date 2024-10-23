package com.mike.training.creational.factory.method.bean;

import com.mike.training.creational.factory.ProcessResult;
import com.mike.training.creational.factory.method.Response;
import com.mike.training.creational.factory.abstr.Converter;
import com.mike.training.creational.factory.abstr.impl.FrenchDialectConverter;

/**
 * @author Lalit Mehra
 *
 */
public class FrenchSuccess extends Response {
	
	Converter converter = new FrenchDialectConverter();
	
	public FrenchSuccess(ProcessResult result) {
		super(result);
	}

	@Override
	public void process() {
		System.out.println("process success information");
	}

	@Override
	public void convert() {
		System.out.println("convert response to french dialect");
		response = converter.convert(result.getOrder().getNotes());
	}
	
}

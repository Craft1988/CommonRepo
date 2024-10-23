package com.mike.training.creational.factory.abstr.response;

import com.mike.training.creational.factory.ProcessResult;
import com.mike.training.creational.factory.abstr.Response;
import com.mike.training.creational.factory.abstr.ResponseDialectFactory;

/**
 * @author Lalit Mehra
 *
 */
public class FrenchFailure extends Response {

	private ResponseDialectFactory factory;

	public FrenchFailure(ProcessResult result, ResponseDialectFactory factory) {
		super(result);
		this.factory = factory;
	}

	@Override
	public void setup() {
		System.out.println("setup french dialect");
		formatter = factory.getFormatter();
		converter = factory.getConverter();
		reader = factory.getReader();
	}

	@Override
	public void convert() {
		System.out.println("convert response to french dialect");
		converter.convert(result.getOrder().getNotes());
	}

	@Override
	public void read() {
		this.message = reader.read(result);
	}

	@Override
	public void format() {
		System.out.println("convert response to " + formatter.whichFormat());
		response = formatter.format(result.getOrder().getNotes());
	}

}

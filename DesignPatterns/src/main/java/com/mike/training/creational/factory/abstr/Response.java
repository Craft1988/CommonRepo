package com.mike.training.creational.factory.abstr;

import com.mike.training.creational.factory.Message;
import com.mike.training.creational.factory.ProcessResult;

/**
 * @author Lalit Mehra
 *
 */
public abstract class Response {
	
	protected Message message;
	protected ProcessResult result;
	protected Formatter formatter;
	protected Converter converter;
	protected Reader reader;
	
	protected String response;
	
	protected Response(ProcessResult result) {
		this.result = result;
		this.message = new Message();
	}
	
	public abstract void setup();
	
	public void read() {
		message.extract(result);
	}

	public void process() {
		System.out.println("process data before formatting");
	}
	
	public abstract void convert();
	
	public void format() {
		System.out.println("convert response to json format");
	}

}

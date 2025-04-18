package com.mike.training.creational.factory.method;

import com.mike.training.creational.factory.Message;
import com.mike.training.creational.factory.ProcessResult;
import com.mike.training.creational.factory.abstr.Formatter;
import com.mike.training.creational.factory.abstr.impl.JsonFormatter;

/**
 * @author Lalit Mehra
 *
 */
public abstract class Response {
	
	protected Message message;
	protected ProcessResult result;
	
	protected Formatter formatter;
	protected String response;
	
	protected Response(ProcessResult result) {
		this.result = result;
		this.message = new Message();
		this.formatter = new JsonFormatter();
	}
	
	public void read() {
		message.extract(result);
	}

	public void process() {
		System.out.println("process data before formatting");
	}
	
	public abstract void convert();
	
	public void format() {
		System.out.println("convert response to json format");
		formatter.format(response);
	}

}

package com.mike.training.creational.factory.simple;

import com.mike.training.creational.factory.ProcessResult;
import com.mike.training.creational.factory.ResponseType;

/**
 * @author Lalit Mehra
 *
 */
public class ResponseGenerator {

	private ResponseFactory factory = new ResponseFactory();

	public Response prepareResponse(ProcessResult result, ResponseType type) {
		Response resp = factory.construct(result, type);

		resp.read();
		resp.process();
		resp.format();

		return resp;
	}

}

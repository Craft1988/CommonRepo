package com.mike.training.creational.factory.abstr;

import com.mike.training.creational.factory.ProcessResult;
import com.mike.training.creational.factory.ResponseType;

/**
 * @author Lalit Mehra
 *
 */
public abstract class ResponseGenerator {

	public Response prepareResponse(ProcessResult result, ResponseType type) {
		Response resp = construct(result, type);

		resp.setup();
		resp.read();
		resp.process();
		resp.convert();
		resp.format();

		return resp;
	}
	
	protected abstract Response construct(ProcessResult result, ResponseType type);

}

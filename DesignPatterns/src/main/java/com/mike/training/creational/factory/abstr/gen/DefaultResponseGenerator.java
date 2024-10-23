package com.mike.training.creational.factory.abstr.gen;

import com.mike.training.creational.factory.ProcessResult;
import com.mike.training.creational.factory.ResponseType;
import com.mike.training.creational.factory.abstr.Response;
import com.mike.training.creational.factory.abstr.ResponseGenerator;
import com.mike.training.creational.factory.abstr.response.Failure;
import com.mike.training.creational.factory.abstr.response.Success;
import com.mike.training.creational.factory.abstr.response.TimeOut;

/**
 * @author Lalit Mehra
 *
 */
public class DefaultResponseGenerator extends ResponseGenerator {

	public Response construct(ProcessResult result, ResponseType type) {
		Response resp = null;
		switch (type) {
		case SUCCESS:
			resp = new Success(result);
			break;
		case FAILURE:
			resp = new Failure(result);
			break;
		case TIMEOUT:
			resp = new TimeOut(result);
			break;
		default:
			break;
		}
		return resp;
	}

}

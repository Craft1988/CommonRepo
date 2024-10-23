package com.mike.training.creational.factory.method;

import com.mike.training.creational.factory.ProcessResult;
import com.mike.training.creational.factory.ResponseType;
import com.mike.training.creational.factory.method.bean.Failure;
import com.mike.training.creational.factory.method.bean.Success;
import com.mike.training.creational.factory.method.bean.TimeOut;

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

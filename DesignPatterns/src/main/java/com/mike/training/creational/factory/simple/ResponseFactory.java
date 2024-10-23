package com.mike.training.creational.factory.simple;

import com.mike.training.creational.factory.ProcessResult;
import com.mike.training.creational.factory.ResponseType;
import com.mike.training.creational.factory.simple.bean.Failure;
import com.mike.training.creational.factory.simple.bean.Success;
import com.mike.training.creational.factory.simple.bean.TimeOut;

/**
 * @author Lalit Mehra
 *
 */
public class ResponseFactory {

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

package com.mike.training.creational.factory.method;

import com.mike.training.creational.factory.ProcessResult;
import com.mike.training.creational.factory.ResponseType;
import com.mike.training.creational.factory.method.bean.FrenchFailure;
import com.mike.training.creational.factory.method.bean.FrenchSuccess;
import com.mike.training.creational.factory.method.bean.FrenchTimeOut;

/**
 * @author Lalit Mehra
 *
 */
public class FrenchResponseGenerator extends ResponseGenerator {

	public Response construct(ProcessResult result, ResponseType type) {
		Response resp = null;
		switch (type) {
		case SUCCESS:
			resp = new FrenchSuccess(result);
			break;
		case FAILURE:
			resp = new FrenchFailure(result);
			break;
		case TIMEOUT:
			resp = new FrenchTimeOut(result);
			break;
		default:
			break;
		}
		return resp;
	}

}

package com.mike.training.creational.factory.abstr.gen;

import com.mike.training.creational.factory.ProcessResult;
import com.mike.training.creational.factory.ResponseType;
import com.mike.training.creational.factory.abstr.Response;
import com.mike.training.creational.factory.abstr.ResponseGenerator;
import com.mike.training.creational.factory.abstr.dialect.FrenchDialectFactory;
import com.mike.training.creational.factory.abstr.response.FrenchFailure;
import com.mike.training.creational.factory.abstr.response.FrenchSuccess;
import com.mike.training.creational.factory.abstr.response.FrenchTimeOut;
import com.mike.training.creational.factory.abstr.ResponseDialectFactory;

/**
 * @author Lalit Mehra
 *
 */
public class FrenchResponseGenerator extends ResponseGenerator {
	
	private ResponseDialectFactory dialect = new FrenchDialectFactory();

	public Response construct(ProcessResult result, ResponseType type) {
		Response resp = null;
		switch (type) {
		case SUCCESS:
			resp = new FrenchSuccess(result, dialect);
			break;
		case FAILURE:
			resp = new FrenchFailure(result, dialect);
			break;
		case TIMEOUT:
			resp = new FrenchTimeOut(result, dialect);
			break;
		default:
			break;
		}
		return resp;
	}

}

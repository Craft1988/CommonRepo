package com.mike.training.creational.factory.abstr.gen;

import com.mike.training.creational.factory.abstr.ResponseGenerator;
import com.mike.training.creational.factory.abstr.dialect.GermanDialectFactory;
import com.mike.training.creational.factory.abstr.response.GermanFailure;
import com.mike.training.creational.factory.abstr.response.GermanSuccess;
import com.mike.training.creational.factory.abstr.response.GermanTimeOut;
import com.mike.training.creational.factory.ProcessResult;
import com.mike.training.creational.factory.ResponseType;
import com.mike.training.creational.factory.abstr.Response;
import com.mike.training.creational.factory.abstr.ResponseDialectFactory;

/**
 * @author Lalit Mehra
 *
 */
public class GermanResponseGenerator extends ResponseGenerator {

	private ResponseDialectFactory dialect = new GermanDialectFactory();

	public Response construct(ProcessResult result, ResponseType type) {
		Response resp = null;
		switch (type) {
		case SUCCESS:
			resp = new GermanSuccess(result, dialect);
			break;
		case FAILURE:
			resp = new GermanFailure(result, dialect);
			break;
		case TIMEOUT:
			resp = new GermanTimeOut(result, dialect);
			break;
		default:
			break;
		}
		return resp;
	}

//	public static void main(String[] args) {
//		try {
//			Float f1 = new Float("3.0");
//			int x = f1.intValue();
//			byte b = f1.byteValue();
//			double d = f1.doubleValue();
//			System.out.println(x + b + d);
//		} catch (NumberFormatException e) {
//			System.out.println("bad number");
//		}
//	}

}

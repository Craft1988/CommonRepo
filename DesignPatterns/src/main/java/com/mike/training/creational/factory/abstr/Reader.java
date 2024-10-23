package com.mike.training.creational.factory.abstr;

import com.mike.training.creational.factory.Message;
import com.mike.training.creational.factory.ProcessResult;

/**
 * @author Lalit Mehra
 *
 */
public interface Reader {

	public Message read(ProcessResult result);
	
}

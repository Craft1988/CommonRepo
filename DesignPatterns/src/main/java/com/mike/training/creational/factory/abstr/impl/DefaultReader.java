package com.mike.training.creational.factory.abstr.impl;

import com.mike.training.creational.factory.Message;
import com.mike.training.creational.factory.ProcessResult;
import com.mike.training.creational.factory.abstr.Reader;

/**
 * @author Lalit Mehra
 *
 */
public class DefaultReader implements Reader {

	@Override
	public Message read(ProcessResult result) {
		return new Message();
	}

}

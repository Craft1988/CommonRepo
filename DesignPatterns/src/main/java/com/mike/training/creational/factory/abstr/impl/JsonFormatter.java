package com.mike.training.creational.factory.abstr.impl;

import com.mike.training.creational.factory.abstr.Formatter;

/**
 * @author Lalit Mehra
 *
 */
public class JsonFormatter implements Formatter {

	@Override
	public String format(String message) {
		return "";
	}

	@Override
	public String whichFormat() {
		return "JSON";
	}

}

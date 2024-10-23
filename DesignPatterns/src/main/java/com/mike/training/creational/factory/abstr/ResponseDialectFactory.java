package com.mike.training.creational.factory.abstr;

/**
 * @author Lalit Mehra
 *
 */
public interface ResponseDialectFactory {
	
	public Formatter getFormatter();
	
	public Converter getConverter();
	
	public Reader getReader();

}

package com.mike.training.creational.factory.abstr.dialect;

import com.mike.training.creational.factory.abstr.Converter;
import com.mike.training.creational.factory.abstr.Formatter;
import com.mike.training.creational.factory.abstr.Reader;
import com.mike.training.creational.factory.abstr.ResponseDialectFactory;
import com.mike.training.creational.factory.abstr.impl.DefaultReader;
import com.mike.training.creational.factory.abstr.impl.GermanDialectConverter;
import com.mike.training.creational.factory.abstr.impl.XMLFormatter;

/**
 * @author Lalit Mehra
 *
 */
public class FrenchDialectFactory implements ResponseDialectFactory {

	@Override
	public Formatter getFormatter() {
		return new XMLFormatter();
	}

	@Override
	public Converter getConverter() {
		return new GermanDialectConverter();
	}

	@Override
	public Reader getReader() {
		return new DefaultReader();
	}

}

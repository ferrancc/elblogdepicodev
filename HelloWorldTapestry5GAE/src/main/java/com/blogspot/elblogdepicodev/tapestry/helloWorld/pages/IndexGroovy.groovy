package com.blogspot.elblogdepicodev.tapestry.helloWorld.pages

import org.apache.tapestry5.SymbolConstants;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.apache.tapestry5.ioc.annotations.Symbol;

class IndexGroovy {

	@Inject
	@Symbol(SymbolConstants.TAPESTRY_VERSION)
	@Property
	private String tapestryVersion;
}
package com.commafeed.backend.rome;

import org.jdom2.Document;
import org.jdom2.Element;

import com.rometools.opml.io.impl.OPML10Parser;

/**
 * Support for OPML 1.1 parsing
 * 
 */
public class OPML11Parser extends OPML10Parser {

	public OPML11Parser() {
		super("opml_1.1");
	}

	@Override
	public boolean isMyType(Document document) {
		Element e = document.getRootElement();

		if (e.getName().equals("opml")) {
			return true;
		}

		return false;

	};
}

package mx.org.asa.ivr.manejadorxml.krmenugo.datos;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.XMLFilterImpl;

public class NamespaceFilter extends XMLFilterImpl {

	private static final String NAMESPACE = "http://www.w3.org/2001/XMLSchema-instance";

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		super.endElement(NAMESPACE, localName, qName);
	}

	@Override
	public void startElement(String uri, String localName, String qName, Attributes atts) throws SAXException {
		super.startElement(NAMESPACE, localName, qName, atts);
	}

}
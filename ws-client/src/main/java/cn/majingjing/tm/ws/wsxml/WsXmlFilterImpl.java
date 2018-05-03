package cn.majingjing.tm.ws.wsxml;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.XMLFilterImpl;

/**
 * Created by Jingjing.Ma on 2018/5/3 11:34
 */
public class WsXmlFilterImpl extends XMLFilterImpl {

    private boolean ignoreNamespace = true;

    @Override
    public void startDocument() throws SAXException {
        super.startDocument();
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes atts) throws SAXException {
        if (this.ignoreNamespace) uri = "";
        super.startElement(uri, localName, qName, atts);
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if (this.ignoreNamespace) uri = "";
        super.endElement(uri, localName, localName);
    }

    @Override
    public void startPrefixMapping(String prefix, String url) throws SAXException {
        if (!this.ignoreNamespace) super.startPrefixMapping("", url);
    }
}

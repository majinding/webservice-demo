package cn.majingjing.tm.ws.wsxml;

import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLFilterImpl;
import org.xml.sax.helpers.XMLReaderFactory;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.sax.SAXSource;
import java.io.StringReader;

/**
 * webservice-xml解析
 * Created by Jingjing.Ma on 2018/5/3 11:02
 * @see cn.majingjing.tm.ws.util.WsXmlUtils
 */
@Deprecated
public class WsXmlUtil {

    public static <T> T toObject(Class<T> valueType, String xml) {
        try {
            System.out.println(xml);
            JAXBContext context = JAXBContext.newInstance(valueType);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            XMLReader reader = XMLReaderFactory.createXMLReader();
            XMLFilterImpl nsfFilter = new WsXmlFilterImpl();
            nsfFilter.setParent(reader);
            InputSource input = new InputSource(new StringReader(xml));
            SAXSource source = new SAXSource(nsfFilter, input);
            return (T) unmarshaller.unmarshal(source);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

}

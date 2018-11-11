package sg;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPHeaderElement;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Set;

public class MySoapHandler implements SOAPHandler<SOAPMessageContext> {

	private static Logger log = LoggerFactory.getLogger(MySoapHandler.class);

	@Override
	public boolean handleFault(SOAPMessageContext context) {
		System.out.println("run handleFault method!");
		return false;
	}

	@Override
	public boolean handleMessage(SOAPMessageContext context) {
		System.out.println("run handleMessage method!");
		Boolean out = (Boolean) context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);

		ByteArrayOutputStream baout = new ByteArrayOutputStream();
		try {
			SOAPMessage message = context.getMessage();
			message.writeTo(baout);
			if (out) {

				SOAPHeader hdr = message.getSOAPHeader();



				QName name = new QName("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", "Security", "wsse");
				SOAPHeaderElement header = hdr.addHeaderElement(name);

				SOAPElement UsernameToken = header.addChildElement("UsernameToken", "wsse");

				SOAPElement userElement = UsernameToken.addChildElement("Username", "wsse");
				userElement.addTextNode("bps");
				SOAPElement passElement = UsernameToken.addChildElement("Password", "wsse");
				passElement.addTextNode("000000");

				QName name2 = new QName("http://www.primeton.com/BPS", "Header", "bps");
				SOAPHeaderElement header2 = hdr.addHeaderElement(name2);

				SOAPElement tenantID = header2.addChildElement("TenantID", "bps");
				tenantID.addTextNode("tenantID");

				message.saveChanges();


				log.info("响应报文：\n{}\n" , baout.toString());
			} else {
				log.info("请求报文：\n{}\n" , baout.toString());
			}

		} catch (Exception e1) {
			log.error("解析报文出错：\n{}\n");
		} finally {
			if(baout != null) {
				try {
					baout.close();
				} catch (IOException e) {
				}
			}
		}

		return true;
	}

	@Override
	public void close(MessageContext context) {
		System.out.println("run close method!---------");
		System.out.println(context);
		System.out.println("run close method!");
	}

	@Override
	public Set<QName> getHeaders() {
		return null;
	}
}

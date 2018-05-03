package cn.majingjing.tm.ws.handler;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPHeaderElement;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;
import java.util.Set;

/**
 * Created by Jingjing.Ma on 2018/5/3 9:40
 */
public class MyHeaderHandler implements SOAPHandler<SOAPMessageContext> {

    public boolean handleMessage(SOAPMessageContext ctx) {

//<soapenv:Header>
//    <wsse:Security xmlns:wsse="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd" soapenv:mustUnderstand="0">
//        <wsse:UsernameToken xmlns:wsu="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd" wsu:Id="UsernameToken-1815911473">
//            <wsse:Username>bps</wsse:Username>
//            <wsse:Password Type="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-username-token-profile-1.0#PasswordText">000000</wsse:Password>
//        </wsse:UsernameToken>
//    </wsse:Security>
//    <bps:Header xmlns:bps="http://www.primeton.com/BPS" soapenv:mustUnderstand="0">
//        <bps:TenantID>tenantID</bps:TenantID>
//    </bps:Header>
//</soapenv:Header>
        try {
            Boolean out = (Boolean) ctx.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
            if (out) {
                SOAPMessage msg = ctx.getMessage();
                SOAPEnvelope env = msg.getSOAPPart().getEnvelope();
                SOAPHeader hdr = env.getHeader();
                if (hdr == null) {
                    hdr = env.addHeader();
                }

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

                msg.saveChanges();
                return true;
            }
        } catch (SOAPException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean handleFault(SOAPMessageContext context) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void close(MessageContext context) {
        // TODO Auto-generated method stub
    }

    @Override
    public Set<QName> getHeaders() {
        // TODO Auto-generated method stub
        return null;
    }
}

package com.mycompany.hr.config;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.ws.WebServiceMessage;
import org.springframework.ws.context.MessageContext;
import org.springframework.ws.server.endpoint.AbstractLoggingInterceptor;

import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.stream.StreamResult;
import java.io.StringWriter;


public class MyPayloadLoggingInterceptor extends AbstractLoggingInterceptor {
    protected transient Log logger = LogFactory.getLog(this.getClass());
    public MyPayloadLoggingInterceptor() {
    }

    protected Source getSource(WebServiceMessage message) {
        return message.getPayloadSource();
    }


    public boolean handleRequest(MessageContext messageContext, Object endpoint) throws TransformerException {




            this.logMessageSource("Request: ", this.getSource(messageContext.getRequest()));

        return true;
    }

    public boolean handleResponse(MessageContext messageContext, Object endpoint) throws Exception {
            this.logMessageSource("Response: ", this.getSource(messageContext.getResponse()));

        return true;
    }

    private Transformer createNonIndentingTransformer() throws TransformerConfigurationException {
        Transformer transformer = this.createTransformer();
        transformer.setOutputProperty("omit-xml-declaration", "yes");
        transformer.setOutputProperty("indent", "no");
        return transformer;
    }

    protected void logMessageSource(String logMessage, Source source) throws TransformerException {
        if (source != null) {
            Transformer transformer = this.createNonIndentingTransformer();
            StringWriter writer = new StringWriter();
            transformer.transform(source, new StreamResult(writer));
            String message = logMessage + writer.toString();
            logger.info(message);
        }

    }

}

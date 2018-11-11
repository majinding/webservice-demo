
package com.mycompany.demo1.definitions;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "demo1PortService", targetNamespace = "http://mycompany.com/demo1/definitions", wsdlLocation = "http://localhost:8080/demo1.wsdl")
public class Demo1PortService
    extends Service
{

    private final static URL DEMO1PORTSERVICE_WSDL_LOCATION;
    private final static WebServiceException DEMO1PORTSERVICE_EXCEPTION;
    private final static QName DEMO1PORTSERVICE_QNAME = new QName("http://mycompany.com/demo1/definitions", "demo1PortService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/demo1.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        DEMO1PORTSERVICE_WSDL_LOCATION = url;
        DEMO1PORTSERVICE_EXCEPTION = e;
    }

    public Demo1PortService() {
        super(__getWsdlLocation(), DEMO1PORTSERVICE_QNAME);
    }

    public Demo1PortService(WebServiceFeature... features) {
        super(__getWsdlLocation(), DEMO1PORTSERVICE_QNAME, features);
    }

    public Demo1PortService(URL wsdlLocation) {
        super(wsdlLocation, DEMO1PORTSERVICE_QNAME);
    }

    public Demo1PortService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, DEMO1PORTSERVICE_QNAME, features);
    }

    public Demo1PortService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Demo1PortService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Demo1Port
     */
    @WebEndpoint(name = "demo1PortSoap11")
    public Demo1Port getDemo1PortSoap11() {
        return super.getPort(new QName("http://mycompany.com/demo1/definitions", "demo1PortSoap11"), Demo1Port.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Demo1Port
     */
    @WebEndpoint(name = "demo1PortSoap11")
    public Demo1Port getDemo1PortSoap11(WebServiceFeature... features) {
        return super.getPort(new QName("http://mycompany.com/demo1/definitions", "demo1PortSoap11"), Demo1Port.class, features);
    }

    private static URL __getWsdlLocation() {
        if (DEMO1PORTSERVICE_EXCEPTION!= null) {
            throw DEMO1PORTSERVICE_EXCEPTION;
        }
        return DEMO1PORTSERVICE_WSDL_LOCATION;
    }

}

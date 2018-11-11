
package com.mycompany.demo1.schemas;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.mycompany.demo1.schemas package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Demo1Response_QNAME = new QName("http://mycompany.com/demo1/schemas", "Demo1Response");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.mycompany.demo1.schemas
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Demo1Request }
     * 
     */
    public Demo1Request createDemo1Request() {
        return new Demo1Request();
    }

    /**
     * Create an instance of {@link Demo1Request.Entry }
     * 
     */
    public Demo1Request.Entry createDemo1RequestEntry() {
        return new Demo1Request.Entry();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mycompany.com/demo1/schemas", name = "Demo1Response")
    public JAXBElement<String> createDemo1Response(String value) {
        return new JAXBElement<String>(_Demo1Response_QNAME, String.class, null, value);
    }

}

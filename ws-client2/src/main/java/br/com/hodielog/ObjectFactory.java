
package br.com.hodielog;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.hodielog package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.hodielog
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ArrayOfItem }
     * 
     */
    public ArrayOfItem createArrayOfItem() {
        return new ArrayOfItem();
    }

    /**
     * Create an instance of {@link Item }
     * 
     */
    public Item createItem() {
        return new Item();
    }

    /**
     * Create an instance of {@link SoapFault }
     * 
     */
    public SoapFault createSoapFault() {
        return new SoapFault();
    }

    /**
     * Create an instance of {@link ReturnData }
     * 
     */
    public ReturnData createReturnData() {
        return new ReturnData();
    }

}

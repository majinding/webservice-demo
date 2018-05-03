
package cn.majingjing.tm.blog.webservice.api;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cn.majingjing.tm.blog.webservice.api package. 
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

    private final static QName _HelloList_QNAME = new QName("http://api.webservice.blog.tm.majingjing.cn/", "helloList");
    private final static QName _HelloListResponse_QNAME = new QName("http://api.webservice.blog.tm.majingjing.cn/", "helloListResponse");
    private final static QName _HelloStr_QNAME = new QName("http://api.webservice.blog.tm.majingjing.cn/", "helloStr");
    private final static QName _HelloObject_QNAME = new QName("http://api.webservice.blog.tm.majingjing.cn/", "helloObject");
    private final static QName _HelloStrResponse_QNAME = new QName("http://api.webservice.blog.tm.majingjing.cn/", "helloStrResponse");
    private final static QName _HelloObjectResponse_QNAME = new QName("http://api.webservice.blog.tm.majingjing.cn/", "helloObjectResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cn.majingjing.tm.blog.webservice.api
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link HelloList }
     * 
     */
    public HelloList createHelloList() {
        return new HelloList();
    }

    /**
     * Create an instance of {@link HelloObject }
     * 
     */
    public HelloObject createHelloObject() {
        return new HelloObject();
    }

    /**
     * Create an instance of {@link HelloStrResponse }
     * 
     */
    public HelloStrResponse createHelloStrResponse() {
        return new HelloStrResponse();
    }

    /**
     * Create an instance of {@link HelloObjectResponse }
     * 
     */
    public HelloObjectResponse createHelloObjectResponse() {
        return new HelloObjectResponse();
    }

    /**
     * Create an instance of {@link HelloListResponse }
     * 
     */
    public HelloListResponse createHelloListResponse() {
        return new HelloListResponse();
    }

    /**
     * Create an instance of {@link HelloStr }
     * 
     */
    public HelloStr createHelloStr() {
        return new HelloStr();
    }

    /**
     * Create an instance of {@link HelloBean }
     * 
     */
    public HelloBean createHelloBean() {
        return new HelloBean();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.webservice.blog.tm.majingjing.cn/", name = "helloList")
    public JAXBElement<HelloList> createHelloList(HelloList value) {
        return new JAXBElement<HelloList>(_HelloList_QNAME, HelloList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.webservice.blog.tm.majingjing.cn/", name = "helloListResponse")
    public JAXBElement<HelloListResponse> createHelloListResponse(HelloListResponse value) {
        return new JAXBElement<HelloListResponse>(_HelloListResponse_QNAME, HelloListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloStr }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.webservice.blog.tm.majingjing.cn/", name = "helloStr")
    public JAXBElement<HelloStr> createHelloStr(HelloStr value) {
        return new JAXBElement<HelloStr>(_HelloStr_QNAME, HelloStr.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.webservice.blog.tm.majingjing.cn/", name = "helloObject")
    public JAXBElement<HelloObject> createHelloObject(HelloObject value) {
        return new JAXBElement<HelloObject>(_HelloObject_QNAME, HelloObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloStrResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.webservice.blog.tm.majingjing.cn/", name = "helloStrResponse")
    public JAXBElement<HelloStrResponse> createHelloStrResponse(HelloStrResponse value) {
        return new JAXBElement<HelloStrResponse>(_HelloStrResponse_QNAME, HelloStrResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloObjectResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.webservice.blog.tm.majingjing.cn/", name = "helloObjectResponse")
    public JAXBElement<HelloObjectResponse> createHelloObjectResponse(HelloObjectResponse value) {
        return new JAXBElement<HelloObjectResponse>(_HelloObjectResponse_QNAME, HelloObjectResponse.class, null, value);
    }

}

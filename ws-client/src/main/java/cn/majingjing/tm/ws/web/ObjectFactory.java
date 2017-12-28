
package cn.majingjing.tm.ws.web;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cn.majingjing.tm.ws.web package. 
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

    private final static QName _Hello2Response_QNAME = new QName("http://web.ws.tm.majingjing.cn/", "hello2Response");
    private final static QName _Hello1Response_QNAME = new QName("http://web.ws.tm.majingjing.cn/", "hello1Response");
    private final static QName _Hello2_QNAME = new QName("http://web.ws.tm.majingjing.cn/", "hello2");
    private final static QName _USERNAME_QNAME = new QName("http://web.ws.tm.majingjing.cn/", "USERNAME");
    private final static QName _QueryData_QNAME = new QName("http://web.ws.tm.majingjing.cn/", "queryData");
    private final static QName _Hello1_QNAME = new QName("http://web.ws.tm.majingjing.cn/", "hello1");
    private final static QName _QueryDataResponse_QNAME = new QName("http://web.ws.tm.majingjing.cn/", "queryDataResponse");
    private final static QName _PASSWORD_QNAME = new QName("http://web.ws.tm.majingjing.cn/", "PASSWORD");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cn.majingjing.tm.ws.web
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Hello1 }
     * 
     */
    public Hello1 createHello1() {
        return new Hello1();
    }

    /**
     * Create an instance of {@link QueryDataResponse }
     * 
     */
    public QueryDataResponse createQueryDataResponse() {
        return new QueryDataResponse();
    }

    /**
     * Create an instance of {@link QueryData }
     * 
     */
    public QueryData createQueryData() {
        return new QueryData();
    }

    /**
     * Create an instance of {@link Hello2 }
     * 
     */
    public Hello2 createHello2() {
        return new Hello2();
    }

    /**
     * Create an instance of {@link Hello1Response }
     * 
     */
    public Hello1Response createHello1Response() {
        return new Hello1Response();
    }

    /**
     * Create an instance of {@link Hello2Response }
     * 
     */
    public Hello2Response createHello2Response() {
        return new Hello2Response();
    }

    /**
     * Create an instance of {@link HelloBean }
     * 
     */
    public HelloBean createHelloBean() {
        return new HelloBean();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello2Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web.ws.tm.majingjing.cn/", name = "hello2Response")
    public JAXBElement<Hello2Response> createHello2Response(Hello2Response value) {
        return new JAXBElement<Hello2Response>(_Hello2Response_QNAME, Hello2Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello1Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web.ws.tm.majingjing.cn/", name = "hello1Response")
    public JAXBElement<Hello1Response> createHello1Response(Hello1Response value) {
        return new JAXBElement<Hello1Response>(_Hello1Response_QNAME, Hello1Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web.ws.tm.majingjing.cn/", name = "hello2")
    public JAXBElement<Hello2> createHello2(Hello2 value) {
        return new JAXBElement<Hello2>(_Hello2_QNAME, Hello2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web.ws.tm.majingjing.cn/", name = "USERNAME")
    public JAXBElement<String> createUSERNAME(String value) {
        return new JAXBElement<String>(_USERNAME_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web.ws.tm.majingjing.cn/", name = "queryData")
    public JAXBElement<QueryData> createQueryData(QueryData value) {
        return new JAXBElement<QueryData>(_QueryData_QNAME, QueryData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web.ws.tm.majingjing.cn/", name = "hello1")
    public JAXBElement<Hello1> createHello1(Hello1 value) {
        return new JAXBElement<Hello1>(_Hello1_QNAME, Hello1 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web.ws.tm.majingjing.cn/", name = "queryDataResponse")
    public JAXBElement<QueryDataResponse> createQueryDataResponse(QueryDataResponse value) {
        return new JAXBElement<QueryDataResponse>(_QueryDataResponse_QNAME, QueryDataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web.ws.tm.majingjing.cn/", name = "PASSWORD")
    public JAXBElement<String> createPASSWORD(String value) {
        return new JAXBElement<String>(_PASSWORD_QNAME, String.class, null, value);
    }

}

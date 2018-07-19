package cn.majingjing.tm.blog.webservice.client;

import javax.xml.namespace.QName;
import javax.xml.rpc.ParameterMode;
import javax.xml.rpc.ServiceFactory;
import javax.xml.rpc.encoding.XMLType;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPBodyElement;
import javax.xml.soap.SOAPConstants;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.Dispatch;
import javax.xml.ws.Service;
import java.net.URL;

/**
 * Created by JingjingMa on 2018/7/19 14:15
 */
public class DynamicClient {

    public static void main(String[] args) throws Exception {
//        call1();
        call2();
    }

    //
    public static void call2() throws Exception {
        String namespaceURI = "http://api.webservice.blog.tm.majingjing.cn/";
        String wsdlUrl = "https://www.majingjing.cn/tmblog/webservice/hellodemo?wsdl";
        String serviceName = "HelloPortImplService";
        String portName = "HelloPortImplPort";
        String methodName = "helloStr";

        //创建service
        URL url = new URL(wsdlUrl);
        QName qname = new QName(namespaceURI, serviceName);
        Service service = Service.create(url, qname);


        //创建port
        QName qport = new QName(namespaceURI, portName);
        Dispatch<SOAPMessage> dispatch = service.createDispatch(qport, SOAPMessage.class, Service.Mode.MESSAGE);


        //创建message
        SOAPMessage msg = MessageFactory.newInstance(SOAPConstants.SOAP_1_1_PROTOCOL).createMessage();
        SOAPEnvelope envelope = msg.getSOAPPart().getEnvelope();
        SOAPBody body = envelope.getBody();
        QName ename = new QName(namespaceURI, methodName, "api");//此处前缀可以参考soapui工具中的xml
        SOAPBodyElement ele = body.addBodyElement(ename);

        ele.addChildElement("arg0").setValue("abc");//不带命名空间（因为服务端不支持命名空间的解析方式）
        //ele.addChildElement("arg0", "api").setValue("abc");
        msg.writeTo(System.out);
        System.out.println("开始调用...");


        //调用ws
        SOAPMessage response = dispatch.invoke(msg);
        response.writeTo(System.out);

        //可以从response中获取想要的数据
        //Document doc = response.getSOAPPart().getEnvelope().getBody().extractContentAsDocument();
        //String str = doc.getElementsByTagName("return").item(0).getTextContent();
        //System.out.println(str);
    }

    //rpc不支持
    public static void call1() throws Exception {
        String webServiceURL = "https://www.majingjing.cn/tmblog/webservice/hellodemo?wsdl";
        String targetNamespace = "http://api.webservice.blog.tm.majingjing.cn/";
        QName servicename = new QName(webServiceURL, targetNamespace);
        javax.xml.rpc.Service service = ServiceFactory.newInstance().createService(servicename);
        javax.xml.rpc.Call call = service.createCall();
        call.setTargetEndpointAddress(webServiceURL);
        QName operationname = new QName(targetNamespace, "helloStr");
        call.setOperationName(operationname);
        call.addParameter("arg0", XMLType.XSD_STRING, ParameterMode.IN);
        QName returnname = new QName(targetNamespace, "string");
        call.setReturnType(returnname, String.class);
        String result = call.invoke(new Object[]{"abc"}).toString();
        System.out.println(result);
    }

}

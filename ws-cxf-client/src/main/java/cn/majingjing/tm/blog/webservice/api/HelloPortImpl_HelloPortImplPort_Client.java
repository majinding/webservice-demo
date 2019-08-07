
package cn.majingjing.tm.blog.webservice.api;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import com.baidu.MyHttpHeaderSoapInterceptor;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.transport.http.HTTPConduit;
import org.apache.cxf.transports.http.configuration.HTTPClientPolicy;

import javax.xml.namespace.QName;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * This class was generated by Apache CXF 3.2.4
 * 2018-10-17T16:12:33.458+08:00
 * Generated source version: 3.2.4
 *
 */
public final class HelloPortImpl_HelloPortImplPort_Client {

    private static final QName SERVICE_NAME = new QName("http://api.webservice.blog.tm.majingjing.cn/", "HelloPortImplService");

    private HelloPortImpl_HelloPortImplPort_Client() {
    }

    public static void main(String args[]) throws Exception {
        URL wsdlURL = HelloPortImplService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) {
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }

        HelloPortImplService ss = new HelloPortImplService(wsdlURL, SERVICE_NAME);
        HelloPortImpl port = ss.getHelloPortImplPort();

//*****************************************************************
        // 连接参数设定
        Client proxy = ClientProxy.getClient(port);
        proxy.getOutInterceptors().add(new MyHttpHeaderSoapInterceptor());
        proxy.getOutInterceptors().add(new LoggingOutInterceptor());

        HTTPConduit conduit = (HTTPConduit) proxy.getConduit();
        HTTPClientPolicy policy = new HTTPClientPolicy();
        // 连接超时时间
        policy.setConnectionTimeout(100000);
        // 请求超时时间
        policy.setReceiveTimeout(100000);

        conduit.setClient(policy);
//*****************************************************************

//        {
//        System.out.println("Invoking helloList...");
//        java.util.List<HelloBean> _helloList_arg0 = null;
//        java.util.List<HelloBean> _helloList__return = port.helloList(_helloList_arg0);
//        System.out.println("helloList.result=" + _helloList__return);
//
//
//        }
//        {
//        System.out.println("Invoking send...");
//        Sendreq _send_parameters = null;
//        Sendresp _send__return = port.send(_send_parameters);
//        System.out.println("send.result=" + _send__return);
//
//
//        }
//        {
//        System.out.println("Invoking helloMapList...");
//        java.util.List<HelloMapBean> _helloMapList_arg0 = null;
//        java.util.List<HelloMapBean> _helloMapList__return = port.helloMapList(_helloMapList_arg0);
//        System.out.println("helloMapList.result=" + _helloMapList__return);
//
//
//        }
        {
        System.out.println("Invoking helloStr...");
        String _helloStr_arg0 = "";
        String _helloStr__return = port.helloStr(_helloStr_arg0);
        System.out.println("helloStr.result=" + _helloStr__return);


        }
//        {
//        System.out.println("Invoking helloObject...");
//        HelloBean _helloObject_arg0 = null;
//        HelloBean _helloObject__return = port.helloObject(_helloObject_arg0);
//        System.out.println("helloObject.result=" + _helloObject__return);
//
//
//        }
//        {
//        System.out.println("Invoking seeRetuenName...");
//        SeeRetuenName _seeRetuenName_parameters = null;
//        SeeRetuenNameResponse _seeRetuenName__return = port.seeRetuenName(_seeRetuenName_parameters);
//        System.out.println("seeRetuenName.result=" + _seeRetuenName__return);
//
//
//        }

        System.exit(0);
    }

}

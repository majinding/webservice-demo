package cn.majingjing.tm.ws.web;

import org.apache.cxf.interceptor.Interceptor;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

import java.util.ArrayList;

public class CxfServerPublish {
    public static void main(String args[]) throws Exception {
        HelloApi helloApi = new HelloApi();
        ArrayList<Interceptor> inInterceptors = new ArrayList();
//        inInterceptors.add(new MyAbstractPhaseInterceptor());
        inInterceptors.add(new LoggingInInterceptor(102400*100));
        ArrayList<Interceptor> outInterceptors = new ArrayList();
        outInterceptors.add(new LoggingOutInterceptor());

        JaxWsServerFactoryBean factory = new JaxWsServerFactoryBean();
        //ServerFactoryBean factory = new ServerFactoryBean();
        factory.setServiceClass(HelloApi.class);
        factory.setAddress("http://127.0.0.1:8080/ws/HelloWs");
        factory.setServiceBean(helloApi);
        factory.setInInterceptors(inInterceptors);
        //factory.setOutInterceptors(outInterceptors);
        factory.create();
    }
}

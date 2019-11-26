package com.baidu;

import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.binding.soap.interceptor.AbstractSoapInterceptor;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.message.Message;
import org.apache.cxf.phase.Phase;

import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Map;

/**
 * @Author JingjingMa
 * @Date 2019/8/6 22:33
 */

public class MyHttpHeaderSoapInterceptor extends AbstractSoapInterceptor
{
    public MyHttpHeaderSoapInterceptor()
    {
        super(Phase.WRITE);
    }

    @Override
    public void handleMessage(SoapMessage message) throws Fault {
        Map map = (Map)message.get(Message.PROTOCOL_HEADERS);
        System.out.println(map);
        System.out.println("-------------");
        ArrayList<String> al = new ArrayList<String>();
        al.add("xxx-111");
        al.add("xxx-222");
        ArrayList<String> a2 = new ArrayList<String>();
        a2.add("majingjing");
        ArrayList<String> a3 = new ArrayList<String>();
        a3.add("Apache CXF 2.2.2.2.2");
        map.put("xxx", al);
        map.put("author" , a2);

        //注意此时就会和原有的user-agent相叠加 ， 如：user-agent=[Apache CXF 2.2.2.2.2, Apache CXF 2.2.3]
        //map.put("user-agent" , a3);

        //或采用如下方式来完成header的设置（这是最原始的方式）
        HttpURLConnection connection = (HttpURLConnection)message.get("http.connection");
        connection.setRequestProperty("User-Agent","majingjing-agent");
    }
}
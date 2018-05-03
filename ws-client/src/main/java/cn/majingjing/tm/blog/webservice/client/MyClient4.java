package cn.majingjing.tm.blog.webservice.client;

import cn.majingjing.tm.ws.util.WsHttpRequest;
import cn.majingjing.tm.ws.wsxml.WsEnvelope;
import cn.majingjing.tm.ws.wsxml.WsXmlUtil;
import org.junit.Test;

/**
 * 使用http方式简易调用ws，并解析响应报文
 */
public class MyClient4 {


    @Test
    public void hello1() throws Exception {
        //发送 POST
        String url = "https://www.majingjing.cn/tmblog/webservice/hellodemo";
        String xml = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:api=\"http://api.webservice.blog.tm.majingjing.cn/\">\n" +
                "   <soapenv:Header/>\n" +
                "   <soapenv:Body>\n" +
                "      <api:helloObject>\n" +
                "         <arg0>\n" +
                "            <id>abc</id>\n" +
                "            <name>abcv</name>\n" +
                "         </arg0>\n" +
                "      </api:helloObject>\n" +
                "   </soapenv:Body>\n" +
                "</soapenv:Envelope>";

        String sr= WsHttpRequest.doPost(url, xml);

        WsEnvelope o = WsXmlUtil.toObject(WsEnvelope.class, sr);
        System.out.println(o);

    }


}

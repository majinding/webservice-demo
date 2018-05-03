package cn.majingjing.tm.blog.webservice.client;

import cn.majingjing.tm.blog.webservice.api.HelloPortImpl;
import cn.majingjing.tm.blog.webservice.api.HelloPortImplService;
import cn.majingjing.tm.ws.handler.MyHeaderHandler;
import org.junit.Before;
import org.junit.Test;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.Handler;
import javax.xml.ws.handler.HandlerResolver;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.PortInfo;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyClient3 {

    HelloPortImpl api;
    HelloPortImplService service;

    @Before
    public void before() {

        try {
            String url = "https://www.majingjing.cn/tmblog/webservice/hellodemo";
            service = new HelloPortImplService(new URL(url));

            //添加Header信息
            service.setHandlerResolver(new HandlerResolver() {
                @Override
                public List<Handler> getHandlerChain(PortInfo portInfo) {
                    List<Handler> handlerList = new ArrayList<>();

                    handlerList.add(new MyHeaderHandler());
                    return handlerList;
                }
            });

            api = service.getHelloPortImplPort();

            //添加request请求中的header信息
            BindingProvider provider = (BindingProvider) api;
            Map<String, Object> req_ctx = provider.getRequestContext();
            Map<String, List<String>> headers = new HashMap<>();
            headers.put("author", Collections.singletonList("皇太极"));
            headers.put("aaa", Collections.singletonList("bbb"));
//            headers.put("authorization ", Collections.singletonList("base xxxxxxxxxxx"));
//            headers.put("proxy-host", Collections.singletonList("127.0.0.1:222"));
            req_ctx.put(MessageContext.HTTP_REQUEST_HEADERS, headers);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void hello1() {
        String aa = api.helloStr("aaa");
        System.out.println(aa);
    }


}

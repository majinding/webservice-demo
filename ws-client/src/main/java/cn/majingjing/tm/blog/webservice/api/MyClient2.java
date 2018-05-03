package cn.majingjing.tm.blog.webservice.api;

import org.junit.Before;
import org.junit.Test;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.MessageContext;
import java.io.File;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyClient2 {

    HelloPortImpl api;

    @Before
    public void before() {
        HelloPortImplService service = null;
        try {
//            String url = "http://www.majingjing.cn:7070/tmblog/webservice/hellodemo";
//            String url = "http://127.0.0.1:9999/tmblog/webservice/hellodemo";
            String url = "F:\\tmp\\ws\\hellodemo.xml";
            File file = new File(url);
            //URL _url = new URL(url);
//            service = new HelloPortImplService(file.toURI().toURL());




            URL _url = new URL(url);
            service = new HelloPortImplService(_url);
            System.out.println(111);
            api = service.getHelloPortImplPort();
            BindingProvider provider = (BindingProvider) api;
            Map<String, Object> req_ctx = provider.getRequestContext();
            Map<String, List<String>> headers = new HashMap<>();
            headers.put("authorization ", Collections.singletonList("base xxxxxxxxxxx"));
            headers.put("author", Collections.singletonList("皇太极"));
            headers.put("aaa",Collections.singletonList("bbb"));
            headers.put("proxy-host",Collections.singletonList("127.0.0.1:222"));
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

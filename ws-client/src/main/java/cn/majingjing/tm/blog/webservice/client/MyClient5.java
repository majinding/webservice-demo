package cn.majingjing.tm.blog.webservice.client;

import cn.majingjing.tm.blog.webservice.api.HelloPortImpl;
import cn.majingjing.tm.blog.webservice.api.HelloPortImplService;
import com.sun.xml.ws.client.BindingProviderProperties;
import org.junit.Before;
import org.junit.Test;

import javax.xml.ws.BindingProvider;
import java.net.URL;
import java.util.Map;

/**
 * 只定义超时时间
 */
@SuppressWarnings("all")
public class MyClient5 {

    HelloPortImpl api;
    HelloPortImplService service;

    @Before
    public void before() {

        try {
            String url = "https://www.majingjing.cn/tmblog/webservice/hellodemo";
            service = new HelloPortImplService(new URL(url));

            api = service.getHelloPortImplPort();

            BindingProvider provider = (BindingProvider) api;
            Map<String, Object> req_ctx = provider.getRequestContext();
            //连接超时
            req_ctx.put(BindingProviderProperties.CONNECT_TIMEOUT,10);
            //读取超时
            req_ctx.put(BindingProviderProperties.REQUEST_TIMEOUT,10);

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

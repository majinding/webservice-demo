package v6;

import cn.majingjing.tm.blog.webservice.api.HelloPortImpl;

import javax.xml.ws.handler.Handler;
import javax.xml.ws.handler.HandlerResolver;
import javax.xml.ws.handler.PortInfo;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author JingjingMa
 * @Date 2019/9/1 21:52
 */
public class ClientTest {

    public static void main(String[] args) {
        HelloPortImplService service = new HelloPortImplService();
        //添加Header信息
        service.setHandlerResolver(new HandlerResolver() {
            @Override
            public List<Handler> getHandlerChain(PortInfo portInfo) {
                List<Handler> handlerList = new ArrayList<>();

                handlerList.add(new MyHeaderHandler());
                return handlerList;
            }
        });


        HelloPortImpl helloPortImplPort = service.getHelloPortImplPort();

        String s = helloPortImplPort.helloStr("999");
        System.out.println(s);
    }

}

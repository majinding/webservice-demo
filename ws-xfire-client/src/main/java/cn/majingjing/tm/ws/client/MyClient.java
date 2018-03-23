package cn.majingjing.tm.ws.client;

import org.codehaus.xfire.client.Client;
import org.junit.Before;
import org.junit.Test;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/**
 * @author JingjingMa
 */
public class MyClient {


    @Before
    public void before() {
    }


    @Test
    public void hello1() throws Exception {
        Arg0 arg0 = new Arg0();
        arg0.setArg0("aaa");
        Client client = new Client(new URL("http://127.0.0.1:8080/ws/HelloWs?wsdl"));
        Object[] results = client.invoke("hello1", new Object[]{arg0});
        System.out.println(results[0]);
    }


}

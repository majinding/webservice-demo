package cn.majingjing.tm.ws.client;

import cn.majingjing.tm.ws.web.HelloApi;
import cn.majingjing.tm.ws.web.HelloApiService;
import cn.majingjing.tm.ws.web.HelloBean;
import cn.majingjing.tm.ws.web.QueryData;
import cn.majingjing.tm.ws.web.QueryDataResponse;
import org.junit.Before;
import org.junit.Test;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.MessageContext;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author JingjingMa
 *
 */
public class Client {
	HelloApi api;

	@Before
	public void before() {
		HelloApiService service = null;
		try {
			service = new HelloApiService(new URL("http://127.0.0.1:8081/ws/HelloWs?wsdl"));
			api = service.getHelloApiPort();
			BindingProvider provider = (BindingProvider) api;
			Map<String, Object> req_ctx = provider.getRequestContext();
			Map<String, List<String>> headers = new HashMap<String, List<String>>();
			headers.put("author",Collections.singletonList("皇太极"));
			headers.put("aaa",Collections.singletonList("bbb"));
			req_ctx.put(MessageContext.HTTP_REQUEST_HEADERS, headers);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void hello1() {
		String aa = api.hello1("皇太极");
		System.out.println(aa);
	}

	@Test
	public void hello2() {
		HelloBean bean = new HelloBean();
		bean.setName("皇太极");

		bean = api.hello2(bean);
		System.out.println(bean.getName());
	}

	@Test
	public void client() {
		QueryData qd = new QueryData();
		qd.setDATA("皇太极");
		QueryDataResponse resp = api.queryData(qd, "password123", "username123");
		System.out.println(resp.getReturn());
	}
}

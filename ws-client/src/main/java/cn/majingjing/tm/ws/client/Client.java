package cn.majingjing.tm.ws.client;

import org.junit.Before;
import org.junit.Test;

import cn.majingjing.tm.ws.web.HelloApi;
import cn.majingjing.tm.ws.web.HelloApiService;
import cn.majingjing.tm.ws.web.HelloBean;
import cn.majingjing.tm.ws.web.QueryData;
import cn.majingjing.tm.ws.web.QueryDataResponse;

/**
 * 
 * @author JingjingMa
 *
 */
public class Client {

	HelloApi api;

	@Before
	public void before() {
		HelloApiService service = new HelloApiService();
		api = service.getHelloApiPort();
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

package cn.majingjing.tm.ws.web;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.List;

/**
 * 
 * @author JingjingMa
 * @date 2017-11-29
 */
//@Component
@WebService
public class HelloApi implements IHelloApi {

	@Override
	@WebMethod
	public String hello1(String name) {
		return "hello: " + name;
	}

	@Override
	@WebMethod
	public HelloBean hello2(HelloBean bean) {
		bean.setName("欢迎：" + bean.getName());
		return bean;
	}

	@Override
	@WebMethod
	public HelloBean hello3(List<HelloBean> ls) {
		//ls.stream().map(h -> h.getName() + "\t" + h.getId()).forEach(System.out::println);
		HelloBean bean = new HelloBean();
		bean.setName("欢迎：" +System.currentTimeMillis());
		return bean;
	}

	@Override
	@WebMethod
	public String queryData(@WebParam(partName = "DATA", name = "DATA") String data,
							@WebParam(header = true, name = "PASSWORD") String password,
							@WebParam(header = true, name = "USERNAME") String userName) {

		return String.format("hello-queryData: userName=%s,password=%s,data=%s",userName,password,data);
	}

}

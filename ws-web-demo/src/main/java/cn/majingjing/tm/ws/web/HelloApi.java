package cn.majingjing.tm.ws.web;

import javax.jws.HandlerChain;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * 
 * @author JingjingMa
 * @date 2017-11-29
 */
@WebService
@HandlerChain(file = "service-handler-chain.xml")
public class HelloApi {

	@WebMethod
	public String hello1(String name) {
		return "hello: " + name;
	}

	@WebMethod
	public HelloBean hello2(HelloBean bean) {
		bean.setName("欢迎：" + bean.getName());
		return bean;
	}

	@WebMethod
	public String queryData(@WebParam(partName = "DATA", name = "DATA") String data,
			@WebParam(header = true, name = "PASSWORD") String password,
			@WebParam(header = true, name = "USERNAME") String userName) {

		return String.format("hello-queryData: userName=%s,password=%s,data=%s",userName,password,data);
	}

}

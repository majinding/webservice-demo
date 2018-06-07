package cn.majingjing.tm.ws.web;

import cn.majingjing.tm.ws.web.springbean.Author2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * 
 * @author JingjingMa
 * @date 2017-11-29
 */
@WebService
@Component("RefBean2Api")
public class RefBean2Api {

	@Autowired
	private Author2 author2;

	@WebMethod
	public String queryAuthorName(String name) {
		System.out.println(author2);
		String rtn = String.format("hello: %s , author name is %s",name,author2.name());
		return rtn;
	}


}

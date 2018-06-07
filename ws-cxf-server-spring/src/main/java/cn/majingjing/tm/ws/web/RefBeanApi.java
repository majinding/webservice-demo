package cn.majingjing.tm.ws.web;

import cn.majingjing.tm.ws.web.springbean.Author;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * 
 * @author JingjingMa
 * @date 2017-11-29
 */
@WebService
public class RefBeanApi {

	private Author author;

	public void setAuthor(Author author) {
		this.author = author;
	}

	@WebMethod
	public String queryAuthorName(String name) {
		System.out.println(author);
		String rtn = String.format("hello: %s , author name is %s",name,author.name());
		return rtn;
	}


}

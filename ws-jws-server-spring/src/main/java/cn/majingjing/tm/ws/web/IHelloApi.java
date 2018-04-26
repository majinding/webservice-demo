package cn.majingjing.tm.ws.web;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import java.util.List;

/**
 * Created by Jingjing.Ma on 2018/4/26 9:43
 */
public interface IHelloApi {
    @WebMethod
    String hello1(String name);

    @WebMethod
    HelloBean hello2(HelloBean bean);

    @WebMethod
    HelloBean hello3(List<HelloBean> ls);

    @WebMethod
    String queryData(@WebParam(partName = "DATA", name = "DATA") String data,
                     @WebParam(header = true, name = "PASSWORD") String password,
                     @WebParam(header = true, name = "USERNAME") String userName);
}

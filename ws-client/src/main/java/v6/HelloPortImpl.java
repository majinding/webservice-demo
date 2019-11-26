package v6;

import cn.majingjing.tm.blog.webservice.api.HelloBean;
import cn.majingjing.tm.blog.webservice.api.ObjectFactory;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * 常用的简单ws服务接口
 *
 * This class was generated by Apache CXF 3.2.5
 * 2019-09-01T21:25:24.531+08:00
 * Generated source version: 3.2.5
 *
 */
@WebService(targetNamespace = "http://api.webservice.blog.tm.majingjing.cn/", name = "HelloPortImpl")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface HelloPortImpl {

    /**
     * 基于集合对象的入参和出参
     */
    @WebMethod
    @WebResult(name = "return", targetNamespace = "http://api.webservice.blog.tm.majingjing.cn/", partName = "return")
    public HelloBeanArray helloList(
            @WebParam(partName = "arg0", name = "arg0")
                    HelloBeanArray arg0
    );

    /**
     * 看参数名称 seeParamter1和seeParamter2
     */
    @WebMethod
    @WebResult(name = "def", targetNamespace = "http://api.webservice.blog.tm.majingjing.cn/", partName = "def")
    public String seeParamter1(
            @WebParam(partName = "abc", name = "abc")
                    String abc
    );

    /**
     * 看参数名称 seeParamter1和seeParamter2
     */
    @WebMethod
    @WebResult(name = "def", targetNamespace = "http://api.webservice.blog.tm.majingjing.cn/", partName = "def")
    public String seeParamter2(
            @WebParam(partName = "abc", name = "abc")
                    String abc
    );

    /**
     * 自定义入参和出参名称
     */
    @WebMethod
    @WebResult(name = "iamRename", targetNamespace = "http://api.webservice.blog.tm.majingjing.cn/", partName = "iamRename")
    public String send(
            @WebParam(partName = "ToAddress", name = "ToAddress")
                    String toAddress,
            @WebParam(partName = "ExchangeEvent", name = "ExchangeEvent")
                    String exchangeEvent
    );

    /**
     * 基于集合map对象的入参和出参
     */
    @WebMethod
    @WebResult(name = "return", targetNamespace = "http://api.webservice.blog.tm.majingjing.cn/", partName = "return")
    public HelloMapBeanArray helloMapList(
            @WebParam(partName = "arg0", name = "arg0")
                    HelloMapBeanArray arg0
    );

    /**
     * 简单数据类型的入参和出参
     */
    @WebMethod
    @WebResult(name = "return", targetNamespace = "http://api.webservice.blog.tm.majingjing.cn/", partName = "return")
    public String helloStr(
            @WebParam(partName = "arg0", name = "arg0")
                    String arg0
    );

    /**
     * 基于对象的入参和出参
     */
    @WebMethod
    @WebResult(name = "return", targetNamespace = "http://api.webservice.blog.tm.majingjing.cn/", partName = "return")
    public cn.majingjing.tm.blog.webservice.api.HelloBean helloObject(
            @WebParam(partName = "arg0", name = "arg0")
                    HelloBean arg0
    );

    /**
     * 自定义入参和出参名称
     */
    @WebMethod
    @WebResult(name = "iamRename", targetNamespace = "http://api.webservice.blog.tm.majingjing.cn/", partName = "iamRename")
    public String seeRetuenName(
            @WebParam(partName = "abcd", name = "abcd")
                    String abcd
    );
}
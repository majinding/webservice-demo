package cn.majingjing.tm.ws.wsxml;

import cn.majingjing.tm.blog.webservice.api.HelloObjectResponse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * Created by Jingjing.Ma on 2018/5/3 11:39
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class WsBody {

    //这个变量根据需要自己替换为对应的对象
    private HelloObjectResponse helloObjectResponse;

    @XmlElement(name = "Fault")
    private WsFault fault;

    public HelloObjectResponse getHelloObjectResponse() {
        return helloObjectResponse;
    }

    public void setHelloObjectResponse(HelloObjectResponse helloObjectResponse) {
        this.helloObjectResponse = helloObjectResponse;
    }

    public WsFault getFault() {
        return fault;
    }

    public void setFault(WsFault fault) {
        this.fault = fault;
    }
}

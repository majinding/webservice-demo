package cn.majingjing.tm.ws.wsxml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Jingjing.Ma on 2018/5/3 11:38
 */
@XmlRootElement(name = "Envelope")
@XmlAccessorType(XmlAccessType.FIELD)
public class WsEnvelope {

    @XmlElement(name = "Body")
    private WsBody wsBody;

    public WsBody getWsBody() {
        return wsBody;
    }

    public void setWsBody(WsBody wsBody) {
        this.wsBody = wsBody;
    }
}

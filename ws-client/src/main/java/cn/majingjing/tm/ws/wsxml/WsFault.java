package cn.majingjing.tm.ws.wsxml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

/**
 * Created by Jingjing.Ma on 2018/5/3 13:23
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class WsFault {

    private String faultcode;
    private String faultstring;

    public String getFaultcode() {
        return faultcode;
    }

    public void setFaultcode(String faultcode) {
        this.faultcode = faultcode;
    }

    public String getFaultstring() {
        return faultstring;
    }

    public void setFaultstring(String faultstring) {
        this.faultstring = faultstring;
    }
}

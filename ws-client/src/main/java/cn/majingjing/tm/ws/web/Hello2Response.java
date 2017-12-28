
package cn.majingjing.tm.ws.web;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>hello2Response complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="hello2Response">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://web.ws.tm.majingjing.cn/}helloBean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "hello2Response", propOrder = {
    "_return"
})
public class Hello2Response {

    @XmlElement(name = "return")
    protected HelloBean _return;

    /**
     * 获取return属性的值。
     * 
     * @return
     *     possible object is
     *     {@link HelloBean }
     *     
     */
    public HelloBean getReturn() {
        return _return;
    }

    /**
     * 设置return属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link HelloBean }
     *     
     */
    public void setReturn(HelloBean value) {
        this._return = value;
    }

}

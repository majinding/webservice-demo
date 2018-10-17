
package cn.majingjing.tm.blog.webservice.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>sendreq complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="sendreq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ToAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExchangeEvent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sendreq", propOrder = {
    "toAddress",
    "exchangeEvent"
})
public class Sendreq {

    @XmlElement(name = "ToAddress")
    protected String toAddress;
    @XmlElement(name = "ExchangeEvent")
    protected String exchangeEvent;

    /**
     * ��ȡtoAddress���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToAddress() {
        return toAddress;
    }

    /**
     * ����toAddress���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToAddress(String value) {
        this.toAddress = value;
    }

    /**
     * ��ȡexchangeEvent���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExchangeEvent() {
        return exchangeEvent;
    }

    /**
     * ����exchangeEvent���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExchangeEvent(String value) {
        this.exchangeEvent = value;
    }

}

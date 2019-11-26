
package br.com.hodielog;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                         A complex type describing the return Data
 *                     
 * 
 * <p>ReturnData complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ReturnData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BolleanOK" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ItemItens" type="{http://hodielog.com.br/}ArrayOfItem"/>
 *         &lt;element name="StringErrorMsg" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReturnData", propOrder = {
    "bolleanOK",
    "itemItens",
    "stringErrorMsg"
})
public class ReturnData {

    @XmlElement(name = "BolleanOK")
    protected boolean bolleanOK;
    @XmlElement(name = "Itens", required = true, nillable = true)
    protected ArrayOfItem itemItens;
    @XmlElement(name = "StringErrorMsg", required = true, nillable = true)
    protected String stringErrorMsg;

    /**
     * 获取bolleanOK属性的值。
     * 
     */
    public boolean isBolleanOK() {
        return bolleanOK;
    }

    /**
     * 设置bolleanOK属性的值。
     * 
     */
    public void setBolleanOK(boolean value) {
        this.bolleanOK = value;
    }

    /**
     * 获取itemItens属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfItem }
     *     
     */
    public ArrayOfItem getItemItens() {
        return itemItens;
    }

    /**
     * 设置itemItens属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfItem }
     *     
     */
    public void setItemItens(ArrayOfItem value) {
        this.itemItens = value;
    }

    /**
     * 获取stringErrorMsg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStringErrorMsg() {
        return stringErrorMsg;
    }

    /**
     * 设置stringErrorMsg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStringErrorMsg(String value) {
        this.stringErrorMsg = value;
    }

}

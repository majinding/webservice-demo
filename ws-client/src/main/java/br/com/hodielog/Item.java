
package br.com.hodielog;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                         A complex type describing the Product
 *                     
 * 
 * <p>Item complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Item">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StringId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="StringNome" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="StringLogradouro" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="StringNumero" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="StringComplemento" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="StringBairro" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="StringCidade" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="StringUf" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="StringCep" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="StringCpf" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="StringCnpj" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="StringTelefone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="StringCelular" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="StringEmail" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="StringPedido" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="StringNf" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="StringValorFrete" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="StringValorProduto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="StringPais" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="StringRemetenteNome" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="StringRemetenteLogradouro" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="StringRemetenteNumero" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="StringRemetenteComplemento" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="StringRemetenteBairro" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="StringRemetenteCidade" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="StringRemetenteUF" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="StringRemetenteCEP" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="StringRemetentePais" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="StringRemetenteCPF" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="StringRemetenteCNPJ" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="StringRemetenteEmail" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="StringRemetenteTelefone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="StringRemetenteCelular" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="StringPeso" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="StringLargura" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="StringAltura" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="StringComprimento" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="StringDepartamento" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="StringSecurityPrice" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="StringMKTPlaceName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="StringService" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="StringBag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="StringCarry" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "item", propOrder = {
    "stringId",
    "stringNome",
    "stringLogradouro",
    "stringNumero",
    "stringComplemento",
    "stringBairro",
    "stringCidade",
    "stringUf",
    "stringCep",
    "stringCpf",
    "stringCnpj",
    "stringTelefone",
    "stringCelular",
    "stringEmail",
    "stringPedido",
    "stringNf",
    "stringValorFrete",
    "stringValorProduto",
    "stringPais",
    "stringRemetenteNome",
    "stringRemetenteLogradouro",
    "stringRemetenteNumero",
    "stringRemetenteComplemento",
    "stringRemetenteBairro",
    "stringRemetenteCidade",
    "stringRemetenteUF",
    "stringRemetenteCEP",
    "stringRemetentePais",
    "stringRemetenteCPF",
    "stringRemetenteCNPJ",
    "stringRemetenteEmail",
    "stringRemetenteTelefone",
    "stringRemetenteCelular",
    "stringPeso",
    "stringLargura",
    "stringAltura",
    "stringComprimento",
    "stringDepartamento",
    "stringSecurityPrice",
    "stringMKTPlaceName",
    "stringService",
    "stringBag",
    "stringCarry"
})
public class Item {

    @XmlElement(name = "StringId", required = true, nillable = true)
    protected String stringId;
    @XmlElement(name = "StringNome", required = true, nillable = true)
    protected String stringNome;
    @XmlElement(name = "StringLogradouro", required = true, nillable = true)
    protected String stringLogradouro;
    @XmlElement(name = "StringNumero", required = true, nillable = true)
    protected String stringNumero;
    @XmlElement(name = "StringComplemento", required = true, nillable = true)
    protected String stringComplemento;
    @XmlElement(name = "StringBairro", required = true, nillable = true)
    protected String stringBairro;
    @XmlElement(name = "StringCidade", required = true, nillable = true)
    protected String stringCidade;
    @XmlElement(name = "StringUf", required = true, nillable = true)
    protected String stringUf;
    @XmlElement(name = "StringCep", required = true, nillable = true)
    protected String stringCep;
    @XmlElement(name = "StringCpf", required = true, nillable = true)
    protected String stringCpf;
    @XmlElement(name = "StringCnpj", required = true, nillable = true)
    protected String stringCnpj;
    @XmlElement(name = "StringTelefone", required = true, nillable = true)
    protected String stringTelefone;
    @XmlElement(name = "StringCelular", required = true, nillable = true)
    protected String stringCelular;
    @XmlElement(name = "StringEmail", required = true, nillable = true)
    protected String stringEmail;
    @XmlElement(name = "StringPedido", required = true, nillable = true)
    protected String stringPedido;
    @XmlElement(name = "StringNf", required = true, nillable = true)
    protected String stringNf;
    @XmlElement(name = "StringValorFrete", required = true, nillable = true)
    protected String stringValorFrete;
    @XmlElement(name = "StringValorProduto", required = true, nillable = true)
    protected String stringValorProduto;
    @XmlElement(name = "StringPais", required = true, nillable = true)
    protected String stringPais;
    @XmlElement(name = "StringRemetenteNome", required = true, nillable = true)
    protected String stringRemetenteNome;
    @XmlElement(name = "StringRemetenteLogradouro", required = true, nillable = true)
    protected String stringRemetenteLogradouro;
    @XmlElement(name = "StringRemetenteNumero", required = true, nillable = true)
    protected String stringRemetenteNumero;
    @XmlElement(name = "StringRemetenteComplemento", required = true, nillable = true)
    protected String stringRemetenteComplemento;
    @XmlElement(name = "StringRemetenteBairro", required = true, nillable = true)
    protected String stringRemetenteBairro;
    @XmlElement(name = "StringRemetenteCidade", required = true, nillable = true)
    protected String stringRemetenteCidade;
    @XmlElement(name = "StringRemetenteUF", required = true, nillable = true)
    protected String stringRemetenteUF;
    @XmlElement(name = "StringRemetenteCEP", required = true, nillable = true)
    protected String stringRemetenteCEP;
    @XmlElement(name = "StringRemetentePais", required = true, nillable = true)
    protected String stringRemetentePais;
    @XmlElement(name = "StringRemetenteCPF", required = true, nillable = true)
    protected String stringRemetenteCPF;
    @XmlElement(name = "StringRemetenteCNPJ", required = true, nillable = true)
    protected String stringRemetenteCNPJ;
    @XmlElement(name = "StringRemetenteEmail", required = true, nillable = true)
    protected String stringRemetenteEmail;
    @XmlElement(name = "StringRemetenteTelefone", required = true, nillable = true)
    protected String stringRemetenteTelefone;
    @XmlElement(name = "StringRemetenteCelular", required = true, nillable = true)
    protected String stringRemetenteCelular;
    @XmlElement(name = "StringPeso", required = true, nillable = true)
    protected String stringPeso;
    @XmlElement(name = "StringLargura", required = true, nillable = true)
    protected String stringLargura;
    @XmlElement(name = "StringAltura", required = true, nillable = true)
    protected String stringAltura;
    @XmlElement(name = "StringComprimento", required = true, nillable = true)
    protected String stringComprimento;
    @XmlElement(name = "StringDepartamento", required = true, nillable = true)
    protected String stringDepartamento;
    @XmlElement(name = "StringSecurityPrice", required = true, nillable = true)
    protected String stringSecurityPrice;
    @XmlElement(name = "StringMKTPlaceName", required = true, nillable = true)
    protected String stringMKTPlaceName;
    @XmlElement(name = "StringService", required = true, nillable = true)
    protected String stringService;
    @XmlElement(name = "StringBag", required = true, nillable = true)
    protected String stringBag;
    @XmlElement(name = "StringCarry", required = true, nillable = true)
    protected String stringCarry;

    /**
     * 获取stringId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStringId() {
        return stringId;
    }

    /**
     * 设置stringId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStringId(String value) {
        this.stringId = value;
    }

    /**
     * 获取stringNome属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStringNome() {
        return stringNome;
    }

    /**
     * 设置stringNome属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStringNome(String value) {
        this.stringNome = value;
    }

    /**
     * 获取stringLogradouro属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStringLogradouro() {
        return stringLogradouro;
    }

    /**
     * 设置stringLogradouro属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStringLogradouro(String value) {
        this.stringLogradouro = value;
    }

    /**
     * 获取stringNumero属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStringNumero() {
        return stringNumero;
    }

    /**
     * 设置stringNumero属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStringNumero(String value) {
        this.stringNumero = value;
    }

    /**
     * 获取stringComplemento属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStringComplemento() {
        return stringComplemento;
    }

    /**
     * 设置stringComplemento属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStringComplemento(String value) {
        this.stringComplemento = value;
    }

    /**
     * 获取stringBairro属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStringBairro() {
        return stringBairro;
    }

    /**
     * 设置stringBairro属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStringBairro(String value) {
        this.stringBairro = value;
    }

    /**
     * 获取stringCidade属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStringCidade() {
        return stringCidade;
    }

    /**
     * 设置stringCidade属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStringCidade(String value) {
        this.stringCidade = value;
    }

    /**
     * 获取stringUf属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStringUf() {
        return stringUf;
    }

    /**
     * 设置stringUf属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStringUf(String value) {
        this.stringUf = value;
    }

    /**
     * 获取stringCep属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStringCep() {
        return stringCep;
    }

    /**
     * 设置stringCep属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStringCep(String value) {
        this.stringCep = value;
    }

    /**
     * 获取stringCpf属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStringCpf() {
        return stringCpf;
    }

    /**
     * 设置stringCpf属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStringCpf(String value) {
        this.stringCpf = value;
    }

    /**
     * 获取stringCnpj属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStringCnpj() {
        return stringCnpj;
    }

    /**
     * 设置stringCnpj属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStringCnpj(String value) {
        this.stringCnpj = value;
    }

    /**
     * 获取stringTelefone属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStringTelefone() {
        return stringTelefone;
    }

    /**
     * 设置stringTelefone属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStringTelefone(String value) {
        this.stringTelefone = value;
    }

    /**
     * 获取stringCelular属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStringCelular() {
        return stringCelular;
    }

    /**
     * 设置stringCelular属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStringCelular(String value) {
        this.stringCelular = value;
    }

    /**
     * 获取stringEmail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStringEmail() {
        return stringEmail;
    }

    /**
     * 设置stringEmail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStringEmail(String value) {
        this.stringEmail = value;
    }

    /**
     * 获取stringPedido属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStringPedido() {
        return stringPedido;
    }

    /**
     * 设置stringPedido属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStringPedido(String value) {
        this.stringPedido = value;
    }

    /**
     * 获取stringNf属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStringNf() {
        return stringNf;
    }

    /**
     * 设置stringNf属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStringNf(String value) {
        this.stringNf = value;
    }

    /**
     * 获取stringValorFrete属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStringValorFrete() {
        return stringValorFrete;
    }

    /**
     * 设置stringValorFrete属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStringValorFrete(String value) {
        this.stringValorFrete = value;
    }

    /**
     * 获取stringValorProduto属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStringValorProduto() {
        return stringValorProduto;
    }

    /**
     * 设置stringValorProduto属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStringValorProduto(String value) {
        this.stringValorProduto = value;
    }

    /**
     * 获取stringPais属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStringPais() {
        return stringPais;
    }

    /**
     * 设置stringPais属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStringPais(String value) {
        this.stringPais = value;
    }

    /**
     * 获取stringRemetenteNome属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStringRemetenteNome() {
        return stringRemetenteNome;
    }

    /**
     * 设置stringRemetenteNome属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStringRemetenteNome(String value) {
        this.stringRemetenteNome = value;
    }

    /**
     * 获取stringRemetenteLogradouro属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStringRemetenteLogradouro() {
        return stringRemetenteLogradouro;
    }

    /**
     * 设置stringRemetenteLogradouro属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStringRemetenteLogradouro(String value) {
        this.stringRemetenteLogradouro = value;
    }

    /**
     * 获取stringRemetenteNumero属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStringRemetenteNumero() {
        return stringRemetenteNumero;
    }

    /**
     * 设置stringRemetenteNumero属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStringRemetenteNumero(String value) {
        this.stringRemetenteNumero = value;
    }

    /**
     * 获取stringRemetenteComplemento属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStringRemetenteComplemento() {
        return stringRemetenteComplemento;
    }

    /**
     * 设置stringRemetenteComplemento属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStringRemetenteComplemento(String value) {
        this.stringRemetenteComplemento = value;
    }

    /**
     * 获取stringRemetenteBairro属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStringRemetenteBairro() {
        return stringRemetenteBairro;
    }

    /**
     * 设置stringRemetenteBairro属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStringRemetenteBairro(String value) {
        this.stringRemetenteBairro = value;
    }

    /**
     * 获取stringRemetenteCidade属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStringRemetenteCidade() {
        return stringRemetenteCidade;
    }

    /**
     * 设置stringRemetenteCidade属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStringRemetenteCidade(String value) {
        this.stringRemetenteCidade = value;
    }

    /**
     * 获取stringRemetenteUF属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStringRemetenteUF() {
        return stringRemetenteUF;
    }

    /**
     * 设置stringRemetenteUF属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStringRemetenteUF(String value) {
        this.stringRemetenteUF = value;
    }

    /**
     * 获取stringRemetenteCEP属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStringRemetenteCEP() {
        return stringRemetenteCEP;
    }

    /**
     * 设置stringRemetenteCEP属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStringRemetenteCEP(String value) {
        this.stringRemetenteCEP = value;
    }

    /**
     * 获取stringRemetentePais属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStringRemetentePais() {
        return stringRemetentePais;
    }

    /**
     * 设置stringRemetentePais属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStringRemetentePais(String value) {
        this.stringRemetentePais = value;
    }

    /**
     * 获取stringRemetenteCPF属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStringRemetenteCPF() {
        return stringRemetenteCPF;
    }

    /**
     * 设置stringRemetenteCPF属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStringRemetenteCPF(String value) {
        this.stringRemetenteCPF = value;
    }

    /**
     * 获取stringRemetenteCNPJ属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStringRemetenteCNPJ() {
        return stringRemetenteCNPJ;
    }

    /**
     * 设置stringRemetenteCNPJ属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStringRemetenteCNPJ(String value) {
        this.stringRemetenteCNPJ = value;
    }

    /**
     * 获取stringRemetenteEmail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStringRemetenteEmail() {
        return stringRemetenteEmail;
    }

    /**
     * 设置stringRemetenteEmail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStringRemetenteEmail(String value) {
        this.stringRemetenteEmail = value;
    }

    /**
     * 获取stringRemetenteTelefone属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStringRemetenteTelefone() {
        return stringRemetenteTelefone;
    }

    /**
     * 设置stringRemetenteTelefone属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStringRemetenteTelefone(String value) {
        this.stringRemetenteTelefone = value;
    }

    /**
     * 获取stringRemetenteCelular属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStringRemetenteCelular() {
        return stringRemetenteCelular;
    }

    /**
     * 设置stringRemetenteCelular属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStringRemetenteCelular(String value) {
        this.stringRemetenteCelular = value;
    }

    /**
     * 获取stringPeso属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStringPeso() {
        return stringPeso;
    }

    /**
     * 设置stringPeso属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStringPeso(String value) {
        this.stringPeso = value;
    }

    /**
     * 获取stringLargura属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStringLargura() {
        return stringLargura;
    }

    /**
     * 设置stringLargura属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStringLargura(String value) {
        this.stringLargura = value;
    }

    /**
     * 获取stringAltura属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStringAltura() {
        return stringAltura;
    }

    /**
     * 设置stringAltura属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStringAltura(String value) {
        this.stringAltura = value;
    }

    /**
     * 获取stringComprimento属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStringComprimento() {
        return stringComprimento;
    }

    /**
     * 设置stringComprimento属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStringComprimento(String value) {
        this.stringComprimento = value;
    }

    /**
     * 获取stringDepartamento属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStringDepartamento() {
        return stringDepartamento;
    }

    /**
     * 设置stringDepartamento属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStringDepartamento(String value) {
        this.stringDepartamento = value;
    }

    /**
     * 获取stringSecurityPrice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStringSecurityPrice() {
        return stringSecurityPrice;
    }

    /**
     * 设置stringSecurityPrice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStringSecurityPrice(String value) {
        this.stringSecurityPrice = value;
    }

    /**
     * 获取stringMKTPlaceName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStringMKTPlaceName() {
        return stringMKTPlaceName;
    }

    /**
     * 设置stringMKTPlaceName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStringMKTPlaceName(String value) {
        this.stringMKTPlaceName = value;
    }

    /**
     * 获取stringService属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStringService() {
        return stringService;
    }

    /**
     * 设置stringService属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStringService(String value) {
        this.stringService = value;
    }

    /**
     * 获取stringBag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStringBag() {
        return stringBag;
    }

    /**
     * 设置stringBag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStringBag(String value) {
        this.stringBag = value;
    }

    /**
     * 获取stringCarry属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStringCarry() {
        return stringCarry;
    }

    /**
     * 设置stringCarry属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStringCarry(String value) {
        this.stringCarry = value;
    }

}

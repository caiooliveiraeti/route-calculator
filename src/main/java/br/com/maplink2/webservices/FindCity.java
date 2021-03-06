
package br.com.maplink2.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cidade" type="{http://webservices.maplink2.com.br}City"/>
 *         &lt;element name="ao" type="{http://webservices.maplink2.com.br}AddressOptions"/>
 *         &lt;element name="token" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "cidade",
    "ao",
    "token"
})
@XmlRootElement(name = "findCity")
public class FindCity {

    @XmlElement(required = true)
    protected City cidade;
    @XmlElement(required = true)
    protected AddressOptions ao;
    protected String token;

    /**
     * Obtém o valor da propriedade cidade.
     * 
     * @return
     *     possible object is
     *     {@link City }
     *     
     */
    public City getCidade() {
        return cidade;
    }

    /**
     * Define o valor da propriedade cidade.
     * 
     * @param value
     *     allowed object is
     *     {@link City }
     *     
     */
    public void setCidade(City value) {
        this.cidade = value;
    }

    /**
     * Obtém o valor da propriedade ao.
     * 
     * @return
     *     possible object is
     *     {@link AddressOptions }
     *     
     */
    public AddressOptions getAo() {
        return ao;
    }

    /**
     * Define o valor da propriedade ao.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressOptions }
     *     
     */
    public void setAo(AddressOptions value) {
        this.ao = value;
    }

    /**
     * Obtém o valor da propriedade token.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToken() {
        return token;
    }

    /**
     * Define o valor da propriedade token.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToken(String value) {
        this.token = value;
    }

}

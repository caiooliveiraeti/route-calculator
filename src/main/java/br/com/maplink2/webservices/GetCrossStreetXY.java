
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
 *         &lt;element name="firstStreet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="secondStreet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "firstStreet",
    "secondStreet",
    "token"
})
@XmlRootElement(name = "GetCrossStreetXY")
public class GetCrossStreetXY {

    @XmlElement(required = true)
    protected City cidade;
    protected String firstStreet;
    protected String secondStreet;
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
     * Obtém o valor da propriedade firstStreet.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstStreet() {
        return firstStreet;
    }

    /**
     * Define o valor da propriedade firstStreet.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstStreet(String value) {
        this.firstStreet = value;
    }

    /**
     * Obtém o valor da propriedade secondStreet.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondStreet() {
        return secondStreet;
    }

    /**
     * Define o valor da propriedade secondStreet.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondStreet(String value) {
        this.secondStreet = value;
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

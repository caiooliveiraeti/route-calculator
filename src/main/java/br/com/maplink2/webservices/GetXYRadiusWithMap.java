
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
 *         &lt;element name="address" type="{http://webservices.maplink2.com.br}Address"/>
 *         &lt;element name="mo" type="{http://webservices.maplink2.com.br}MapOptions"/>
 *         &lt;element name="radius" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "address",
    "mo",
    "radius",
    "token"
})
@XmlRootElement(name = "getXYRadiusWithMap")
public class GetXYRadiusWithMap {

    @XmlElement(required = true)
    protected Address address;
    @XmlElement(required = true)
    protected MapOptions mo;
    protected int radius;
    protected String token;

    /**
     * Obtém o valor da propriedade address.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Define o valor da propriedade address.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setAddress(Address value) {
        this.address = value;
    }

    /**
     * Obtém o valor da propriedade mo.
     * 
     * @return
     *     possible object is
     *     {@link MapOptions }
     *     
     */
    public MapOptions getMo() {
        return mo;
    }

    /**
     * Define o valor da propriedade mo.
     * 
     * @param value
     *     allowed object is
     *     {@link MapOptions }
     *     
     */
    public void setMo(MapOptions value) {
        this.mo = value;
    }

    /**
     * Obtém o valor da propriedade radius.
     * 
     */
    public int getRadius() {
        return radius;
    }

    /**
     * Define o valor da propriedade radius.
     * 
     */
    public void setRadius(int value) {
        this.radius = value;
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


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
 *         &lt;element name="ra" type="{http://webservices.maplink2.com.br}ArrayOfRouteArray" minOccurs="0"/>
 *         &lt;element name="ro" type="{http://webservices.maplink2.com.br}RouteOptions"/>
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
    "ra",
    "ro",
    "token"
})
@XmlRootElement(name = "GetRouteTotalsBatch")
public class GetRouteTotalsBatch {

    protected ArrayOfRouteArray ra;
    @XmlElement(required = true)
    protected RouteOptions ro;
    protected String token;

    /**
     * Obtém o valor da propriedade ra.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRouteArray }
     *     
     */
    public ArrayOfRouteArray getRa() {
        return ra;
    }

    /**
     * Define o valor da propriedade ra.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRouteArray }
     *     
     */
    public void setRa(ArrayOfRouteArray value) {
        this.ra = value;
    }

    /**
     * Obtém o valor da propriedade ro.
     * 
     * @return
     *     possible object is
     *     {@link RouteOptions }
     *     
     */
    public RouteOptions getRo() {
        return ro;
    }

    /**
     * Define o valor da propriedade ro.
     * 
     * @param value
     *     allowed object is
     *     {@link RouteOptions }
     *     
     */
    public void setRo(RouteOptions value) {
        this.ro = value;
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


package br.com.maplink2.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de MultiRouteRequest complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="MultiRouteRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="origin" type="{http://webservices.maplink2.com.br}RouteStop"/>
 *         &lt;element name="destination" type="{http://webservices.maplink2.com.br}RouteStop"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultiRouteRequest", propOrder = {
    "origin",
    "destination"
})
public class MultiRouteRequest {

    @XmlElement(required = true)
    protected RouteStop origin;
    @XmlElement(required = true)
    protected RouteStop destination;

    /**
     * Obtém o valor da propriedade origin.
     * 
     * @return
     *     possible object is
     *     {@link RouteStop }
     *     
     */
    public RouteStop getOrigin() {
        return origin;
    }

    /**
     * Define o valor da propriedade origin.
     * 
     * @param value
     *     allowed object is
     *     {@link RouteStop }
     *     
     */
    public void setOrigin(RouteStop value) {
        this.origin = value;
    }

    /**
     * Obtém o valor da propriedade destination.
     * 
     * @return
     *     possible object is
     *     {@link RouteStop }
     *     
     */
    public RouteStop getDestination() {
        return destination;
    }

    /**
     * Define o valor da propriedade destination.
     * 
     * @param value
     *     allowed object is
     *     {@link RouteStop }
     *     
     */
    public void setDestination(RouteStop value) {
        this.destination = value;
    }

}

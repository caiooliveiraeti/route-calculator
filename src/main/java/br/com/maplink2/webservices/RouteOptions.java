
package br.com.maplink2.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de RouteOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RouteOptions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="routeDetails" type="{http://webservices.maplink2.com.br}RouteDetails"/>
 *         &lt;element name="vehicle" type="{http://webservices.maplink2.com.br}Vehicle"/>
 *         &lt;element name="routeLine" type="{http://webservices.maplink2.com.br}ArrayOfRouteLine" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RouteOptions", propOrder = {
    "language",
    "routeDetails",
    "vehicle",
    "routeLine"
})
public class RouteOptions {

    protected String language;
    @XmlElement(required = true)
    protected RouteDetails routeDetails;
    @XmlElement(required = true)
    protected Vehicle vehicle;
    protected ArrayOfRouteLine routeLine;

    /**
     * Obtém o valor da propriedade language.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Define o valor da propriedade language.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Obtém o valor da propriedade routeDetails.
     * 
     * @return
     *     possible object is
     *     {@link RouteDetails }
     *     
     */
    public RouteDetails getRouteDetails() {
        return routeDetails;
    }

    /**
     * Define o valor da propriedade routeDetails.
     * 
     * @param value
     *     allowed object is
     *     {@link RouteDetails }
     *     
     */
    public void setRouteDetails(RouteDetails value) {
        this.routeDetails = value;
    }

    /**
     * Obtém o valor da propriedade vehicle.
     * 
     * @return
     *     possible object is
     *     {@link Vehicle }
     *     
     */
    public Vehicle getVehicle() {
        return vehicle;
    }

    /**
     * Define o valor da propriedade vehicle.
     * 
     * @param value
     *     allowed object is
     *     {@link Vehicle }
     *     
     */
    public void setVehicle(Vehicle value) {
        this.vehicle = value;
    }

    /**
     * Obtém o valor da propriedade routeLine.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRouteLine }
     *     
     */
    public ArrayOfRouteLine getRouteLine() {
        return routeLine;
    }

    /**
     * Define o valor da propriedade routeLine.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRouteLine }
     *     
     */
    public void setRouteLine(ArrayOfRouteLine value) {
        this.routeLine = value;
    }

}

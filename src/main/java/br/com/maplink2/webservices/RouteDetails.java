
package br.com.maplink2.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de RouteDetails complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RouteDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="descriptionType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="routeType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="optimizeRoute" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="poiRoute" type="{http://webservices.maplink2.com.br}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="barriersList" type="{http://webservices.maplink2.com.br}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="barrierPoints" type="{http://webservices.maplink2.com.br}ArrayOfPoint" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RouteDetails", propOrder = {
    "descriptionType",
    "routeType",
    "optimizeRoute",
    "poiRoute",
    "barriersList",
    "barrierPoints"
})
public class RouteDetails {

    protected int descriptionType;
    protected int routeType;
    protected boolean optimizeRoute;
    protected ArrayOfString poiRoute;
    protected ArrayOfString barriersList;
    protected ArrayOfPoint barrierPoints;

    /**
     * Obtém o valor da propriedade descriptionType.
     * 
     */
    public int getDescriptionType() {
        return descriptionType;
    }

    /**
     * Define o valor da propriedade descriptionType.
     * 
     */
    public void setDescriptionType(int value) {
        this.descriptionType = value;
    }

    /**
     * Obtém o valor da propriedade routeType.
     * 
     */
    public int getRouteType() {
        return routeType;
    }

    /**
     * Define o valor da propriedade routeType.
     * 
     */
    public void setRouteType(int value) {
        this.routeType = value;
    }

    /**
     * Obtém o valor da propriedade optimizeRoute.
     * 
     */
    public boolean isOptimizeRoute() {
        return optimizeRoute;
    }

    /**
     * Define o valor da propriedade optimizeRoute.
     * 
     */
    public void setOptimizeRoute(boolean value) {
        this.optimizeRoute = value;
    }

    /**
     * Obtém o valor da propriedade poiRoute.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getPoiRoute() {
        return poiRoute;
    }

    /**
     * Define o valor da propriedade poiRoute.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setPoiRoute(ArrayOfString value) {
        this.poiRoute = value;
    }

    /**
     * Obtém o valor da propriedade barriersList.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getBarriersList() {
        return barriersList;
    }

    /**
     * Define o valor da propriedade barriersList.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setBarriersList(ArrayOfString value) {
        this.barriersList = value;
    }

    /**
     * Obtém o valor da propriedade barrierPoints.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPoint }
     *     
     */
    public ArrayOfPoint getBarrierPoints() {
        return barrierPoints;
    }

    /**
     * Define o valor da propriedade barrierPoints.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPoint }
     *     
     */
    public void setBarrierPoints(ArrayOfPoint value) {
        this.barrierPoints = value;
    }

}

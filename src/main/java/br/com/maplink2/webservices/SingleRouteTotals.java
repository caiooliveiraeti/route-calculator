
package br.com.maplink2.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de SingleRouteTotals complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="SingleRouteTotals">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="origin" type="{http://webservices.maplink2.com.br}RouteStop"/>
 *         &lt;element name="destin" type="{http://webservices.maplink2.com.br}RouteStop"/>
 *         &lt;element name="routeTotals" type="{http://webservices.maplink2.com.br}RouteTotals"/>
 *         &lt;element name="logRouteId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mapInfo" type="{http://webservices.maplink2.com.br}MapInfo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SingleRouteTotals", propOrder = {
    "origin",
    "destin",
    "routeTotals",
    "logRouteId",
    "mapInfo"
})
public class SingleRouteTotals {

    @XmlElement(required = true)
    protected RouteStop origin;
    @XmlElement(required = true)
    protected RouteStop destin;
    @XmlElement(required = true)
    protected RouteTotals routeTotals;
    protected String logRouteId;
    @XmlElement(required = true)
    protected MapInfo mapInfo;

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
     * Obtém o valor da propriedade destin.
     * 
     * @return
     *     possible object is
     *     {@link RouteStop }
     *     
     */
    public RouteStop getDestin() {
        return destin;
    }

    /**
     * Define o valor da propriedade destin.
     * 
     * @param value
     *     allowed object is
     *     {@link RouteStop }
     *     
     */
    public void setDestin(RouteStop value) {
        this.destin = value;
    }

    /**
     * Obtém o valor da propriedade routeTotals.
     * 
     * @return
     *     possible object is
     *     {@link RouteTotals }
     *     
     */
    public RouteTotals getRouteTotals() {
        return routeTotals;
    }

    /**
     * Define o valor da propriedade routeTotals.
     * 
     * @param value
     *     allowed object is
     *     {@link RouteTotals }
     *     
     */
    public void setRouteTotals(RouteTotals value) {
        this.routeTotals = value;
    }

    /**
     * Obtém o valor da propriedade logRouteId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogRouteId() {
        return logRouteId;
    }

    /**
     * Define o valor da propriedade logRouteId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogRouteId(String value) {
        this.logRouteId = value;
    }

    /**
     * Obtém o valor da propriedade mapInfo.
     * 
     * @return
     *     possible object is
     *     {@link MapInfo }
     *     
     */
    public MapInfo getMapInfo() {
        return mapInfo;
    }

    /**
     * Define o valor da propriedade mapInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link MapInfo }
     *     
     */
    public void setMapInfo(MapInfo value) {
        this.mapInfo = value;
    }

}


package br.com.maplink2.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de RouteInfo complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RouteInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="routeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MapInfo" type="{http://webservices.maplink2.com.br}MapInfo"/>
 *         &lt;element name="segDescription" type="{http://webservices.maplink2.com.br}ArrayOfSegmentDescription" minOccurs="0"/>
 *         &lt;element name="routeTotals" type="{http://webservices.maplink2.com.br}RouteTotals"/>
 *         &lt;element name="routeSummary" type="{http://webservices.maplink2.com.br}ArrayOfRouteSummary" minOccurs="0"/>
 *         &lt;element name="roadType" type="{http://webservices.maplink2.com.br}RoadType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RouteInfo", propOrder = {
    "routeId",
    "mapInfo",
    "segDescription",
    "routeTotals",
    "routeSummary",
    "roadType"
})
public class RouteInfo {

    protected String routeId;
    @XmlElement(name = "MapInfo", required = true)
    protected MapInfo mapInfo;
    protected ArrayOfSegmentDescription segDescription;
    @XmlElement(required = true)
    protected RouteTotals routeTotals;
    protected ArrayOfRouteSummary routeSummary;
    @XmlElement(required = true)
    protected RoadType roadType;

    /**
     * Obtém o valor da propriedade routeId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouteId() {
        return routeId;
    }

    /**
     * Define o valor da propriedade routeId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouteId(String value) {
        this.routeId = value;
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

    /**
     * Obtém o valor da propriedade segDescription.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSegmentDescription }
     *     
     */
    public ArrayOfSegmentDescription getSegDescription() {
        return segDescription;
    }

    /**
     * Define o valor da propriedade segDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSegmentDescription }
     *     
     */
    public void setSegDescription(ArrayOfSegmentDescription value) {
        this.segDescription = value;
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
     * Obtém o valor da propriedade routeSummary.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRouteSummary }
     *     
     */
    public ArrayOfRouteSummary getRouteSummary() {
        return routeSummary;
    }

    /**
     * Define o valor da propriedade routeSummary.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRouteSummary }
     *     
     */
    public void setRouteSummary(ArrayOfRouteSummary value) {
        this.routeSummary = value;
    }

    /**
     * Obtém o valor da propriedade roadType.
     * 
     * @return
     *     possible object is
     *     {@link RoadType }
     *     
     */
    public RoadType getRoadType() {
        return roadType;
    }

    /**
     * Define o valor da propriedade roadType.
     * 
     * @param value
     *     allowed object is
     *     {@link RoadType }
     *     
     */
    public void setRoadType(RoadType value) {
        this.roadType = value;
    }

}

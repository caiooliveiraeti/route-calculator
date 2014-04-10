
package br.com.maplink2.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de SegmentDescription complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="SegmentDescription">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="command" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="poiRoute" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="poiRouteDetails" type="{http://webservices.maplink2.com.br}ArrayOfPOIDetails" minOccurs="0"/>
 *         &lt;element name="city" type="{http://webservices.maplink2.com.br}City"/>
 *         &lt;element name="tollFee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tollFeeDetails" type="{http://webservices.maplink2.com.br}TollFeeDetails"/>
 *         &lt;element name="roadType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="distance" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="cumulativeDistance" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="point" type="{http://webservices.maplink2.com.br}Point"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SegmentDescription", propOrder = {
    "command",
    "description",
    "poiRoute",
    "poiRouteDetails",
    "city",
    "tollFee",
    "tollFeeDetails",
    "roadType",
    "distance",
    "cumulativeDistance",
    "point"
})
public class SegmentDescription {

    protected String command;
    protected String description;
    protected String poiRoute;
    protected ArrayOfPOIDetails poiRouteDetails;
    @XmlElement(required = true)
    protected City city;
    protected String tollFee;
    @XmlElement(required = true)
    protected TollFeeDetails tollFeeDetails;
    protected String roadType;
    protected double distance;
    protected double cumulativeDistance;
    @XmlElement(required = true)
    protected Point point;

    /**
     * Obtém o valor da propriedade command.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommand() {
        return command;
    }

    /**
     * Define o valor da propriedade command.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommand(String value) {
        this.command = value;
    }

    /**
     * Obtém o valor da propriedade description.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Define o valor da propriedade description.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Obtém o valor da propriedade poiRoute.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoiRoute() {
        return poiRoute;
    }

    /**
     * Define o valor da propriedade poiRoute.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoiRoute(String value) {
        this.poiRoute = value;
    }

    /**
     * Obtém o valor da propriedade poiRouteDetails.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPOIDetails }
     *     
     */
    public ArrayOfPOIDetails getPoiRouteDetails() {
        return poiRouteDetails;
    }

    /**
     * Define o valor da propriedade poiRouteDetails.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPOIDetails }
     *     
     */
    public void setPoiRouteDetails(ArrayOfPOIDetails value) {
        this.poiRouteDetails = value;
    }

    /**
     * Obtém o valor da propriedade city.
     * 
     * @return
     *     possible object is
     *     {@link City }
     *     
     */
    public City getCity() {
        return city;
    }

    /**
     * Define o valor da propriedade city.
     * 
     * @param value
     *     allowed object is
     *     {@link City }
     *     
     */
    public void setCity(City value) {
        this.city = value;
    }

    /**
     * Obtém o valor da propriedade tollFee.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTollFee() {
        return tollFee;
    }

    /**
     * Define o valor da propriedade tollFee.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTollFee(String value) {
        this.tollFee = value;
    }

    /**
     * Obtém o valor da propriedade tollFeeDetails.
     * 
     * @return
     *     possible object is
     *     {@link TollFeeDetails }
     *     
     */
    public TollFeeDetails getTollFeeDetails() {
        return tollFeeDetails;
    }

    /**
     * Define o valor da propriedade tollFeeDetails.
     * 
     * @param value
     *     allowed object is
     *     {@link TollFeeDetails }
     *     
     */
    public void setTollFeeDetails(TollFeeDetails value) {
        this.tollFeeDetails = value;
    }

    /**
     * Obtém o valor da propriedade roadType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoadType() {
        return roadType;
    }

    /**
     * Define o valor da propriedade roadType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoadType(String value) {
        this.roadType = value;
    }

    /**
     * Obtém o valor da propriedade distance.
     * 
     */
    public double getDistance() {
        return distance;
    }

    /**
     * Define o valor da propriedade distance.
     * 
     */
    public void setDistance(double value) {
        this.distance = value;
    }

    /**
     * Obtém o valor da propriedade cumulativeDistance.
     * 
     */
    public double getCumulativeDistance() {
        return cumulativeDistance;
    }

    /**
     * Define o valor da propriedade cumulativeDistance.
     * 
     */
    public void setCumulativeDistance(double value) {
        this.cumulativeDistance = value;
    }

    /**
     * Obtém o valor da propriedade point.
     * 
     * @return
     *     possible object is
     *     {@link Point }
     *     
     */
    public Point getPoint() {
        return point;
    }

    /**
     * Define o valor da propriedade point.
     * 
     * @param value
     *     allowed object is
     *     {@link Point }
     *     
     */
    public void setPoint(Point value) {
        this.point = value;
    }

}

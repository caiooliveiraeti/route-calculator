
package br.com.maplink2.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de CityLocation complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CityLocation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="city" type="{http://webservices.maplink2.com.br}City"/>
 *         &lt;element name="point" type="{http://webservices.maplink2.com.br}Point"/>
 *         &lt;element name="carAccess" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="zipRangeStart" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="zipRangeEnd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="capital" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CityLocation", propOrder = {
    "city",
    "point",
    "carAccess",
    "zipRangeStart",
    "zipRangeEnd",
    "capital"
})
public class CityLocation {

    @XmlElement(required = true)
    protected City city;
    @XmlElement(required = true)
    protected Point point;
    protected boolean carAccess;
    protected String zipRangeStart;
    protected String zipRangeEnd;
    protected boolean capital;

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

    /**
     * Obtém o valor da propriedade carAccess.
     * 
     */
    public boolean isCarAccess() {
        return carAccess;
    }

    /**
     * Define o valor da propriedade carAccess.
     * 
     */
    public void setCarAccess(boolean value) {
        this.carAccess = value;
    }

    /**
     * Obtém o valor da propriedade zipRangeStart.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZipRangeStart() {
        return zipRangeStart;
    }

    /**
     * Define o valor da propriedade zipRangeStart.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZipRangeStart(String value) {
        this.zipRangeStart = value;
    }

    /**
     * Obtém o valor da propriedade zipRangeEnd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZipRangeEnd() {
        return zipRangeEnd;
    }

    /**
     * Define o valor da propriedade zipRangeEnd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZipRangeEnd(String value) {
        this.zipRangeEnd = value;
    }

    /**
     * Obtém o valor da propriedade capital.
     * 
     */
    public boolean isCapital() {
        return capital;
    }

    /**
     * Define o valor da propriedade capital.
     * 
     */
    public void setCapital(boolean value) {
        this.capital = value;
    }

}

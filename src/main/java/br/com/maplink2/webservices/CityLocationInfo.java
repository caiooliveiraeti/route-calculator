
package br.com.maplink2.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de CityLocationInfo complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CityLocationInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="recordCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="pageCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="cityLocation" type="{http://webservices.maplink2.com.br}ArrayOfCityLocation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CityLocationInfo", propOrder = {
    "recordCount",
    "pageCount",
    "cityLocation"
})
public class CityLocationInfo {

    protected int recordCount;
    protected int pageCount;
    protected ArrayOfCityLocation cityLocation;

    /**
     * Obtém o valor da propriedade recordCount.
     * 
     */
    public int getRecordCount() {
        return recordCount;
    }

    /**
     * Define o valor da propriedade recordCount.
     * 
     */
    public void setRecordCount(int value) {
        this.recordCount = value;
    }

    /**
     * Obtém o valor da propriedade pageCount.
     * 
     */
    public int getPageCount() {
        return pageCount;
    }

    /**
     * Define o valor da propriedade pageCount.
     * 
     */
    public void setPageCount(int value) {
        this.pageCount = value;
    }

    /**
     * Obtém o valor da propriedade cityLocation.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCityLocation }
     *     
     */
    public ArrayOfCityLocation getCityLocation() {
        return cityLocation;
    }

    /**
     * Define o valor da propriedade cityLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCityLocation }
     *     
     */
    public void setCityLocation(ArrayOfCityLocation value) {
        this.cityLocation = value;
    }

}

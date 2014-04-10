
package br.com.maplink2.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de AddressLocation complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="AddressLocation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="address" type="{http://webservices.maplink2.com.br}Address"/>
 *         &lt;element name="zipL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="zipR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="carAccess" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="dataSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "AddressLocation", propOrder = {
    "key",
    "address",
    "zipL",
    "zipR",
    "carAccess",
    "dataSource",
    "point"
})
public class AddressLocation {

    protected String key;
    @XmlElement(required = true)
    protected Address address;
    protected String zipL;
    protected String zipR;
    protected boolean carAccess;
    protected String dataSource;
    @XmlElement(required = true)
    protected Point point;

    /**
     * Obtém o valor da propriedade key.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * Define o valor da propriedade key.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey(String value) {
        this.key = value;
    }

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
     * Obtém o valor da propriedade zipL.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZipL() {
        return zipL;
    }

    /**
     * Define o valor da propriedade zipL.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZipL(String value) {
        this.zipL = value;
    }

    /**
     * Obtém o valor da propriedade zipR.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZipR() {
        return zipR;
    }

    /**
     * Define o valor da propriedade zipR.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZipR(String value) {
        this.zipR = value;
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
     * Obtém o valor da propriedade dataSource.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataSource() {
        return dataSource;
    }

    /**
     * Define o valor da propriedade dataSource.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataSource(String value) {
        this.dataSource = value;
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

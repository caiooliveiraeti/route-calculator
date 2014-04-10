
package br.com.maplink2.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de RouteLine complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RouteLine">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="width" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RGB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transparency" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RouteLine", propOrder = {
    "width",
    "rgb",
    "transparency"
})
public class RouteLine {

    protected int width;
    @XmlElement(name = "RGB")
    protected String rgb;
    protected double transparency;

    /**
     * Obtém o valor da propriedade width.
     * 
     */
    public int getWidth() {
        return width;
    }

    /**
     * Define o valor da propriedade width.
     * 
     */
    public void setWidth(int value) {
        this.width = value;
    }

    /**
     * Obtém o valor da propriedade rgb.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRGB() {
        return rgb;
    }

    /**
     * Define o valor da propriedade rgb.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRGB(String value) {
        this.rgb = value;
    }

    /**
     * Obtém o valor da propriedade transparency.
     * 
     */
    public double getTransparency() {
        return transparency;
    }

    /**
     * Define o valor da propriedade transparency.
     * 
     */
    public void setTransparency(double value) {
        this.transparency = value;
    }

}

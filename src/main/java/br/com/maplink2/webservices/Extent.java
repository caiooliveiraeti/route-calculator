
package br.com.maplink2.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de Extent complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Extent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="XMin" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="YMin" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="XMax" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="YMax" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Extent", propOrder = {
    "xMin",
    "yMin",
    "xMax",
    "yMax"
})
public class Extent {

    @XmlElement(name = "XMin")
    protected double xMin;
    @XmlElement(name = "YMin")
    protected double yMin;
    @XmlElement(name = "XMax")
    protected double xMax;
    @XmlElement(name = "YMax")
    protected double yMax;

    /**
     * Obtém o valor da propriedade xMin.
     * 
     */
    public double getXMin() {
        return xMin;
    }

    /**
     * Define o valor da propriedade xMin.
     * 
     */
    public void setXMin(double value) {
        this.xMin = value;
    }

    /**
     * Obtém o valor da propriedade yMin.
     * 
     */
    public double getYMin() {
        return yMin;
    }

    /**
     * Define o valor da propriedade yMin.
     * 
     */
    public void setYMin(double value) {
        this.yMin = value;
    }

    /**
     * Obtém o valor da propriedade xMax.
     * 
     */
    public double getXMax() {
        return xMax;
    }

    /**
     * Define o valor da propriedade xMax.
     * 
     */
    public void setXMax(double value) {
        this.xMax = value;
    }

    /**
     * Obtém o valor da propriedade yMax.
     * 
     */
    public double getYMax() {
        return yMax;
    }

    /**
     * Define o valor da propriedade yMax.
     * 
     */
    public void setYMax(double value) {
        this.yMax = value;
    }

}

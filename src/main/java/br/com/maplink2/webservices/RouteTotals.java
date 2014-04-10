
package br.com.maplink2.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de RouteTotals complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RouteTotals">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="totalDistance" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="totalTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalFuelUsed" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="totaltollFeeCost" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="totalfuelCost" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="totalCost" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="taxiFare1" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="taxiFare2" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RouteTotals", propOrder = {
    "totalDistance",
    "totalTime",
    "totalFuelUsed",
    "totaltollFeeCost",
    "totalfuelCost",
    "totalCost",
    "taxiFare1",
    "taxiFare2"
})
public class RouteTotals {

    protected double totalDistance;
    protected String totalTime;
    protected double totalFuelUsed;
    protected double totaltollFeeCost;
    protected double totalfuelCost;
    protected double totalCost;
    protected double taxiFare1;
    protected double taxiFare2;

    /**
     * Obtém o valor da propriedade totalDistance.
     * 
     */
    public double getTotalDistance() {
        return totalDistance;
    }

    /**
     * Define o valor da propriedade totalDistance.
     * 
     */
    public void setTotalDistance(double value) {
        this.totalDistance = value;
    }

    /**
     * Obtém o valor da propriedade totalTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalTime() {
        return totalTime;
    }

    /**
     * Define o valor da propriedade totalTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalTime(String value) {
        this.totalTime = value;
    }

    /**
     * Obtém o valor da propriedade totalFuelUsed.
     * 
     */
    public double getTotalFuelUsed() {
        return totalFuelUsed;
    }

    /**
     * Define o valor da propriedade totalFuelUsed.
     * 
     */
    public void setTotalFuelUsed(double value) {
        this.totalFuelUsed = value;
    }

    /**
     * Obtém o valor da propriedade totaltollFeeCost.
     * 
     */
    public double getTotaltollFeeCost() {
        return totaltollFeeCost;
    }

    /**
     * Define o valor da propriedade totaltollFeeCost.
     * 
     */
    public void setTotaltollFeeCost(double value) {
        this.totaltollFeeCost = value;
    }

    /**
     * Obtém o valor da propriedade totalfuelCost.
     * 
     */
    public double getTotalfuelCost() {
        return totalfuelCost;
    }

    /**
     * Define o valor da propriedade totalfuelCost.
     * 
     */
    public void setTotalfuelCost(double value) {
        this.totalfuelCost = value;
    }

    /**
     * Obtém o valor da propriedade totalCost.
     * 
     */
    public double getTotalCost() {
        return totalCost;
    }

    /**
     * Define o valor da propriedade totalCost.
     * 
     */
    public void setTotalCost(double value) {
        this.totalCost = value;
    }

    /**
     * Obtém o valor da propriedade taxiFare1.
     * 
     */
    public double getTaxiFare1() {
        return taxiFare1;
    }

    /**
     * Define o valor da propriedade taxiFare1.
     * 
     */
    public void setTaxiFare1(double value) {
        this.taxiFare1 = value;
    }

    /**
     * Obtém o valor da propriedade taxiFare2.
     * 
     */
    public double getTaxiFare2() {
        return taxiFare2;
    }

    /**
     * Define o valor da propriedade taxiFare2.
     * 
     */
    public void setTaxiFare2(double value) {
        this.taxiFare2 = value;
    }

}

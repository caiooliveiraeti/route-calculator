
package br.com.maplink2.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de Vehicle complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Vehicle">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tankCapacity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="averageConsumption" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="fuelPrice" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="averageSpeed" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="tollFeeCat" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Vehicle", propOrder = {
    "tankCapacity",
    "averageConsumption",
    "fuelPrice",
    "averageSpeed",
    "tollFeeCat"
})
public class Vehicle {

    protected int tankCapacity;
    protected float averageConsumption;
    protected double fuelPrice;
    protected int averageSpeed;
    protected int tollFeeCat;

    /**
     * Obtém o valor da propriedade tankCapacity.
     * 
     */
    public int getTankCapacity() {
        return tankCapacity;
    }

    /**
     * Define o valor da propriedade tankCapacity.
     * 
     */
    public void setTankCapacity(int value) {
        this.tankCapacity = value;
    }

    /**
     * Obtém o valor da propriedade averageConsumption.
     * 
     */
    public float getAverageConsumption() {
        return averageConsumption;
    }

    /**
     * Define o valor da propriedade averageConsumption.
     * 
     */
    public void setAverageConsumption(float value) {
        this.averageConsumption = value;
    }

    /**
     * Obtém o valor da propriedade fuelPrice.
     * 
     */
    public double getFuelPrice() {
        return fuelPrice;
    }

    /**
     * Define o valor da propriedade fuelPrice.
     * 
     */
    public void setFuelPrice(double value) {
        this.fuelPrice = value;
    }

    /**
     * Obtém o valor da propriedade averageSpeed.
     * 
     */
    public int getAverageSpeed() {
        return averageSpeed;
    }

    /**
     * Define o valor da propriedade averageSpeed.
     * 
     */
    public void setAverageSpeed(int value) {
        this.averageSpeed = value;
    }

    /**
     * Obtém o valor da propriedade tollFeeCat.
     * 
     */
    public int getTollFeeCat() {
        return tollFeeCat;
    }

    /**
     * Define o valor da propriedade tollFeeCat.
     * 
     */
    public void setTollFeeCat(int value) {
        this.tollFeeCat = value;
    }

}

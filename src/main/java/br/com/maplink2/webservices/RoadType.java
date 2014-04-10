
package br.com.maplink2.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de RoadType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RoadType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="twoLaneHighway" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="secondLaneUnderConstruction" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="oneLaneRoadway" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="pavingWorkInProgress" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="dirtRoad" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="roadwayInPoorConditions" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="ferry" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoadType", propOrder = {
    "twoLaneHighway",
    "secondLaneUnderConstruction",
    "oneLaneRoadway",
    "pavingWorkInProgress",
    "dirtRoad",
    "roadwayInPoorConditions",
    "ferry"
})
public class RoadType {

    protected double twoLaneHighway;
    protected double secondLaneUnderConstruction;
    protected double oneLaneRoadway;
    protected double pavingWorkInProgress;
    protected double dirtRoad;
    protected double roadwayInPoorConditions;
    protected double ferry;

    /**
     * Obtém o valor da propriedade twoLaneHighway.
     * 
     */
    public double getTwoLaneHighway() {
        return twoLaneHighway;
    }

    /**
     * Define o valor da propriedade twoLaneHighway.
     * 
     */
    public void setTwoLaneHighway(double value) {
        this.twoLaneHighway = value;
    }

    /**
     * Obtém o valor da propriedade secondLaneUnderConstruction.
     * 
     */
    public double getSecondLaneUnderConstruction() {
        return secondLaneUnderConstruction;
    }

    /**
     * Define o valor da propriedade secondLaneUnderConstruction.
     * 
     */
    public void setSecondLaneUnderConstruction(double value) {
        this.secondLaneUnderConstruction = value;
    }

    /**
     * Obtém o valor da propriedade oneLaneRoadway.
     * 
     */
    public double getOneLaneRoadway() {
        return oneLaneRoadway;
    }

    /**
     * Define o valor da propriedade oneLaneRoadway.
     * 
     */
    public void setOneLaneRoadway(double value) {
        this.oneLaneRoadway = value;
    }

    /**
     * Obtém o valor da propriedade pavingWorkInProgress.
     * 
     */
    public double getPavingWorkInProgress() {
        return pavingWorkInProgress;
    }

    /**
     * Define o valor da propriedade pavingWorkInProgress.
     * 
     */
    public void setPavingWorkInProgress(double value) {
        this.pavingWorkInProgress = value;
    }

    /**
     * Obtém o valor da propriedade dirtRoad.
     * 
     */
    public double getDirtRoad() {
        return dirtRoad;
    }

    /**
     * Define o valor da propriedade dirtRoad.
     * 
     */
    public void setDirtRoad(double value) {
        this.dirtRoad = value;
    }

    /**
     * Obtém o valor da propriedade roadwayInPoorConditions.
     * 
     */
    public double getRoadwayInPoorConditions() {
        return roadwayInPoorConditions;
    }

    /**
     * Define o valor da propriedade roadwayInPoorConditions.
     * 
     */
    public void setRoadwayInPoorConditions(double value) {
        this.roadwayInPoorConditions = value;
    }

    /**
     * Obtém o valor da propriedade ferry.
     * 
     */
    public double getFerry() {
        return ferry;
    }

    /**
     * Define o valor da propriedade ferry.
     * 
     */
    public void setFerry(double value) {
        this.ferry = value;
    }

}

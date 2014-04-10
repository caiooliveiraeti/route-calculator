
package br.com.maplink2.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de AddressOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="AddressOptions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="matchType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="usePhonetic" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="searchType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="resultRange" type="{http://webservices.maplink2.com.br}ResultRange"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressOptions", propOrder = {
    "matchType",
    "usePhonetic",
    "searchType",
    "resultRange"
})
public class AddressOptions {

    protected int matchType;
    protected boolean usePhonetic;
    protected int searchType;
    @XmlElement(required = true)
    protected ResultRange resultRange;

    /**
     * Obtém o valor da propriedade matchType.
     * 
     */
    public int getMatchType() {
        return matchType;
    }

    /**
     * Define o valor da propriedade matchType.
     * 
     */
    public void setMatchType(int value) {
        this.matchType = value;
    }

    /**
     * Obtém o valor da propriedade usePhonetic.
     * 
     */
    public boolean isUsePhonetic() {
        return usePhonetic;
    }

    /**
     * Define o valor da propriedade usePhonetic.
     * 
     */
    public void setUsePhonetic(boolean value) {
        this.usePhonetic = value;
    }

    /**
     * Obtém o valor da propriedade searchType.
     * 
     */
    public int getSearchType() {
        return searchType;
    }

    /**
     * Define o valor da propriedade searchType.
     * 
     */
    public void setSearchType(int value) {
        this.searchType = value;
    }

    /**
     * Obtém o valor da propriedade resultRange.
     * 
     * @return
     *     possible object is
     *     {@link ResultRange }
     *     
     */
    public ResultRange getResultRange() {
        return resultRange;
    }

    /**
     * Define o valor da propriedade resultRange.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultRange }
     *     
     */
    public void setResultRange(ResultRange value) {
        this.resultRange = value;
    }

}

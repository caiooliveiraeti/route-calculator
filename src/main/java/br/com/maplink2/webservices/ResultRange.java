
package br.com.maplink2.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ResultRange complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ResultRange">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pageIndex" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="recordsPerPage" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResultRange", propOrder = {
    "pageIndex",
    "recordsPerPage"
})
public class ResultRange {

    protected int pageIndex;
    protected int recordsPerPage;

    /**
     * Obtém o valor da propriedade pageIndex.
     * 
     */
    public int getPageIndex() {
        return pageIndex;
    }

    /**
     * Define o valor da propriedade pageIndex.
     * 
     */
    public void setPageIndex(int value) {
        this.pageIndex = value;
    }

    /**
     * Obtém o valor da propriedade recordsPerPage.
     * 
     */
    public int getRecordsPerPage() {
        return recordsPerPage;
    }

    /**
     * Define o valor da propriedade recordsPerPage.
     * 
     */
    public void setRecordsPerPage(int value) {
        this.recordsPerPage = value;
    }

}

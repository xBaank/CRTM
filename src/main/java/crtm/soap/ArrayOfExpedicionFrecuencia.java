
package crtm.soap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfExpedicionFrecuencia complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfExpedicionFrecuencia">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Expedicion_de_Frecuencia" type="{GEIS.MultimodalInfoWebService}ExpedicionFrecuencia" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfExpedicionFrecuencia", propOrder = {
    "expedicionDeFrecuencia"
})
public class ArrayOfExpedicionFrecuencia {

    @XmlElement(name = "Expedicion_de_Frecuencia", nillable = true)
    protected List<ExpedicionFrecuencia> expedicionDeFrecuencia;

    /**
     * Gets the value of the expedicionDeFrecuencia property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the expedicionDeFrecuencia property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExpedicionDeFrecuencia().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExpedicionFrecuencia }
     * 
     * 
     */
    public List<ExpedicionFrecuencia> getExpedicionDeFrecuencia() {
        if (expedicionDeFrecuencia == null) {
            expedicionDeFrecuencia = new ArrayList<ExpedicionFrecuencia>();
        }
        return this.expedicionDeFrecuencia;
    }

}

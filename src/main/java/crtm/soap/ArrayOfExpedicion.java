
package crtm.soap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfExpedicion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfExpedicion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Expedicion" type="{GEIS.MultimodalInfoWebService}Expedicion" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfExpedicion", propOrder = {
    "expedicion"
})
public class ArrayOfExpedicion {

    @XmlElement(name = "Expedicion", nillable = true)
    protected List<Expedicion> expedicion;

    /**
     * Gets the value of the expedicion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the expedicion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExpedicion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Expedicion }
     * 
     * 
     */
    public List<Expedicion> getExpedicion() {
        if (expedicion == null) {
            expedicion = new ArrayList<Expedicion>();
        }
        return this.expedicion;
    }

}

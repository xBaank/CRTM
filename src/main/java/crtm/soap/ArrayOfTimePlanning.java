
package crtm.soap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfTimePlanning complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfTimePlanning">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TimePlanning" type="{GEIS.MultimodalInfoWebService}TimePlanning" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfTimePlanning", propOrder = {
    "timePlanning"
})
public class ArrayOfTimePlanning {

    @XmlElement(name = "TimePlanning", nillable = true)
    protected List<TimePlanning> timePlanning;

    /**
     * Gets the value of the timePlanning property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the timePlanning property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTimePlanning().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TimePlanning }
     * 
     * 
     */
    public List<TimePlanning> getTimePlanning() {
        if (timePlanning == null) {
            timePlanning = new ArrayList<TimePlanning>();
        }
        return this.timePlanning;
    }

}

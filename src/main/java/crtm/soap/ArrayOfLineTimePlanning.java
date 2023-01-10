
package crtm.soap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfLineTimePlanning complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfLineTimePlanning">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LineTimePlanning" type="{GEIS.MultimodalInfoWebService}LineTimePlanning" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfLineTimePlanning", propOrder = {
    "lineTimePlanning"
})
public class ArrayOfLineTimePlanning {

    @XmlElement(name = "LineTimePlanning", nillable = true)
    protected List<LineTimePlanning> lineTimePlanning;

    /**
     * Gets the value of the lineTimePlanning property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lineTimePlanning property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLineTimePlanning().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LineTimePlanning }
     * 
     * 
     */
    public List<LineTimePlanning> getLineTimePlanning() {
        if (lineTimePlanning == null) {
            lineTimePlanning = new ArrayList<LineTimePlanning>();
        }
        return this.lineTimePlanning;
    }

}

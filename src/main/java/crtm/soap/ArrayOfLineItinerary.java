
package crtm.soap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfLineItinerary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfLineItinerary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LineItinerary" type="{GEIS.MultimodalInfoWebService}LineItinerary" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfLineItinerary", propOrder = {
    "lineItinerary"
})
public class ArrayOfLineItinerary {

    @XmlElement(name = "LineItinerary", nillable = true)
    protected List<LineItinerary> lineItinerary;

    /**
     * Gets the value of the lineItinerary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lineItinerary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLineItinerary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LineItinerary }
     * 
     * 
     */
    public List<LineItinerary> getLineItinerary() {
        if (lineItinerary == null) {
            lineItinerary = new ArrayList<LineItinerary>();
        }
        return this.lineItinerary;
    }

}

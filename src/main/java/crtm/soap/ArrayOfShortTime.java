
package crtm.soap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfShortTime complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfShortTime">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ShortTime" type="{GEIS.MultimodalInfoWebService}ShortTime" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfShortTime", propOrder = {
    "shortTime"
})
public class ArrayOfShortTime {

    @XmlElement(name = "ShortTime", nillable = true)
    protected List<ShortTime> shortTime;

    /**
     * Gets the value of the shortTime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shortTime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShortTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShortTime }
     * 
     * 
     */
    public List<ShortTime> getShortTime() {
        if (shortTime == null) {
            shortTime = new ArrayList<ShortTime>();
        }
        return this.shortTime;
    }

}

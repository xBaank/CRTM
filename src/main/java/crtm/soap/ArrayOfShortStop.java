
package crtm.soap;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfShortStop complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfShortStop">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ShortStop" type="{GEIS.MultimodalInfoWebService}ShortStop" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfShortStop", propOrder = {
    "shortStop"
})
public class ArrayOfShortStop {

    @XmlElement(name = "ShortStop", nillable = true)
    protected List<ShortStop> shortStop;

    /**
     * Gets the value of the shortStop property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the shortStop property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShortStop().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShortStop }
     * 
     * 
     * @return
     *     The value of the shortStop property.
     */
    public List<ShortStop> getShortStop() {
        if (shortStop == null) {
            shortStop = new ArrayList<>();
        }
        return this.shortStop;
    }

}

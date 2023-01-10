
package crtm.soap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfStepsStop complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfStepsStop">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StepsStop" type="{GEIS.MultimodalInfoWebService}StepsStop" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfStepsStop", propOrder = {
    "stepsStop"
})
public class ArrayOfStepsStop {

    @XmlElement(name = "StepsStop", nillable = true)
    protected List<StepsStop> stepsStop;

    /**
     * Gets the value of the stepsStop property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stepsStop property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStepsStop().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StepsStop }
     * 
     * 
     */
    public List<StepsStop> getStepsStop() {
        if (stepsStop == null) {
            stepsStop = new ArrayList<StepsStop>();
        }
        return this.stepsStop;
    }

}

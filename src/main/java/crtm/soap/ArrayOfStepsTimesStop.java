
package crtm.soap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfStepsTimesStop complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfStepsTimesStop">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StepsTimesStop" type="{GEIS.MultimodalInfoWebService}StepsTimesStop" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfStepsTimesStop", propOrder = {
    "stepsTimesStop"
})
public class ArrayOfStepsTimesStop {

    @XmlElement(name = "StepsTimesStop", nillable = true)
    protected List<StepsTimesStop> stepsTimesStop;

    /**
     * Gets the value of the stepsTimesStop property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stepsTimesStop property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStepsTimesStop().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StepsTimesStop }
     * 
     * 
     */
    public List<StepsTimesStop> getStepsTimesStop() {
        if (stepsTimesStop == null) {
            stepsTimesStop = new ArrayList<StepsTimesStop>();
        }
        return this.stepsTimesStop;
    }

}

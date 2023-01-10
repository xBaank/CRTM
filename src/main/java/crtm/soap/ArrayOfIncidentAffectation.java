
package crtm.soap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfIncidentAffectation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfIncidentAffectation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IncidentAffectation" type="{GEIS.MultimodalInfoWebService}IncidentAffectation" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfIncidentAffectation", propOrder = {
    "incidentAffectation"
})
public class ArrayOfIncidentAffectation {

    @XmlElement(name = "IncidentAffectation", nillable = true)
    protected List<IncidentAffectation> incidentAffectation;

    /**
     * Gets the value of the incidentAffectation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the incidentAffectation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncidentAffectation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IncidentAffectation }
     * 
     * 
     */
    public List<IncidentAffectation> getIncidentAffectation() {
        if (incidentAffectation == null) {
            incidentAffectation = new ArrayList<IncidentAffectation>();
        }
        return this.incidentAffectation;
    }

}

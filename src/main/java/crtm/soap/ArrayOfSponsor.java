
package crtm.soap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfSponsor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSponsor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Sponsor" type="{GEIS.MultimodalInfoWebService}Sponsor" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSponsor", propOrder = {
    "sponsor"
})
public class ArrayOfSponsor {

    @XmlElement(name = "Sponsor", nillable = true)
    protected List<Sponsor> sponsor;

    /**
     * Gets the value of the sponsor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sponsor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSponsor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Sponsor }
     * 
     * 
     */
    public List<Sponsor> getSponsor() {
        if (sponsor == null) {
            sponsor = new ArrayList<Sponsor>();
        }
        return this.sponsor;
    }

}

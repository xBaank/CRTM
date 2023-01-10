
package crtm.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sponsors" type="{GEIS.MultimodalInfoWebService}ArrayOfSponsor" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "sponsors"
})
@XmlRootElement(name = "SponsorResponse")
public class SponsorResponse {

    protected ArrayOfSponsor sponsors;

    /**
     * Gets the value of the sponsors property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSponsor }
     *     
     */
    public ArrayOfSponsor getSponsors() {
        return sponsors;
    }

    /**
     * Sets the value of the sponsors property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSponsor }
     *     
     */
    public void setSponsors(ArrayOfSponsor value) {
        this.sponsors = value;
    }

}

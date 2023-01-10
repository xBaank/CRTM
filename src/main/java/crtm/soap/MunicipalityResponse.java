
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
 *         &lt;element name="municipalities" type="{GEIS.MultimodalInfoWebService}ArrayOfMunicipality" minOccurs="0"/>
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
    "municipalities"
})
@XmlRootElement(name = "MunicipalityResponse")
public class MunicipalityResponse {

    protected ArrayOfMunicipality municipalities;

    /**
     * Gets the value of the municipalities property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMunicipality }
     *     
     */
    public ArrayOfMunicipality getMunicipalities() {
        return municipalities;
    }

    /**
     * Sets the value of the municipalities property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMunicipality }
     *     
     */
    public void setMunicipalities(ArrayOfMunicipality value) {
        this.municipalities = value;
    }

}

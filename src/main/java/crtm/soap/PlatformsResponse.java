
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
 *         &lt;element name="platforms" type="{GEIS.MultimodalInfoWebService}ArrayOfPlatform" minOccurs="0"/>
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
    "platforms"
})
@XmlRootElement(name = "PlatformsResponse")
public class PlatformsResponse {

    protected ArrayOfPlatform platforms;

    /**
     * Gets the value of the platforms property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPlatform }
     *     
     */
    public ArrayOfPlatform getPlatforms() {
        return platforms;
    }

    /**
     * Sets the value of the platforms property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPlatform }
     *     
     */
    public void setPlatforms(ArrayOfPlatform value) {
        this.platforms = value;
    }

}

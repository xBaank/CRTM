
package crtm.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BannerInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BannerInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="banners" type="{GEIS.MultimodalInfoWebService}ArrayOfBanner" minOccurs="0"/>
 *         &lt;element name="max" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BannerInfo", propOrder = {
    "banners",
    "max"
})
public class BannerInfo {

    protected ArrayOfBanner banners;
    protected int max;

    /**
     * Gets the value of the banners property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBanner }
     *     
     */
    public ArrayOfBanner getBanners() {
        return banners;
    }

    /**
     * Sets the value of the banners property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBanner }
     *     
     */
    public void setBanners(ArrayOfBanner value) {
        this.banners = value;
    }

    /**
     * Gets the value of the max property.
     * 
     */
    public int getMax() {
        return max;
    }

    /**
     * Sets the value of the max property.
     * 
     */
    public void setMax(int value) {
        this.max = value;
    }

}

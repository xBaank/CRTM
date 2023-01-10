
package crtm.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="authentication" type="{GEIS.MultimodalInfoWebService}AuthHeader" minOccurs="0"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="filterOffices" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="filterPoints" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "authentication",
    "type",
    "filterOffices",
    "filterPoints"
})
@XmlRootElement(name = "OfficeRequest")
public class OfficeRequest {

    protected AuthHeader authentication;
    protected String type;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer filterOffices;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer filterPoints;

    /**
     * Gets the value of the authentication property.
     * 
     * @return
     *     possible object is
     *     {@link AuthHeader }
     *     
     */
    public AuthHeader getAuthentication() {
        return authentication;
    }

    /**
     * Sets the value of the authentication property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthHeader }
     *     
     */
    public void setAuthentication(AuthHeader value) {
        this.authentication = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the filterOffices property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFilterOffices() {
        return filterOffices;
    }

    /**
     * Sets the value of the filterOffices property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFilterOffices(Integer value) {
        this.filterOffices = value;
    }

    /**
     * Gets the value of the filterPoints property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFilterPoints() {
        return filterPoints;
    }

    /**
     * Sets the value of the filterPoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFilterPoints(Integer value) {
        this.filterPoints = value;
    }

}

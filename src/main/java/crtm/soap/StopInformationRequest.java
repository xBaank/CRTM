
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
 *         &lt;element name="authentication" type="{GEIS.MultimodalInfoWebService}AuthHeader" minOccurs="0"/>
 *         &lt;element name="codMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codMunicipality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codLine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codStop" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "codMode",
    "codMunicipality",
    "codLine",
    "codStop"
})
@XmlRootElement(name = "StopInformationRequest")
public class StopInformationRequest {

    protected AuthHeader authentication;
    protected String codMode;
    protected String codMunicipality;
    protected String codLine;
    protected String codStop;

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
     * Gets the value of the codMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodMode() {
        return codMode;
    }

    /**
     * Sets the value of the codMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodMode(String value) {
        this.codMode = value;
    }

    /**
     * Gets the value of the codMunicipality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodMunicipality() {
        return codMunicipality;
    }

    /**
     * Sets the value of the codMunicipality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodMunicipality(String value) {
        this.codMunicipality = value;
    }

    /**
     * Gets the value of the codLine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodLine() {
        return codLine;
    }

    /**
     * Sets the value of the codLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodLine(String value) {
        this.codLine = value;
    }

    /**
     * Gets the value of the codStop property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodStop() {
        return codStop;
    }

    /**
     * Sets the value of the codStop property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodStop(String value) {
        this.codStop = value;
    }

}

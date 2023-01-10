
package crtm.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for App complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="App">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="kmls" type="{GEIS.MultimodalInfoWebService}ArrayOfKML" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "App", propOrder = {
    "name",
    "kmls"
})
public class App {

    protected String name;
    protected ArrayOfKML kmls;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the kmls property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfKML }
     *     
     */
    public ArrayOfKML getKmls() {
        return kmls;
    }

    /**
     * Sets the value of the kmls property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKML }
     *     
     */
    public void setKmls(ArrayOfKML value) {
        this.kmls = value;
    }

}

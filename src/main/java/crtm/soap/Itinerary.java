
package crtm.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Itinerary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Itinerary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codItinerary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="direction" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="kml" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stops" type="{GEIS.MultimodalInfoWebService}ArrayOfStopInformation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Itinerary", propOrder = {
    "codItinerary",
    "name",
    "direction",
    "kml",
    "stops"
})
public class Itinerary {

    protected String codItinerary;
    protected String name;
    protected int direction;
    protected String kml;
    protected ArrayOfStopInformation stops;

    /**
     * Gets the value of the codItinerary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodItinerary() {
        return codItinerary;
    }

    /**
     * Sets the value of the codItinerary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodItinerary(String value) {
        this.codItinerary = value;
    }

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
     * Gets the value of the direction property.
     * 
     */
    public int getDirection() {
        return direction;
    }

    /**
     * Sets the value of the direction property.
     * 
     */
    public void setDirection(int value) {
        this.direction = value;
    }

    /**
     * Gets the value of the kml property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKml() {
        return kml;
    }

    /**
     * Sets the value of the kml property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKml(String value) {
        this.kml = value;
    }

    /**
     * Gets the value of the stops property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStopInformation }
     *     
     */
    public ArrayOfStopInformation getStops() {
        return stops;
    }

    /**
     * Sets the value of the stops property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStopInformation }
     *     
     */
    public void setStops(ArrayOfStopInformation value) {
        this.stops = value;
    }

}

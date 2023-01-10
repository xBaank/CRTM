
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
 *         &lt;element name="ServiciosHorarios" type="{GEIS.MultimodalInfoWebService}ArrayOfServicioHorario" minOccurs="0"/>
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
    "serviciosHorarios"
})
@XmlRootElement(name = "CalendarsResponse")
public class CalendarsResponse {

    @XmlElement(name = "ServiciosHorarios")
    protected ArrayOfServicioHorario serviciosHorarios;

    /**
     * Gets the value of the serviciosHorarios property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfServicioHorario }
     *     
     */
    public ArrayOfServicioHorario getServiciosHorarios() {
        return serviciosHorarios;
    }

    /**
     * Sets the value of the serviciosHorarios property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfServicioHorario }
     *     
     */
    public void setServiciosHorarios(ArrayOfServicioHorario value) {
        this.serviciosHorarios = value;
    }

}


package crtm.soap;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TipoExpedicion.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TipoExpedicion">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CAMBIO_DE_LINEA"/>
 *     &lt;enumeration value="ENCIERRO"/>
 *     &lt;enumeration value="EN_SERVICIO"/>
 *     &lt;enumeration value="REFUERZO"/>
 *     &lt;enumeration value="SALIDA"/>
 *     &lt;enumeration value="EN_VACIO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TipoExpedicion")
@XmlEnum
public enum TipoExpedicion {

    CAMBIO_DE_LINEA,
    ENCIERRO,
    EN_SERVICIO,
    REFUERZO,
    SALIDA,
    EN_VACIO;

    public String value() {
        return name();
    }

    public static TipoExpedicion fromValue(String v) {
        return valueOf(v);
    }

}

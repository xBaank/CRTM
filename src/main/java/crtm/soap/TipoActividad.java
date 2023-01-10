
package crtm.soap;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TipoActividad.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TipoActividad">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SALIDA_DE_COCHERAS"/>
 *     &lt;enumeration value="LLEGADA_A_COCHERAS"/>
 *     &lt;enumeration value="SALIDA_DE_CABECERA"/>
 *     &lt;enumeration value="LLEGADA_A_TERMINAL"/>
 *     &lt;enumeration value="SALIDA_DE_ESTACION"/>
 *     &lt;enumeration value="LLEGADA_A_ESTACION"/>
 *     &lt;enumeration value="SALIDA_DE_REGULACION"/>
 *     &lt;enumeration value="LLEGADA_A_REGULACION"/>
 *     &lt;enumeration value="OTRO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TipoActividad")
@XmlEnum
public enum TipoActividad {

    SALIDA_DE_COCHERAS,
    LLEGADA_A_COCHERAS,
    SALIDA_DE_CABECERA,
    LLEGADA_A_TERMINAL,
    SALIDA_DE_ESTACION,
    LLEGADA_A_ESTACION,
    SALIDA_DE_REGULACION,
    LLEGADA_A_REGULACION,
    OTRO;

    public String value() {
        return name();
    }

    public static TipoActividad fromValue(String v) {
        return valueOf(v);
    }

}


package crtm.soap;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlertCause.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AlertCause">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DESCONOCIDA"/>
 *     &lt;enumeration value="OTRA_CAUSA"/>
 *     &lt;enumeration value="PROBLEMA_TÉCNICO"/>
 *     &lt;enumeration value="HUELGA"/>
 *     &lt;enumeration value="DEMOSTRACIÓN"/>
 *     &lt;enumeration value="ACCIDENTE"/>
 *     &lt;enumeration value="VACACIONES"/>
 *     &lt;enumeration value="TEMPORAL_ATMOSFÉRICO"/>
 *     &lt;enumeration value="MANTENIMIENTO"/>
 *     &lt;enumeration value="OBRAS"/>
 *     &lt;enumeration value="ACTIVIDAD_POLICIAL"/>
 *     &lt;enumeration value="EMERGENCIA_MÉDICA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AlertCause")
@XmlEnum
public enum AlertCause {

    DESCONOCIDA,
    OTRA_CAUSA,
    PROBLEMA_TÉCNICO,
    HUELGA,
    DEMOSTRACIÓN,
    ACCIDENTE,
    VACACIONES,
    TEMPORAL_ATMOSFÉRICO,
    MANTENIMIENTO,
    OBRAS,
    ACTIVIDAD_POLICIAL,
    EMERGENCIA_MÉDICA;

    public String value() {
        return name();
    }

    public static AlertCause fromValue(String v) {
        return valueOf(v);
    }

}

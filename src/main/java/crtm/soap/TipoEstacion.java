
package crtm.soap;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TipoEstacion.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TipoEstacion">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PARADA"/>
 *     &lt;enumeration value="CABECERA"/>
 *     &lt;enumeration value="PARADA_BAJO_DEMANDA"/>
 *     &lt;enumeration value="FIN_DE_RUTA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TipoEstacion")
@XmlEnum
public enum TipoEstacion {

    PARADA,
    CABECERA,
    PARADA_BAJO_DEMANDA,
    FIN_DE_RUTA;

    public String value() {
        return name();
    }

    public static TipoEstacion fromValue(String v) {
        return valueOf(v);
    }

}

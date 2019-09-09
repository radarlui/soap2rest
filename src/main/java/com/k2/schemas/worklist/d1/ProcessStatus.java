
package com.k2.schemas.worklist.d1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProcessStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProcessStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Error"/&gt;
 *     &lt;enumeration value="Running"/&gt;
 *     &lt;enumeration value="Active"/&gt;
 *     &lt;enumeration value="Completed"/&gt;
 *     &lt;enumeration value="Stopped"/&gt;
 *     &lt;enumeration value="Deleted"/&gt;
 *     &lt;enumeration value="New"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ProcessStatus")
@XmlEnum
public enum ProcessStatus {

    @XmlEnumValue("Error")
    ERROR("Error"),
    @XmlEnumValue("Running")
    RUNNING("Running"),
    @XmlEnumValue("Active")
    ACTIVE("Active"),
    @XmlEnumValue("Completed")
    COMPLETED("Completed"),
    @XmlEnumValue("Stopped")
    STOPPED("Stopped"),
    @XmlEnumValue("Deleted")
    DELETED("Deleted"),
    @XmlEnumValue("New")
    NEW("New");
    private final String value;

    ProcessStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProcessStatus fromValue(String v) {
        for (ProcessStatus c: ProcessStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

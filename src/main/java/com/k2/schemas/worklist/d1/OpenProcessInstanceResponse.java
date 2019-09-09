
package com.k2.schemas.worklist.d1;

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
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ProcessInstance" type="{http://schemas.k2.com/worklist/d1}ProcessInstance"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "processInstance"
})
@XmlRootElement(name = "OpenProcessInstanceResponse")
public class OpenProcessInstanceResponse {

    @XmlElement(name = "ProcessInstance", required = true, nillable = true)
    protected ProcessInstance processInstance;

    /**
     * Gets the value of the processInstance property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessInstance }
     *     
     */
    public ProcessInstance getProcessInstance() {
        return processInstance;
    }

    /**
     * Sets the value of the processInstance property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessInstance }
     *     
     */
    public void setProcessInstance(ProcessInstance value) {
        this.processInstance = value;
    }

}

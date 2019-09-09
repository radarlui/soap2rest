
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
 *         &lt;element name="StartNewProcessInstanceScalarResult" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
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
    "startNewProcessInstanceScalarResult"
})
@XmlRootElement(name = "StartNewProcessInstanceScalarResponse")
public class StartNewProcessInstanceScalarResponse {

    @XmlElement(name = "StartNewProcessInstanceScalarResult")
    protected long startNewProcessInstanceScalarResult;

    /**
     * Gets the value of the startNewProcessInstanceScalarResult property.
     * 
     */
    public long getStartNewProcessInstanceScalarResult() {
        return startNewProcessInstanceScalarResult;
    }

    /**
     * Sets the value of the startNewProcessInstanceScalarResult property.
     * 
     */
    public void setStartNewProcessInstanceScalarResult(long value) {
        this.startNewProcessInstanceScalarResult = value;
    }

}

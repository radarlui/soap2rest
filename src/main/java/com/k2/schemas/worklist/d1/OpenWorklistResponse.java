
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
 *         &lt;element name="OpenWorklistResult" type="{http://schemas.k2.com/worklist/d1}ArrayOfWorklistItem" minOccurs="0"/&gt;
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
    "openWorklistResult"
})
@XmlRootElement(name = "OpenWorklistResponse")
public class OpenWorklistResponse {

    @XmlElement(name = "OpenWorklistResult")
    protected ArrayOfWorklistItem openWorklistResult;

    /**
     * Gets the value of the openWorklistResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWorklistItem }
     *     
     */
    public ArrayOfWorklistItem getOpenWorklistResult() {
        return openWorklistResult;
    }

    /**
     * Sets the value of the openWorklistResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWorklistItem }
     *     
     */
    public void setOpenWorklistResult(ArrayOfWorklistItem value) {
        this.openWorklistResult = value;
    }

}

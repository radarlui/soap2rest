
package com.k2.schemas.worklist.d1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfWorklistItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfWorklistItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WorklistItem" type="{http://schemas.k2.com/worklist/d1}WorklistItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfWorklistItem", propOrder = {
    "worklistItem"
})
public class ArrayOfWorklistItem {

    @XmlElement(name = "WorklistItem", nillable = true)
    protected List<WorklistItem> worklistItem;

    /**
     * Gets the value of the worklistItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the worklistItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorklistItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorklistItem }
     * 
     * 
     */
    public List<WorklistItem> getWorklistItem() {
        if (worklistItem == null) {
            worklistItem = new ArrayList<WorklistItem>();
        }
        return this.worklistItem;
    }

}

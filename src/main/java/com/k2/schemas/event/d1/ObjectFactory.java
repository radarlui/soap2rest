
package com.k2.schemas.event.d1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.k2.schemas.event.d1 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ActivityInstanceDestination_QNAME = new QName("http://schemas.k2.com/event/d1", "ActivityInstanceDestination");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.k2.schemas.event.d1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EventInstance }
     * 
     */
    public EventInstance createEventInstance() {
        return new EventInstance();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EventInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.k2.com/event/d1", name = "ActivityInstanceDestination")
    public JAXBElement<EventInstance> createActivityInstanceDestination(EventInstance value) {
        return new JAXBElement<EventInstance>(_ActivityInstanceDestination_QNAME, EventInstance.class, null, value);
    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.06 at 11:34:29 AM CET 
//


package org.railml.schemas._2009;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for eInfraAttrGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="eInfraAttrGroup">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.railml.org/schemas/2009}tInfraAttrGroup">
 *       &lt;sequence>
 *         &lt;element name="infraAttributes" type="{http://www.railml.org/schemas/2009}eInfraAttr" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eInfraAttrGroup", propOrder = {
    "infraAttributes"
})
public class EInfraAttrGroup
    extends TInfraAttrGroup
{

    protected List<EInfraAttr> infraAttributes;

    /**
     * Gets the value of the infraAttributes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the infraAttributes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInfraAttributes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EInfraAttr }
     * 
     * 
     */
    public List<EInfraAttr> getInfraAttributes() {
        if (infraAttributes == null) {
            infraAttributes = new ArrayList<EInfraAttr>();
        }
        return this.infraAttributes;
    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.06 at 11:34:29 AM CET 
//


package org.railml.schemas._2009;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tOrientedElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tOrientedElement">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.railml.org/schemas/2009}tPlacedElement">
 *       &lt;attGroup ref="{http://www.railml.org/schemas/2009}aOrientation"/>
 *       &lt;anyAttribute namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tOrientedElement")
@XmlSeeAlso({
    TSpeedChange.class,
    TOwnerChange.class,
    TRadiusChange.class,
    TTrainProtectionChange.class,
    TPowerTransmissionChange.class,
    TBridge.class,
    TBorder.class,
    TAxleWeightChange.class,
    TBalise.class,
    TTrainDetector.class,
    TGradientChange.class,
    TOperationModeChange.class,
    TTrainProtectionElement.class,
    TCrossSection.class,
    TLevelCrossing.class,
    TElectrificationChange.class,
    TGaugeChange.class,
    TTrackCircuitBorder.class,
    TTunnel.class,
    TSignal.class
})
public class TOrientedElement
    extends TPlacedElement
{

    @XmlAttribute(name = "dir")
    protected TDirValidity dir;

    /**
     * Gets the value of the dir property.
     * 
     * @return
     *     possible object is
     *     {@link TDirValidity }
     *     
     */
    public TDirValidity getDir() {
        return dir;
    }

    /**
     * Sets the value of the dir property.
     * 
     * @param value
     *     allowed object is
     *     {@link TDirValidity }
     *     
     */
    public void setDir(TDirValidity value) {
        this.dir = value;
    }

}

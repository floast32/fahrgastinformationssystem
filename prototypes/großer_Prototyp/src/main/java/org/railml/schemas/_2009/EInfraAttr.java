//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.06 at 11:34:29 AM CET 
//


package org.railml.schemas._2009;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for eInfraAttr complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="eInfraAttr">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="owner" type="{http://www.railml.org/schemas/2009}tOwner" minOccurs="0"/>
 *         &lt;element name="operationMode" type="{http://www.railml.org/schemas/2009}tOperationMode" minOccurs="0"/>
 *         &lt;element name="trainProtection" type="{http://www.railml.org/schemas/2009}tTrainProtection" minOccurs="0"/>
 *         &lt;element name="electrification" type="{http://www.railml.org/schemas/2009}tElectrification" minOccurs="0"/>
 *         &lt;element name="powerTransmission" type="{http://www.railml.org/schemas/2009}tPowerTransmission" minOccurs="0"/>
 *         &lt;element name="axleWeight" type="{http://www.railml.org/schemas/2009}tAxleWeight" minOccurs="0"/>
 *         &lt;element name="gauge" type="{http://www.railml.org/schemas/2009}tGauge" minOccurs="0"/>
 *         &lt;element name="speeds" type="{http://www.railml.org/schemas/2009}eSpeeds" minOccurs="0"/>
 *         &lt;element name="epsgCode" type="{http://www.railml.org/schemas/2009}tEpsgCode" minOccurs="0"/>
 *         &lt;element name="generalInfraAttributes" type="{http://www.railml.org/schemas/2009}eGeneralInfraAttributes" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eInfraAttr", propOrder = {

})
public class EInfraAttr {

    protected TOwner owner;
    protected TOperationMode operationMode;
    protected TTrainProtection trainProtection;
    protected TElectrification electrification;
    protected TPowerTransmission powerTransmission;
    protected TAxleWeight axleWeight;
    protected TGauge gauge;
    protected ESpeeds speeds;
    protected TEpsgCode epsgCode;
    protected EGeneralInfraAttributes generalInfraAttributes;

    /**
     * Gets the value of the owner property.
     * 
     * @return
     *     possible object is
     *     {@link TOwner }
     *     
     */
    public TOwner getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link TOwner }
     *     
     */
    public void setOwner(TOwner value) {
        this.owner = value;
    }

    /**
     * Gets the value of the operationMode property.
     * 
     * @return
     *     possible object is
     *     {@link TOperationMode }
     *     
     */
    public TOperationMode getOperationMode() {
        return operationMode;
    }

    /**
     * Sets the value of the operationMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TOperationMode }
     *     
     */
    public void setOperationMode(TOperationMode value) {
        this.operationMode = value;
    }

    /**
     * Gets the value of the trainProtection property.
     * 
     * @return
     *     possible object is
     *     {@link TTrainProtection }
     *     
     */
    public TTrainProtection getTrainProtection() {
        return trainProtection;
    }

    /**
     * Sets the value of the trainProtection property.
     * 
     * @param value
     *     allowed object is
     *     {@link TTrainProtection }
     *     
     */
    public void setTrainProtection(TTrainProtection value) {
        this.trainProtection = value;
    }

    /**
     * Gets the value of the electrification property.
     * 
     * @return
     *     possible object is
     *     {@link TElectrification }
     *     
     */
    public TElectrification getElectrification() {
        return electrification;
    }

    /**
     * Sets the value of the electrification property.
     * 
     * @param value
     *     allowed object is
     *     {@link TElectrification }
     *     
     */
    public void setElectrification(TElectrification value) {
        this.electrification = value;
    }

    /**
     * Gets the value of the powerTransmission property.
     * 
     * @return
     *     possible object is
     *     {@link TPowerTransmission }
     *     
     */
    public TPowerTransmission getPowerTransmission() {
        return powerTransmission;
    }

    /**
     * Sets the value of the powerTransmission property.
     * 
     * @param value
     *     allowed object is
     *     {@link TPowerTransmission }
     *     
     */
    public void setPowerTransmission(TPowerTransmission value) {
        this.powerTransmission = value;
    }

    /**
     * Gets the value of the axleWeight property.
     * 
     * @return
     *     possible object is
     *     {@link TAxleWeight }
     *     
     */
    public TAxleWeight getAxleWeight() {
        return axleWeight;
    }

    /**
     * Sets the value of the axleWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link TAxleWeight }
     *     
     */
    public void setAxleWeight(TAxleWeight value) {
        this.axleWeight = value;
    }

    /**
     * Gets the value of the gauge property.
     * 
     * @return
     *     possible object is
     *     {@link TGauge }
     *     
     */
    public TGauge getGauge() {
        return gauge;
    }

    /**
     * Sets the value of the gauge property.
     * 
     * @param value
     *     allowed object is
     *     {@link TGauge }
     *     
     */
    public void setGauge(TGauge value) {
        this.gauge = value;
    }

    /**
     * Gets the value of the speeds property.
     * 
     * @return
     *     possible object is
     *     {@link ESpeeds }
     *     
     */
    public ESpeeds getSpeeds() {
        return speeds;
    }

    /**
     * Sets the value of the speeds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ESpeeds }
     *     
     */
    public void setSpeeds(ESpeeds value) {
        this.speeds = value;
    }

    /**
     * Gets the value of the epsgCode property.
     * 
     * @return
     *     possible object is
     *     {@link TEpsgCode }
     *     
     */
    public TEpsgCode getEpsgCode() {
        return epsgCode;
    }

    /**
     * Sets the value of the epsgCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TEpsgCode }
     *     
     */
    public void setEpsgCode(TEpsgCode value) {
        this.epsgCode = value;
    }

    /**
     * Gets the value of the generalInfraAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link EGeneralInfraAttributes }
     *     
     */
    public EGeneralInfraAttributes getGeneralInfraAttributes() {
        return generalInfraAttributes;
    }

    /**
     * Sets the value of the generalInfraAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link EGeneralInfraAttributes }
     *     
     */
    public void setGeneralInfraAttributes(EGeneralInfraAttributes value) {
        this.generalInfraAttributes = value;
    }

}


package com.reactiveworks.product.service.client;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WashingMachine complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WashingMachine">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.example.org/productService/}Product">
 *       &lt;sequence>
 *         &lt;element name="loadCapacity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="isAutomatic" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="doorType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WashingMachine", propOrder = {
    "loadCapacity",
    "isAutomatic",
    "doorType"
})
public class WashingMachine
    extends Product
{

    protected int loadCapacity;
    protected boolean isAutomatic;
    @XmlElement(required = true)
    protected String doorType;

    /**
     * Gets the value of the loadCapacity property.
     * 
     */
    public int getLoadCapacity() {
        return loadCapacity;
    }

    /**
     * Sets the value of the loadCapacity property.
     * 
     */
    public void setLoadCapacity(int value) {
        this.loadCapacity = value;
    }

    /**
     * Gets the value of the isAutomatic property.
     * 
     */
    public boolean isIsAutomatic() {
        return isAutomatic;
    }

    /**
     * Sets the value of the isAutomatic property.
     * 
     */
    public void setIsAutomatic(boolean value) {
        this.isAutomatic = value;
    }

    /**
     * Gets the value of the doorType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDoorType() {
        return doorType;
    }

    /**
     * Sets the value of the doorType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDoorType(String value) {
        this.doorType = value;
    }

}

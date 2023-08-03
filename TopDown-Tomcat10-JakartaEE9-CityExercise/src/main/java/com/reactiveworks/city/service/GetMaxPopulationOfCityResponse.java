
package com.reactiveworks.city.service;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="maxPopulationCity" type="{http://www.example.org/cityService/}City"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "maxPopulationCity"
})
@XmlRootElement(name = "getMaxPopulationOfCityResponse")
public class GetMaxPopulationOfCityResponse {

    @XmlElement(required = true)
    protected City maxPopulationCity;

    /**
     * Gets the value of the maxPopulationCity property.
     * 
     * @return
     *     possible object is
     *     {@link City }
     *     
     */
    public City getMaxPopulationCity() {
        return maxPopulationCity;
    }

    /**
     * Sets the value of the maxPopulationCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link City }
     *     
     */
    public void setMaxPopulationCity(City value) {
        this.maxPopulationCity = value;
    }

}


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
 *         &lt;element name="cityOfMinPopulation" type="{http://www.example.org/cityService/}City"/>
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
    "cityOfMinPopulation"
})
@XmlRootElement(name = "getMinPopulationOfCityResponse")
public class GetMinPopulationOfCityResponse {

    @XmlElement(required = true)
    protected City cityOfMinPopulation;

    /**
     * Gets the value of the cityOfMinPopulation property.
     * 
     * @return
     *     possible object is
     *     {@link City }
     *     
     */
    public City getCityOfMinPopulation() {
        return cityOfMinPopulation;
    }

    /**
     * Sets the value of the cityOfMinPopulation property.
     * 
     * @param value
     *     allowed object is
     *     {@link City }
     *     
     */
    public void setCityOfMinPopulation(City value) {
        this.cityOfMinPopulation = value;
    }

}

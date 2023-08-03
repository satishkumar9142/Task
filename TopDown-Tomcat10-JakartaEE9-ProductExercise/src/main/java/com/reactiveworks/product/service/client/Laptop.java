
package com.reactiveworks.product.service.client;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Laptop complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Laptop">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.example.org/productService/}ProcessingDevice">
 *       &lt;sequence>
 *         &lt;element name="graphicCards" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Laptop", propOrder = {
    "graphicCards"
})
public class Laptop
    extends ProcessingDevice
{

    @XmlElement(required = true)
    protected String graphicCards;

    /**
     * Gets the value of the graphicCards property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGraphicCards() {
        return graphicCards;
    }

    /**
     * Sets the value of the graphicCards property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGraphicCards(String value) {
        this.graphicCards = value;
    }

}

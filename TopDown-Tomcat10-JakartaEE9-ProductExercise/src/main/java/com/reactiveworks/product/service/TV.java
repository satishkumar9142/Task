
package com.reactiveworks.product.service;

import java.util.Map;

import com.reactiveworks.product.exception.ProductException;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TV complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TV">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.example.org/productService/}Product">
 *       &lt;sequence>
 *         &lt;element name="displaySize" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="displayType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="isSmartTv" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TV", propOrder = {
    "displaySize",
    "displayType",
    "isSmartTv"
})
public class TV
    extends Product
{

    protected int displaySize;
    @XmlElement(required = true)
    protected String displayType;
    protected boolean isSmartTv;

    /**
     * Gets the value of the displaySize property.
     * 
     */
    public int getDisplaySize() {
        return displaySize;
    }

    /**
     * Sets the value of the displaySize property.
     * 
     */
    public void setDisplaySize(int value) {
        this.displaySize = value;
    }

    /**
     * Gets the value of the displayType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayType() {
        return displayType;
    }

    /**
     * Sets the value of the displayType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayType(String value) {
        this.displayType = value;
    }

    /**
     * Gets the value of the isSmartTv property.
     * 
     */
    public boolean isIsSmartTv() {
        return isSmartTv;
    }

    /**
     * Sets the value of the isSmartTv property.
     * 
     */
    public void setIsSmartTv(boolean value) {
        this.isSmartTv = value;
    }
    
    public void buildProduct(Map<String,String> map) throws ProductException {
		super.buildProduct(map);
		this.displayType = map.get("DisplayType");
		try {
			this.displaySize = Integer.parseInt(map.get("DisplaySize"));
			this.isSmartTv = Boolean.parseBoolean("isSmartTV");
		}
		catch(NumberFormatException e) {
			throw new ProductException("Data Type is not in proper for which dataType we want to convert");
		}
	}

}

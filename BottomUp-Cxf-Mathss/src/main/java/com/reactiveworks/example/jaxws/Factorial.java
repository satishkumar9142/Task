
package com.reactiveworks.example.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by the CXF 2.0.13
 * Sun Jul 23 12:58:56 IST 2023
 * Generated source version: 2.0.13
 * 
 */

@XmlRootElement(name = "factorial", namespace = "http://example.reactiveworks.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "factorial", namespace = "http://example.reactiveworks.com/")

public class Factorial {

    @XmlElement(name = "arg0")
    private int arg0;

    public int getArg0() {
        return this.arg0;
    }
    
    public void setArg0( int newArg0 ) {
        this.arg0 = newArg0;
    }
    
}


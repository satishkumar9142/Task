
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

@XmlRootElement(name = "factorialResponse", namespace = "http://example.reactiveworks.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "factorialResponse", namespace = "http://example.reactiveworks.com/")

public class FactorialResponse {

    @XmlElement(name = "return")
    private int _return;

    public int get_return() {
        return this._return;
    }
    
    public void set_return( int new_return ) {
        this._return = new_return;
    }
    
}


package com.reactiveworks.city.service;

import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.reactiveworks.city.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.reactiveworks.city.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetCityById }
     * 
     */
    public GetCityById createGetCityById() {
        return new GetCityById();
    }

    /**
     * Create an instance of {@link GetCityByIdResponse }
     * 
     */
    public GetCityByIdResponse createGetCityByIdResponse() {
        return new GetCityByIdResponse();
    }

    /**
     * Create an instance of {@link City }
     * 
     */
    public City createCity() {
        return new City();
    }

    /**
     * Create an instance of {@link GetMinPopulationOfCity }
     * 
     */
    public GetMinPopulationOfCity createGetMinPopulationOfCity() {
        return new GetMinPopulationOfCity();
    }

    /**
     * Create an instance of {@link GetMinPopulationOfCityResponse }
     * 
     */
    public GetMinPopulationOfCityResponse createGetMinPopulationOfCityResponse() {
        return new GetMinPopulationOfCityResponse();
    }

    /**
     * Create an instance of {@link GetListOfCityByCountryCode }
     * 
     */
    public GetListOfCityByCountryCode createGetListOfCityByCountryCode() {
        return new GetListOfCityByCountryCode();
    }

    /**
     * Create an instance of {@link GetListOfCityByCountryCodeResponse }
     * 
     */
    public GetListOfCityByCountryCodeResponse createGetListOfCityByCountryCodeResponse() {
        return new GetListOfCityByCountryCodeResponse();
    }

    /**
     * Create an instance of {@link GetMaxPopulationOfCity }
     * 
     */
    public GetMaxPopulationOfCity createGetMaxPopulationOfCity() {
        return new GetMaxPopulationOfCity();
    }

    /**
     * Create an instance of {@link GetMaxPopulationOfCityResponse }
     * 
     */
    public GetMaxPopulationOfCityResponse createGetMaxPopulationOfCityResponse() {
        return new GetMaxPopulationOfCityResponse();
    }

}

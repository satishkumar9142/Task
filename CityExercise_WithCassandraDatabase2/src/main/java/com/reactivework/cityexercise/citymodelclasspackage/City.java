package com.reactivework.cityexercise.citymodelclasspackage;

//  ========================Customer =====================================
/**
 * 
 * This is City Class.
 *
 */
public class City {
	private Integer id;
	private String name;
	private String couCode;
	private String city;
	private long population;
	
	//   =================  Constructor (to assign the value) =============================
	/**
	 * This is a constructor for CityModel.
	 * @param id  This is id of city.
	 * @param name  This is name of person inside the city
	 * @param couCode  This is a CountryCode of the city 
	 * @param city  This is the city name
	 * @param population  population of the city
	 */
	public City(Integer id, String name, String couCode, String city, long population) {
		super();
		this.id = id;
		this.name = name;
		this.couCode = couCode;
		this.city = city;
		this.population = population;
	}
	
	// ===================   Getter And Setter  =============================
	/**
	 * getId
	 * @return get the id value
	 */
	public Integer getId() {
		return id;
	}
	/**
	 *  getName
	 * @return  get the name of the person inside the city
	 */
	public String getName() {
		return name;
	}
	/**
	 * getCountryCode
	 * @return get the Country code of the city
	 */
	public String getCouCode() {
		return couCode;
	}
	/**
	 * getCityName
	 * @return get the city name
	 */
	public String getCity() {
		return city;
	}
	/**
	 * getPopulation
	 * @return get the population of the city
	 */
	public long getPopulation() {
		return population;
	}
	
	// ===============  toString (to print the data) ===================
	
	/**
	 * toString method
	 */
	@Override
	public String toString() {
		return "[" + id + ", "+ name + ", " + couCode + ", " + city + ", "
				+ population +"]";
	}
}

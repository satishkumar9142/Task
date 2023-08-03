package pack1;

import java.util.ArrayList;
import java.util.List;

public class MainMethodClass {
	public static void main(String[] args) {

		List<Customer> allCityData = new ArrayList<>();
		CityServices service = null;

		List<Customer> CityNameByCodeAllData = null;
		Customer id = null;
		Customer maxPop = null;
		Customer minPop = null;

		// Create Instance of CityUtil Class
		CityUtil util = new CityUtil();
		try {
			allCityData = util.getCityList("S:\\WorkSpace\\CityExercise.csv");
			service = new CityServices(allCityData); // Create Instance of CityService class
			id = service.CityName(8);
			CityNameByCodeAllData = service.CityNameByCode("AFG");
			minPop = service.minPopulation(); // get minimum population of Customer details
			maxPop = service.maxPopulation(); // get maximum Population of Customer details
		} catch (CustomException e) {

			System.err.println(e);
		}

		System.out.println(allCityData);
		System.out.println(id);
		System.out.println(CityNameByCodeAllData);
		System.out.println(minPop);
		System.out.println(maxPop);
	}
}

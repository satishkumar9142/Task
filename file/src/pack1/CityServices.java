package pack1;

import java.util.ArrayList;
import java.util.List;

public class CityServices {
	private List<Customer> list;

	public CityServices(List<Customer> list) {
		this.list = list;
	}

//   =======================City Name By Id =================================

	Customer CityName(int id) throws CustomException {

		for (int i = 0; i < list.size(); i++) {
			if (((Customer) list.get(i)).getId() == id) {
				return ((Customer) list.get(i));
			}
		}

		throw new CustomException("Id Not Found Exception", new Exception());
	}

//    ======================= City Name By Country Code ==========================	

	List<Customer> CityNameByCode(String cCode) throws CustomException {

		List<Customer> list1 = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			String s = ((Customer) list.get(i)).getCouCode();
			if (s.equals(cCode)) {
				list1.add((Customer) list.get(i));
			}
		}
		if (list1.isEmpty()) {
			throw new CustomException("Country Code is Invalid", new Exception());
		}
		return list1;
	}

//   =======================  Maximum population of  City =========================

	Customer maxPopulation() {
		Customer city = null;
		long max = Long.MIN_VALUE;
		for (int i = 0; i < list.size(); i++) {
			long population = ((Customer) list.get(i)).getPopulation();
			if (max < population) {
				max = population;
				city = (Customer) list.get(i);
			}
		}
		return city;
	}

//  =====================  Minimum Population Of City =========================

	Customer minPopulation() {
		Customer city = null;
		long min = Long.MAX_VALUE;
		for (int i = 0; i < list.size(); i++) {
			long population = ((Customer) list.get(i)).getPopulation();
			if (min > population) {
				min = population;
				city = (Customer) list.get(i);
			}
		}
		return city;
	}

//  ============================================================================	
}

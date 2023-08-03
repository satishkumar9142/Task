package pack1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CityUtil { // cityutil

	@SuppressWarnings("resource")
	public List<Customer> getCityList(String path) throws CustomException { // getCityList
		List<Customer> data = new ArrayList<>();

		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader(path));

			String s = "";
			Customer customer = null;

			while (s != null) {
				int id;
				long population;
				String[] s1 = s.split(",");
				try {
					id = Integer.parseInt(s1[0]);
					population = Long.parseLong(s1[4]);

				} catch (NumberFormatException e) {
					try {
						s = br.readLine();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
//						e1.printStackTrace();
						System.err.println(e1);
					}
					continue;
				}
				String name = s1[1];
				String countryCode = s1[2];
				String city = s1[3];
				customer = new Customer(id, name, countryCode, city, population);
				data.add(customer);

				try {
					s = br.readLine();
				} catch (IOException e) {
					throw new CustomException("Error reading to File", e);
				}
			}
		} catch (FileNotFoundException e) {
			throw new CustomException("File Not Found / File Path is not Correct", e);
		}
		return data;
	}
}
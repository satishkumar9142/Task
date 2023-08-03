package com.reactiveworks.json.model;

import java.util.List;

public class Person {
		private String name;
		private int age;
		private List<String> hobbies;
		private Address address;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public List<String> getHobbies() {
			return hobbies;
		}
		public void setHobbies(List<String> hobbies) {
			this.hobbies = hobbies;
		}
		public Address getAddress() {
			return address;
		}
		public void setAddress(Address address) {
			this.address = address;
		}
		
		
}

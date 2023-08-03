package pack1;

//  ========================Customer =====================================

public class Customer {
	private Integer id;
	private String name;
	private String couCode;
	private String city;
	private long population;

	// ================= Constructor (to assign the value)
	// =============================

	public Customer(Integer id, String name, String couCode, String city, long population) {
		super();
		this.id = id;
		this.name = name;
		this.couCode = couCode;
		this.city = city;
		this.population = population;
	}

	// =================== Getter And Setter =============================

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getCouCode() {
		return couCode;
	}

	public String getCity() {
		return city;
	}

	public long getPopulation() {
		return population;
	}

	// =============== toString (to print the data) ===================

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", couCode=" + couCode + ", city=" + city + ", population="
				+ population + "]";
	}

}

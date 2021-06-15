package Aggregation;

public class Emp {
	int id;
	String name;
	Address address;

	public Emp(int id, String name, Address address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

	void display() {
		System.out.println(id + " " + name);
		System.out.println(address.city + " " + address.state + " " + address.country);
	}

	public static void main(String[] args) {
		Address address1 = new Address("gzb", "UP", "india");
		Address address2 = new Address("pune", "Maharastra", "india");

		Emp e = new Emp(7, "Daxil", address1);
		Emp e2 = new Emp(10, "Pradip", address2);

		e.display();
		e2.display();

	}
}

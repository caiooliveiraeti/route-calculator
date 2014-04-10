package br.eti.caiooliveira.route.calculator.model.point;

public class Address {

	private String street;
	private String houseNumber;
	private String district;
	private City city;

	public Address(String street, String district, String houseNumber, City city) {
		this.street = street;
		this.district = district;
		this.houseNumber = houseNumber;
		this.city = city;
	}
	
	public Address(String street, String district, City city) {
		this(street, district, null, city);
	}
	
	public Address(String street, String district, String houseNumber, String cityName, String cityState) {
		this(street, district, houseNumber, new City(cityName, cityState));
	}

	public Address(String street, String district, String cityName, String cityState) {
		this(street, district, null, new City(cityName, cityState));
	}

	public String getStreet() {
		return street;
	}

	public String getHouseNumber() {
		return houseNumber;
	}

	public String getDistrict() {
		return district;
	}

	public City getCity() {
		return city;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", houseNumber=" + houseNumber + ", district=" + district + ", city=" + city + "]";
	}
	
	

}

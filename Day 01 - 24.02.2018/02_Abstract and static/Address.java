package Basics;

public class address {

	private int housenum;
	private String city;
	private String country;
	
	
	
	public address(int housenum, String city, String country) {
		super();
		this.housenum = housenum;
		this.city = city;
		this.country = country;
	}
	public int getHousenum() {
		return housenum;
	}
	public void setHousenum(int housenum) {
		this.housenum = housenum;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
}

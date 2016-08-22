package com.hand.dto;

public class City {

	private Integer cityId;
	private String city;
	private Country country;
	
	public City() {
	}

	public City(Integer cityId, String city, Country country) {
		super();
		this.cityId = cityId;
		this.city = city;
		this.country = country;
	}

	public Integer getCityId() {
		return cityId;
	}

	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "City [cityId=" + cityId + ", city=" + city + ", country=" + country + "]";
	}

	
	
	
}

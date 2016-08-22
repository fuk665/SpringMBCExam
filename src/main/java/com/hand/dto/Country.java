package com.hand.dto;

public class Country {

	private Integer countryId;
	private String country;
	
	public Country() {
	}

	public Country(Integer countryId, String country) {
		super();
		this.countryId = countryId;
		this.country = country;
	}

	public Integer getCountryId() {
		return countryId;
	}

	public void setCountryId(Integer countryId) {
		this.countryId = countryId;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Country [countryId=" + countryId + ", country=" + country + "]";
	}
	
	
}

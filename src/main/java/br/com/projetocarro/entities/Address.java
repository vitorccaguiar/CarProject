package br.com.projetocarro.entities;

public class Address {
	
	private String cep;
	private String state;
	private String city;
	private String district;
	private Integer number;
	private String nationality;
	private Boolean hasOwnHouse;
	private Double valueOfTheHouse;
	private Integer timeLiving;
	
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public Boolean getHasOwnHouse() {
		return hasOwnHouse;
	}
	public void setHasOwnHouse(Boolean hasOwnHouse) {
		this.hasOwnHouse = hasOwnHouse;
	}
	public Double getValueOfTheHouse() {
		return valueOfTheHouse;
	}
	public void setValueOfTheHouse(Double valueOfTheHouse) {
		this.valueOfTheHouse = valueOfTheHouse;
	}
	public Integer getTimeLiving() {
		return timeLiving;
	}
	public void setTimeLiving(Integer timeLiving) {
		this.timeLiving = timeLiving;
	}
}

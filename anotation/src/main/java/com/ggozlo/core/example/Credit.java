package com.ggozlo.core.example;

public class Credit {
	private String homeTown, tel;
	private long population;
	
	

	public Credit(String homeTown, String tel, long population) {
		super();
		this.homeTown = homeTown;
		this.tel = tel;
		this.population = population;
	}
	public Credit() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getHomeTown() {
		return homeTown;
	}
	public void setHomeTown(String homeTown) {
		this.homeTown = homeTown;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public long getPopulation() {
		return population;
	}
	public void setPopulation(long population) {
		this.population = population;
	}
	
	
	

}

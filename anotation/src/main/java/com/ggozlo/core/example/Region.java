package com.ggozlo.core.example;

public class Region {

	private Long specailCity, metroCity, city;

	private Credit credit;
	
	
	public void setCredit(Credit credit) {
		this.credit = credit;
	}

	public void check() {
		if(credit.getPopulation() >= specailCity)
		{
			System.out.println("��������: " + credit.getHomeTown() + "Ư����");
		}
		else if(credit.getPopulation() >= metroCity)
		{
			System.out.println("��������: " + credit.getHomeTown() + "������");
		}
		else if(credit.getPopulation() >= city)
		{
			System.out.println("��������: " + credit.getHomeTown() + "��");
		}
		else 
		{
			System.out.println("��������: " + credit.getHomeTown() + "��");
		}
	}
	
	
	
	
	
	
	
	public Long getSpecailCity() {
		return specailCity;
	}

	public void setSpecailCity(Long specailCity) {
		this.specailCity = specailCity;
	}

	public Long getMetroCity() {
		return metroCity;
	}

	public void setMetroCity(Long metroCity) {
		this.metroCity = metroCity;
	}

	public Long getCity() {
		return city;
	}

	public void setCity(Long city) {
		this.city = city;
	}



	public Region(Long specailCity, Long metroCity, Long city) {
		super();
		this.specailCity = specailCity;
		this.metroCity = metroCity;
		this.city = city;
	
	}

	public Region() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}

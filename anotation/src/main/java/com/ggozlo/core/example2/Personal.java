package com.ggozlo.core.example2;

import java.util.ArrayList;

import javax.print.attribute.standard.Media;

public class Personal {
	private String name;
	private int age;
	private ArrayList<String> hobbies;
	private int middleScore, finalScore;
	
	
	
	public int getMiddleScore() {
		return middleScore;
	}
	public void setMiddleScore(int middleScore) {
		this.middleScore = middleScore;
	}
	public int getFinalScore() {
		return finalScore;
	}
	public void setFinalScore(int finalScore) {
		this.finalScore = finalScore;
	}
	

	public int getTotal() {
		return (middleScore + finalScore);
	}
	
	public char Grade( ) {
		if(getTotal() >= 180 )
		{
			return 'A';
		}
		else if(getTotal() >= 150)
		{
			return 'B';
		}
		else
		{
			return 'C';
		}
	}
	
	public Personal(String name, int age, ArrayList<String> hobbies) {
		super();
		this.name = name;
		this.age = age;
		this.hobbies = hobbies;
	}
	public Personal() {
		super();
		// TODO Auto-generated constructor stub
	}
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
	public ArrayList<String> getHobbies() {
		return hobbies;
	}
	public void setHobbies(ArrayList<String> hobbies) {
		this.hobbies = hobbies;
	}
	@Override
	public String toString() {
		return "Personal [name=" + name + ", age=" + age + ", hobbies=" + hobbies + ", middleScore=" + middleScore
				+ ", finalScore=" + finalScore + ", getTotal()=" + getTotal() + ", Grade()=" + Grade() +  "]";
	}
	
	
	

}

package com.ggozlo.core;

public class Test {

	private int high;
	private int medium;
	private int low ;
	

	
	



	
	public Test() 
	{
		super();
		// TODO Auto-generated constructor stub
	}



	public Test(int high, int medium, int low) {
		super();
		this.high = high;
		this.medium = medium;
		this.low = low;
	}

	public int getHigh() {
		return high;
	}

	public void setHigh(int high) {
		this.high = high;
	}

	public int getMedium() {
		return medium;
	}

	public void setMedium(int medium) {
		this.medium = medium;
	}

	public int getLow() {
		return low;
	}

	public void setLow(int low) {
		this.low = low;
	}

	



	public void Grade(Score score) {
		if(score.getAvg() >= high)
		{
			System.out.println("매우우수");
		}
		else if(score.getAvg() >= medium) {
			System.out.println("우수");
		}
		else if(score.getAvg() >= low) {
			System.out.println("보통");
		}
		else {
			System.out.println("미흡");
		}
	}
}

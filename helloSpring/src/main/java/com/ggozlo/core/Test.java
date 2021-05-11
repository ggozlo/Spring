package com.ggozlo.core;

public class Test {

	private int high;
	private int medium;
	private int low ;
	
	private ScoreDTO scoreDTO = null;
	
	



	
	public Test() 
	{
		super();
		// TODO Auto-generated constructor stub
	}

	public void setScoreDTO(ScoreDTO scoreDTO) {
		this.scoreDTO = scoreDTO;
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

	
	public ScoreDTO getScoreDTO() {
		return scoreDTO;
	}


	public void Grade() {
		if(scoreDTO.getAvg() >= high)
		{
			System.out.println("�ſ���");
		}
		else if(scoreDTO.getAvg() >= medium) {
			System.out.println("���");
		}
		else if(scoreDTO.getAvg() >= low) {
			System.out.println("����");
		}
		else {
			System.out.println("����");
		}
	}
}

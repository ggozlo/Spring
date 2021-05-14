package com.ggozlo.core;

public class ScoreCal {
	private Score score = null;

	public ScoreCal(Score score) {
		this.score = score;
	}
	
	public String getName() {
		return score.getName();
	}
	
	public int getKor() {
		return score.getKor();
	}
	
	public int getEng() {
		return score.getEng();
	}
	
	
	public int getMat() {
		return score.getMat();
	}
	
	

	public int getTotal() {
		return score.getKor()+score.getEng()+score.getMat();
	}
	
	public double getAverage() {
		return (getTotal() / 3.) ;
	}
	public char getGrade() {
		if(getAverage() >= 90) {
			return 'A';
		}
		else if(getAverage() >= 80) {
			return 'B';
		}
		else if(getAverage() >= 70) {
			return 'C';
		}
		else if(getAverage() >= 60) {
			return 'D';
		}
		else {
			return 'F';
		}
	}
	
}

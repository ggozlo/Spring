package com.ggozlo.core;

public class ScoreDTO 
{
	private String name;
	private int kor, eng, mat ;
	
	public float getAvg() {
		return (float) (getTotal()/3.);
	}
	
	public int getTotal() {
		return kor + eng + mat;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	
	public ScoreDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ScoreDTO(String name, int kor, int eng, int mat) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}

	@Override
	public String toString() {
		return "ScoreDTO [name=" + name + ", kor=" + kor + ", eng=" + eng + ", mat=" + mat + ", getAvg()=" + getAvg()
				+ ", getTotal()=" + getTotal() + "]";
	}

	
	
	
}

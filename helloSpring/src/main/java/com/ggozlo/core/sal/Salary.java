package com.ggozlo.core.sal;

public class Salary {
	private int high, middle, low;

	
	public void check(int sal)
	{
		if(sal > high)
		{
			System.out.println("�ſ츹��");
		}
		else if(sal > middle)
		{
			System.out.println("��������");
		}
		else if(sal > low)
		{
			System.out.println("�������");
		}
		else 
		{
			System.out.println("�� �������");
		}
	}
	
	public int getHigh() {
		return high;
	}

	public void setHigh(int high) {
		this.high = high;
	}

	public int getMiddle() {
		return middle;
	}

	public void setMiddle(int middle) {
		this.middle = middle;
	}

	public int getLow() {
		return low;
	}

	public void setLow(int low) {
		this.low = low;
	}

	public Salary() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Salary(int high, int middle, int low) {
		super();
		this.high = high;
		this.middle = middle;
		this.low = low;
	}
	
	
}

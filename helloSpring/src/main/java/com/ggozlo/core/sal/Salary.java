package com.ggozlo.core.sal;

public class Salary {
	private int high, middle, low;

	
	public void check(int sal)
	{
		if(sal > high)
		{
			System.out.println("매우많다");
		}
		else if(sal > middle)
		{
			System.out.println("괜찮은편");
		}
		else if(sal > low)
		{
			System.out.println("노력하자");
		}
		else 
		{
			System.out.println("더 노력하자");
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

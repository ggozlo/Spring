package com.ggozlo.tra;

public class Ticket {
	private String idNumber;
	private int  ticketCount;



	public int getTicketCount() {
		return ticketCount;
	}

	public void setTicketCount(int ticketCount) {
		this.ticketCount = ticketCount;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	public Ticket(String idNumber, int ticketCount) {
		super();
		this.idNumber = idNumber;
		this.ticketCount = ticketCount;
	}

	public Ticket() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}

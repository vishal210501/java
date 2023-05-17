package com.labsession;

public class GSOfBook {

	private int Bid;
	private String Bname;
	private int Bprice;

	public void setId(int id) {

		this.Bid = id;

	}

	public void setName(String name) {

		this.Bname = name;
	}

	public void setprice(int price) {
		this.Bprice = price;
	}

	public int getId() {

		return Bid;
	}

	public String getName() {

		return Bname;
	}

	public int getprice() {

		return Bprice;
	}

}

package com.polymorphism;

class Pen {
	private int Pprice;
	private String Pname;
	private nib Nb;

	public void setprice(int price) {

		this.Pprice = price;
	}

	public void setpname(String name) {
		this.Pname = name;
	}

	public void setnib(nib neeb) {
		this.Nb = neeb;
	}

	public int getPrice() {
		return Pprice;
	}

	public nib getNeeb() {
		return Nb;
	}

	public String getName() {
		return Pname;
	}

}

class nib {
	private String Nmt;
	private int Nprice;

	public void setname(String name) {
		this.Nmt = name;
	}

	public void setprice(int price) {
		this.Nprice = price;
	}

	public String getnmt() {
		return Nmt;
	}

	public int getprice() {
		return Nprice;
	}

}

public class Bag {
	private String Bbrand;
	private int Bprice;
	private Pen pn;

	public void setbrand(String brand) {
		this.Bbrand = brand;
	}

	public void setprice(int price) {
		this.Bprice = price;

	}

	public void setpen(Pen pen) {
		this.pn = pen;
	}

	public String getBrand() {
		return Bbrand;

	}

	public int getprice() {
		return Bprice;
	}

	public Pen getpen() {
		return pn;
	}

}

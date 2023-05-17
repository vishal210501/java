package com.inheritance;

class Footware {
	String name;

	public void white() {
		System.out.println("footware for running........");
	}

}

class Shoe extends Footware {
	int price;

	public void details(String name) {
		super.name = name;

	}

	public void showdetails() {
		System.out.println(name);
	}
}

class Jorden extends Shoe {
	int specialedition;

	public void price(int price, int specialedition) {
		super.price = price;
		this.specialedition = specialedition;

	}

	public void findtotalprice() {
		price = price + specialedition;
	}

	public void showshoedetails() {
		System.out.println(name + "   " + price);
	}

}

public class Multilevel1 {

	public static void main(String[] args) {

		Jorden ss = new Jorden();

		ss.white();
		ss.details("nike");
		ss.price(4000, 10000);
		ss.showdetails();
		ss.findtotalprice();
		ss.showshoedetails();
	}

}

package com.oops;

public class Shopping {

	int cid;
	String pname;
	int pprice;
	int quantity;

	public void accept_shopping_details(int id, String name, int price, int qunt) {
		cid = id;
		pname = name;
		pprice = price;
		quantity = qunt;

	}

	public void calculate_bill() {

		if (quantity > 0) {
			int bill = quantity * pprice;

			System.out.println(bill);
		} else {
			System.out.println(" error");
		}

	}

	public void display_shoppingwithbill() {

		System.out.println(cid + "  " + pname + "  " + pprice + "  " + quantity + "  ");

	}

	public static void main(String[] args) {

		Shopping shop = new Shopping();
		shop.accept_shopping_details(1, "shoes", 1500, 1);

		shop.display_shoppingwithbill();
		shop.calculate_bill();

	}

}

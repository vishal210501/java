package com.labsession;

import java.util.Scanner;

public class Book {

	int aid;
	String Bookname;
	int Bprice;
	String Authorname;

	Book(int id, String bookname, int price, String authorname) {

		aid = id;
		Bookname = bookname;
		Bprice = price;
		Authorname = authorname;

	}

	void showbook() {

		Scanner sc = new Scanner(System.in);
		System.out.println(" enter author name");
		String a_Name = sc.nextLine();
		if (a_Name.equals(Authorname))
		{

			System.out.println(" you are eligiblr for 50% discount");
			System.out.println("you have to pay:" + (Bprice - 50));
		}
		else {

			System.out.println(" you are not eligible for discount");
			System.out.println(" you have to pay:" + Bprice);
		}

	}

	public static void main(String[] args) {

		Book obj = new Book(121, "agnipankh", 350, "Kalam");
		obj.showbook();
	}

}

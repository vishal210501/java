package com.inheritance;

class Watch {

	String smartwatch = "LED display";
}

class Realme extends Watch {
	public void show() {
		System.out.println(smartwatch);
	}

	public void Realmedetails() {
		System.out.println("this is Realme with multiple features");
	}
}

public class Singlelevel1 {

	public static void main(String[] args) {

		Realme rm = new Realme();
		rm.show();
		rm.Realmedetails();

	}

}

package com.inheritance;

class Cycle {
	String Cycle = "normal breaks";
}

class Herosprint extends Cycle {

	public void show() {
		System.out.println(Cycle);
	}

	public void Herosprintdetails() {
		System.out.println(" this is Herosprint with disc breaks && gears ");
	}

}

public class Singlelevel2 {

	public static void main(String[] args) {
		Herosprint hs = new Herosprint();
		hs.show();
		hs.Herosprintdetails();
	}

}

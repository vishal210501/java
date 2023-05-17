package com.oops;

public class Car {

	int model;
	String name;
	int prize;
	String colour;

	public static void main(String[] args) {
		Car maruti = new Car();
		maruti.model = 1;
		maruti.name = "suzuki";
		maruti.prize = 5000;
		maruti.colour = "red";
		System.out.println(maruti.model + "  " + maruti.name + "  " + maruti.prize + "  " + maruti.colour);

		Car m1 = new Car();
		m1.model = 2;
		m1.name = "jojo";
		m1.prize = 10000;
		m1.colour = "black";
		System.out.println(m1.model + "  " + m1.name + "  " + m1.prize + "  " + m1.colour);

		Car m2 = new Car();
		m2.model = 3;
		m2.name = "toto";
		m2.prize = 20000;
		m2.colour = "gray";
		System.out.println(m2.model + "  " + m2.name + "  " + m2.prize + "  " + m2.colour);

	}

}

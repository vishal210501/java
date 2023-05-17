package com.inheritance;

class Sport {

	int players;
}

class Basketball extends Sport {

	public void show_Basketball() {
		int players = 5;
		System.out.println("Basketball_players=" + players);
	}
}

class Vollyball extends Sport {
	public void show_Vollyball() {
		int players = 7;
		System.out.println("Vollyball_players=" + players);
	}
}

public class Hierarchieal1 {
	public static void main(String[] args) {

		Basketball bb = new Basketball();
		bb.show_Basketball();
		Vollyball vb = new Vollyball();
		vb.show_Vollyball();
	}
}

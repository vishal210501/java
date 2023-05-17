package com.inheritance;

class Tata {
	String company;
}

class Tatasteel extends Tata {
	public void show_Tatasteel() {
		String company = "Steel_manufacture";
		System.out.println("Tatasteel_company=" + company);
	}
}

class Tatamotors extends Tata {
	public void show_Tatamotors() {
		String company = " Car_manufacture";
		System.out.println("Tatamotors_company=" + company);
	}
}

class Tatachemicals extends Tata {
	public void show_Tatachemicals() {
		String company = " chemical_manufacture";
		System.out.println("Tatachemicals_company=" + company);
	}
}

public class Hirarcheal2 {

	public static void main(String[] args) {

		Tatasteel ts = new Tatasteel();
		ts.show_Tatasteel();
		Tatamotors tm = new Tatamotors();
		tm.show_Tatamotors();
		Tatachemicals tc = new Tatachemicals();
		tc.show_Tatachemicals();
	}

}

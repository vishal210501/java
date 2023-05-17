package com.inheritance;

class Sword{
	String Sword="weapon";
	
}

class Katana extends Sword{
	public void show() {
		System.out.println(Sword);
	}
	public void Katanadetails() {
		System.out.println("this is Katana with razor-sharp-edge");
	}
}

public class Singlelevel3 {
	
	public static void main ( String [] args) {
	
	Katana kt= new Katana();
	kt.show();
	kt.Katanadetails();
	}

}

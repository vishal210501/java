package com.oops;
import java.util.Scanner;
public class Booking {

	public static void main(String[] args) {
		
Scanner sc= new Scanner(System.in);
System.out.println("enter id");
int id = sc.nextInt();
System.out.println(" enter the name");
String name= sc.next();	
System.out.println(" enter price");
	int price= sc.nextInt();
	
Movie m= new Movie ( id, name, price);
	
	int a =m.get_price();
	System.out.println(a);
	
	 

	

}
}

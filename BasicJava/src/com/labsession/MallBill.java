package com.labsession;
import java.util.Scanner;

public class MallBill {
	public static void main(String [] args) {
		Scanner sc= new Scanner( System.in);
		System.out.println(" enter pizza quantity");
		int  pizza_quantity= sc.nextInt();
		System.out.println("enter puff quantity");
		int puff_quantity=sc.nextInt();
		System.out.println("enter drink quantity");
		int drink_quantity=sc.nextInt();
		int pizza_price=100;
		int puff_price=20;
		int drink_price=10;
		sc.close();
		
		double total_price=( double )((pizza_price*pizza_quantity)+(puff_price*puff_quantity)+(drink_price*drink_quantity));
		
		System.out.println(" bill details");
		System.out.println(" no. pizza price"+ pizza_quantity);
		System.out.println(" no. puff price"+puff_quantity);
		System.out.println(" no. drink price"+ drink_quantity);
		System.out.println(" total price"+ total_price);
		
		
		
		
		
		
		
	}

}

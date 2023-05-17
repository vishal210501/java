package com.labsession;
import java.util.Scanner;
public class Meenu {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner ( System.in);
		System.out.println(" enter a number ");
		int num = sc. nextInt();
		int coins=0;
		if ( num> 0) {
			for (int  i=1; i<= num; i++) {
				
				coins=i*i*i;
			}
			System.out.println("meenu gets"+ coins+" coins");
			
			
		}
		else {
			System.out.println(" invalid age");
		}
		

	}

}

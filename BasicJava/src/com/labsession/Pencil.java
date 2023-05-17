package com.labsession;
import java. util.Scanner;
public class Pencil {
   public static void main ( String []args) {
Scanner sc = new Scanner ( System.in);
System.out.println(" enter a standard");
int standard = sc.nextInt();
int sum=0;

if ( standard >0 && standard<12) {
	
	for ( int i=1; i<=standard; i++) {
		sum= sum+i*i;
		
	}
	System.out.println(" neela gets"+sum+" pencil");
}
else {
	System.out.println(" invalid number");
}
   }
}

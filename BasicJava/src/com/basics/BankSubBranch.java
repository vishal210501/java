package com.basics;
import java.util.Scanner;
import com.labsession.Bank;


public class BankSubBranch extends Bank {
	
	
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner ( System.in);
		
	int num = sc.nextInt();
		
	BankSubBranch obj = new BankSubBranch();
		System.out.println(obj.getb_Name("agnipankh"));
		System.out.println(obj.getRateOfInterest(10));  
	// System.out.println(obj.getlockerId(121));       //  private can run in same pakage only
		System.out.println(obj.getBranchName("Thane"));

	}
                   
}

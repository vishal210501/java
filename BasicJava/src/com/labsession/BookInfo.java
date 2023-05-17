package com.labsession;
import java.util.Scanner;
public class BookInfo {

	public static void main(String[] args) {

		GSOfBook bk = new GSOfBook();

		bk.setId(121);
		bk.setName("agnipankh");
		bk.setprice(250);
		Scanner sc = new Scanner ( System.in);
		System.out.println(" enter book name");
		String book = sc.next();
		if ( book.equals(bk.getName())) {
			
			int dis = (5*250/100);
			int disprice= bk.getprice()-dis;
			System.out.println(" Book price = " +disprice);
			
		}
		else {
			System.out.println(" Book price = " + bk. getprice());
		}
		

		System.out.println("book ID = " + bk.getId());
		System.out.println(" book name = " + bk.getName());
	

	}
}

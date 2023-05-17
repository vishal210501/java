package com.oops;

public class Movie{
	
	int mid;
	String mname;
	int mprice;
	
	
		public Movie(int id, String name, int price)
		{
		mname=name;
		mprice=price;
	}
	public int get_price( ) {
		return mprice;
		}

}

package com.polymorphism;

public class Baginfo {
          
	public static void main (String []args) {
		
		Bag obj= new Bag();
		obj.setbrand("skybag");
		obj.setprice(1200);
		obj.setpen(new Pen());
		Pen pn=obj.getpen();
		pn.setprice(250);
		pn.setpname("parker");
		pn.setnib(new nib());
	    nib pn2=pn.getNeeb();
	    pn2.setname("cartage");
	    pn2.setprice(50);
	    
//	    obj.getBrand();
//	    obj.getpen();
//	    obj.getprice();
//	    pn.getPrice();
//	    pn.getName();
//	    pn.getNeeb();
//	    pn2.getprice();
//	    pn2.getnmt();
	    
	    System.out.println(obj.getBrand());
	    System.out.println( obj.getpen());
	    System.out.println( obj.getprice());
	    System.out.println(pn.getPrice());
	    System.out.println( pn.getName());
	    System.out.println(pn.getNeeb());
	    System.out.println(pn2.getprice());
	    System.out.println( pn2.getnmt());
	    
	}
}

package com.polymorphism;

class Order {
	private int oid;
	private String city;
	private String oname;

	public void setoid(int id) {

		this.oid = id;
	}

	public void setcity(String cname) {

		this.city = cname;
	}

	public void setname(String name) {
		this.oname = name;
	}

	public int getoid() {
		return oid;

	}
	
	public String getcity() {
		return city;
	}

	public String getOname() {
		return oname;
	}
}

class MDate {

	private int Month;
	private int Day;
	private int Year;

	public void setmonth(int mt) {
		this.Month = mt;
	}

	public void setday(int dy) {
		this.Day = dy;
	}

	public void setyear(int yr) {
		this.Year = yr;
	}

	public int getmonth() {
		return Month;
	}

	public int getday() {
		return Day;
	}

	public int getyear() {
		return Year;
	}
}

public class Shipment {

	private int Sid;
	private String Sbat;
	private Order Od;
	private MDate Md;

	public void setSid(int id) {
		this.Sid = id;
	}

	public void setSbat(String bat) {
		this.Sbat = bat;
	}

	public void setMd(MDate md) {
		this.Md = md;
	}

	public void setOd(Order od) {
		this.Od = od;
	}

	public int getSid() {
		return Sid;
	}

	public String getSbat() {
		return Sbat;
	}

	public MDate getMd() {
		return Md;
	}

	public Order getOd() {
		return Od;
	}

	public static void main(String[] args) {

		Shipment obj = new Shipment();
		obj.setSid(121);
		obj.setSbat("rebook");
		obj.setOd(new Order());
		Order or=obj.getOd();
         or.setoid(21);
         or.setcity("pune");
         or.setname("bat");
         obj.setMd(new MDate() );
         MDate or2=obj.getMd();
         or2.setmonth(5);
         or2.setday(21);
         or2.setyear(2023);
         
         obj.getSid();
         obj.getSbat();
          or.getoid();
         or.getcity();
         or.getOname();
         or2.getmonth();
         or2.getday();
         or2.getyear();
         
        System.out.println( obj.getSid());
        System.out.println( obj.getSbat());
        System.out.println( or.getoid());
        System.out.println(or.getcity());
         System.out.println(or.getOname());
         System.out.println(or2.getmonth());
         System.out.println( or2.getday());
         System.out.println(or2.getyear());
         
	}

}

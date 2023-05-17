package com.labsession;

public class Bank {

	public String b_name;
	private int locker_Id;
	protected float rateOfInterest;
	String branchName;

	public String getb_Name(String b_Name) {

		b_name = b_Name;
		return b_name;

	}

	private int getlockerId(int id) {
		locker_Id = id;
		return id;

	}

	protected float getRateOfInterest(int rateOFInterest) {

		this.rateOfInterest = rateOfInterest;
		return rateOFInterest;

	}

	protected String getBranchName(String branchName) {

		this.branchName = branchName;
		return branchName;
	}

	public static void main(String[] args) {

		Bank obj = new Bank();
		System.out.println(obj.getb_Name("agnipankh"));
		System.out.println(obj.getRateOfInterest(10));
		System.out.println(obj.getlockerId(121));
		System.out.println(obj.getBranchName("Thane"));
	}

}

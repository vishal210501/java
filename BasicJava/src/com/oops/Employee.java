package com.oops;

public class Employee {

	int eid;
	String ename;
	int eage;
	int esalary;

	public void accept_employee_details(int id, String name, int age, int salary) {

		this.eid = id;
		this.ename = name;
		this.eage = age;
		this.esalary = salary;

	}

	void get_bonus() {

		if (eage > 60) {
			System.out.println(" bonus 5000");
		}

		if (eage >=40  && eage<= 60) {
			System.out.println(" bonus 2000");
		} 
		if( eage<=40) {

			System.out.println("no bonus");
		}

	}

	public void display_employee_detailswith_bonus() {

		System.out.println(eid + " " + ename + " " + eage + " " + esalary + " ");
	}

	public static void main(String[] args) {

		Employee emp = new Employee();
		emp.accept_employee_details(21, " mayur", 65, 45000);

		emp.display_employee_detailswith_bonus();
		emp.get_bonus();

	}

}

package com.oops;

public class StudentPr {

	int sid;
	String sname;
	int sub1;
	int sub2;
	int sub3;

	public void accept_student_details(int id, String name, int subA, int subB, int subC) {

		sid = id;
		sname = name;
		sub1 = subA;
		sub2 = subB;
		sub3 = subC;
	}

	public void calculate_percentage() {

		int sub1 = 60;
		int sub2 = 65;
		int sub3 = 80;
		int totalmarks = 300;
		int obtainmarks = 0;

		int percentage = 0;
		obtainmarks = sub1 + sub2 + sub3;

		percentage = (obtainmarks * 100) / totalmarks;
		System.out.println(percentage);

	}

	public void display_studentinfowithpercentage() {

		System.out.println(sid + " " + sname + " " + sub1 + " " + sub2 + " " + sub3 + " ");

	}

	public static void main(String[] args) {

		StudentPr stud = new StudentPr();
		stud.accept_student_details(21, "mayur", 60, 65, 80);

		stud.display_studentinfowithpercentage();
		stud.calculate_percentage();

	}

}

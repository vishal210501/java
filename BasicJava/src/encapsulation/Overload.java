package encapsulation;

public class Overload {

	public static void display(String a, int c) {
		System.out.println("hello");
	}

	public static void display() {

		System.out.println(" hello");

	}

	public static void display(int a) {
		System.out.println(" hello");
	}

	public static void display(int a, int b) {
		System.out.println(" hello");
	}


		public static void main(String [] args) {

			Overload.display();
			Overload.display(1);
			Overload.display(1, 2);
			Overload.display("vd", 5);

		}

	}


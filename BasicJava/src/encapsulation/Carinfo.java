package encapsulation;
import java.util.*;
public class Carinfo {

	
	public static void main( String [] args) {
		
		Car cr = new Car ();
		cr.setModel(121);
		cr.setName(" jeep");
		cr.setspeedlimit(80);
		Scanner sc= new Scanner(System.in);
		System.out.println("enter speed");
		int spd=sc.nextInt();
		
		if (spd<80) {
			
			System.out.println(cr.getModel());
			System.out.println(cr.getName());
		}
		else {
			System.out.println(" overspeed");
		}
		
		
		
		
		
	
		
		
		
	}
	
	
}

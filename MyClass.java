// GETTING USER INPUT USING JAVA
import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) {
		// Scanner class or data type define scan
		//system. in takes the data which you entered or type, and print that data
		//nextInt give you next integer which you entered

		Scanner scan = new Scanner (System.in);
		System.out.println("Enter some number");
		int user_input_number = scan.nextInt(); 
	
		System.out.print("The entered value is ");
		System.out.println(user_input_number);
		
		Scanner scan1 = new Scanner (System.in);
		System.out.println("Enter some double number");
		double user_input_double = scan1.nextDouble();
	
		System.out.print("The entered value is ");
		System.out.println(user_input_double);
		
		Scanner scan2 = new Scanner (System.in);
		System.out.println("Enter some string");
		String user_input_string = scan2.nextLine();
	
		System.out.print("You are ");
		System.out.print(user_input_string);
		}

}

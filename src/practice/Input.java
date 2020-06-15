package practice;
import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		int age;
		// Create a Scanner object to read input
		Scanner ip = new Scanner(System.in);
		
		// Get the test age.
		System.out.print("Please Enter Your Age: ");
		age=ip.nextInt();
			
		if(age<18)
		{
			System.out.print("You are too young.");   
		}
		else if(age<45)
		{
			System.out.print("You are still young.");
		}
		else if(age<70)
		{
			System.out.print("You are getting older.");
		}
		else
		{
			System.out.print("You are too old.");
		}
}
}
		
	
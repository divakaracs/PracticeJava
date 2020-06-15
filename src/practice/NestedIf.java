package practice;
public class NestedIf {
	
	public static void main(String[] args) {
	int age=71;
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
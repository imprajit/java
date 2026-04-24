 import java.util.Scanner;
 class InvalidAgeException extends Exception
 {
	 InvalidAgeException(String message)
	 {
		 super(message);
	 }
 }
 class AgeValidator
 {
	 void Checkage(int age)
	 {
		 try {
			 if(age<0 || age>150)
			 {
				throw new InvalidAgeException("Age is Invalid:"+age);
			 }
			 else {
				 System.out.println("Valid Age");
			 }
		 }
		 catch(Exception e)
		 {
			 System.out.println(e);
		 }
	 }
 }
public class come {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int age = scan.nextInt();
		AgeValidator av = new AgeValidator();
		av.Checkage(age);
		
	} 
	
	
}

 
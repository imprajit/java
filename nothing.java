
  import java.util.Scanner;
  class DivisionExample
  {
	  void divideNumber(int num,int den)
	  {
		  try
		     {
			  int result = num/den;
			  System.out.println("The Result is:"+result);
		  }
		  catch(ArithmeticException e)
		  {
			  System.out.println("Cannot divide by Zero");
		  }
	  }
  }
public class nothing {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		int n1 = num.nextInt();
		int n2 = num.nextInt();
		DivisionExample d1 = new DivisionExample();
	    d1.divideNumber(n1,n2);

		
	} 
	
	
}

 
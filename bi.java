 import java.util.Scanner;
public class bi {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c =0;
			
          try {
	           c = a/b;
          }
           catch (Exception e)
          {
        	  System.out.print("please enter an integer");
          }
          System.out.println(c);
          scan.close();
	} 
	
	
}

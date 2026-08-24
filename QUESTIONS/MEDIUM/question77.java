import java.util.Scanner;
class Calculator{
    double add(String expression)
    {
        String[] numbers = expression.split("\\+");
        double result = 0;
        for(String number:numbers)
        {
            result = result + Double.parseDouble(number);
        }
        return result;
    }
    double subraction(String expression)
    {
        String[] numbers = expression.split("-");
        double result = Double.parseDouble(numbers[0]);
        for(int i=1;i<numbers.length;i++)
        {
           result = result - Double.parseDouble(numbers[i]);
        } 
        return result;
    }
   double multiply(String expression)
   {
    String[] numbers = expression.split("\\*");
    double result ;
    result = 1;
     for (String number : numbers) {
            result = result * Double.parseDouble(number);
        }
         return result;
   } 
   double divide(String expression)
   {
    String[] numbers = expression.split("/");
    double result = Double.parseDouble(numbers[0]);
    for(int i=1;i<numbers.length;i++)
    {
         double number = Double.parseDouble(numbers[i]);
         if(number==0)
         {
            System.out.print("How in the world, bro can you divide a number with freaking 0!");
             return 0;
         }
           result = result/number;
    }
      return result;
   }
}
class question77
{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
         Calculator calculator = new Calculator();
        System.out.println("==========SIMPLE CALCULATOR==========");
         System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.print("Enter the operation you want in number:");
        int choice = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter the expression:");
        String expression = scan.nextLine();
        switch(choice)
        {
            case 1:
                System.out.print("Answer:" + calculator.add(expression));
                break;
            case 2: 
                 System.out.print("Answer:" + calculator.subraction(expression)) ;
                 break;
            case 3:
                System.out.print("Answer:" + calculator.multiply(expression));
                 break;
             case 4:
                System.out.print("Answer:" + calculator.divide(expression));
                break;
              default:
                System.out.print("Invalid choice");    
        }
        scan.close();
    }
}
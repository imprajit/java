import java.util.Scanner;
class Main{
    public static void main(String[]args)
    {
      Scanner scan = new Scanner(System.in);
      String s1 = scan.nextLine();
    String rev = "";
    for(int i=s1.length() - 1;i>=0;i--)
    {
        rev = rev+s1.charAt(i);
    }
    System.out.print(rev);
}
}
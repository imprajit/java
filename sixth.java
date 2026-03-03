import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner num = new Scanner (System.in);
        int firstnumber = num.nextInt();
        int Secondnumber = num.nextInt();
        if (firstnumber == Secondnumber){
           System.out.print("Yes! Both the numbers are equal");
        }
        else{
            System.out.print("No both numbers are not equal");
        }
}
}



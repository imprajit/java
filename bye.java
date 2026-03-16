import java.util.Scanner;
class bye {
    public static void main(String[] args) {
        Scanner numo = new Scanner(System.in);
        System.out.print("Number A:");
        int a = numo.nextInt();
         System.out.print("Number B:");
        int b = numo.nextInt();
        for(int i=a;i<=b;i=i+1)
        {
            System.out.println(i);
        }
    }
}
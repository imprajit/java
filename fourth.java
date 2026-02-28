import java.util.Scanner;
class fourth{
    public static void main(String args[]){
        Scanner num= new Scanner (System.in);
        int a= num.nextInt();
        int b= num.nextInt();
        int c= num.nextInt();
        int d= (a+b+c);
        int e= (a*b*c);
        int f= d/e;
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);

    }
}

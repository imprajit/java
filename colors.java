import java.util.Scanner;
class Main {
    public static void main(String[] args) {
         Scanner color = new Scanner(System.in);
         System.out.print("Enter the color:");
        String colour=color.nextLine();
        if(colour.equals("red"))
        {
            System.out.print("Stop");
        }
        else if (colour.equals("yellow"))
        {
            System.out.print("Get ready");
        }
        else if (colour.equals("green"))
        {
            System.out.print("Go");
        }
    }
}
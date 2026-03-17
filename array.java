import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner count = new Scanner(System.in);
    int[] score = new int[5];
     score[0] = count.nextInt();
      score[1] = count.nextInt();
       score[2] = count.nextInt();
        score[3] = count.nextInt();
         score[4] = count.nextInt();
         System.out.println("Total:" +(score[0]+score[1]+score[2]+score[3]+score[4]));
    }
}
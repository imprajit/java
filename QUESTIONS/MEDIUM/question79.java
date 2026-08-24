import java.util.Scanner;
import java.util.HashMap;
class Main{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        HashMap<String,Integer> password = new HashMap<>();
        password.put("MG",2344);
        password.put("A2D",4332);
        password.put("MrBeast",3435);
        password.put("Icycol",6465);
        password.put("LouisAyy",9798);
        password.put("Ninye",9987);
         password.put("Hxsain",3643);
          HashMap<String,Integer> MG= new HashMap<>();
          MG.put("Tamil",98);
          MG.put("English",100);
          MG.put("Maths",86);
          MG.put("Science",89);
          MG.put("Social Science",88);
           HashMap<String,Integer> A2D= new HashMap<>();
          A2D.put("Tamil",67);
          A2D.put("English",87);
          A2D.put("Maths",88);
          A2D.put("Science",87);
          A2D.put("Social Science",55);
           HashMap<String,Integer> MrBeast= new HashMap<>();
          MrBeast.put("Tamil",98);
          MrBeast.put("English",100);
          MrBeast.put("Maths",86);
          MrBeast.put("Science",89);
          MrBeast.put("Social Science",88); 
          HashMap<String,Integer> Icycol= new HashMap<>();
          Icycol.put("Tamil",98);
          Icycol.put("English",100);
          Icycol.put("Maths",86);
          Icycol.put("Science",89);
          Icycol.put("Social Science",88); 
          HashMap<String,Integer> LouisAyy= new HashMap<>();
          LouisAyy.put("Tamil",98);
          LouisAyy.put("English",100);
          LouisAyy.put("Maths",86);
          LouisAyy.put("Science",89);
          LouisAyy.put("Social Science",88);
           HashMap<String,Integer> Ninye= new HashMap<>();
          Ninye.put("Tamil",98);
          Ninye.put("English",100);
          Ninye.put("Maths",86);
          Ninye.put("Science",89);
          Ninye.put("Social Science",88);
           HashMap<String,Integer> Hxsain= new HashMap<>();
          Hxsain.put("Tamil",98);
          Hxsain.put("English",100);
          Hxsain.put("Maths",86);
          Hxsain.put("Science",89);
          Hxsain.put("Social Science",88);
       int attempts = 0;
boolean loginSuccessful = false;
String userLoggedIn = "";

while (attempts < 3) {

    System.out.print("Enter the Username: ");
    String name = scan.nextLine().trim();

    System.out.print("Enter the Password: ");
    int passwordEntered = scan.nextInt();
    scan.nextLine();

    if (!password.containsKey(name)) {
        System.out.println("Incorrect username");
    }

    else if (password.get(name) != passwordEntered) {
        System.out.println("Incorrect password");
    }

    else {
        System.out.println("Login Successful!");

        loginSuccessful = true;
        userLoggedIn = name;

        break;
    }

    attempts++;
}

      if (!loginSuccessful) {
    System.out.println("Account locked");
    scan.close();
    return;
}
      if (userLoggedIn.equals("MG")) {
    System.out.println(MG);
}
     else if (userLoggedIn.equals("A2D")) {
    System.out.println(A2D);
}
     else if (userLoggedIn.equals("MrBeast")) {
    System.out.println(MrBeast);
}
    
     else if (userLoggedIn.equals("LouisAyy")) {
    System.out.println(LouisAyy);
    }
    
     else if (userLoggedIn.equals("Hxsain")) {
    System.out.println(Hxsain);
     }
     else if (userLoggedIn.equals("Icycol")) {
    System.out.println(Icycol);
     }
     else if (userLoggedIn.equals("Ninye")) {
    System.out.println(Ninye);
     }
    }
}
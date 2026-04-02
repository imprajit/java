public class mobile {
        void Iphone ()
       {
         System.out.println("This is a Iphone");
       }
       void Samsung ()
       {
         System.out.println("This is a Samsung phone");
       }
       void Realme ()
       {
         System.out.println("This is a Realme phone");
       }
       void Oppo ()
       {
         System.out.print("This is a Oppo phone");
       } 
       
       
    public static void main(String[] args) {
      mobile obj1 = new mobile();
        obj1.Iphone();
      mobile obj = new mobile();
        obj.Samsung();
        mobile obj2 = new mobile();
        obj2.Realme();
       mobile obj3 = new mobile();
        obj3.Oppo();


    }
}
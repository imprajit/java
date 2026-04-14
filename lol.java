 public class lol {
    String myname;
  lol()
  {
    System.out.println("Hello");
  }
  void display(String myname)
  {
    this.myname = myname;
  }
  public static void main(String [] args)
  {
    lol obj1 = new lol();
    obj1.display("Prajit") ;
    System.out.println(obj1.myname);
  }
 } 
public class returnname {
    String getname()
    {
        return "Prajit";
    }
    int getphone()
    {
       int  c = 67 ;
       return c  ;
    }
    String getaddress()
    {
        return "India_TamilNadu_Chennai";
    }
    public static void main(String args[]){
    returnname obj1 = new returnname();
    String myname = obj1.getname();
    System.out.println(myname);
     int phone = obj1.getphone();
    System.out.println(phone);
    String address = obj1.getaddress();
    System.out.println(address);
}
}
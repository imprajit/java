public class store {
    void getsoap(int money)
    {
        System.out.println("Soap purchased");
    }
    void toothpaste(int money)
    {
        System.out.println("toothpaste purchased");
    }
    public static void main(String args[]){
        store obj1 = new store();
        obj1.getsoap(20);
        obj1.toothpaste(200);
    }
}
public class Mainoh {
    int sum(int a , int b)
    {
        int c = a+b ;
        return c;
    }
    public static void main(String[] args) {
        Mainoh obj1 = new Mainoh();
       int sum =  obj1.sum(10,2);
       System.out.print(sum);
    }
}
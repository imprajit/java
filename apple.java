public class apple {
    int apple_price=20;
    int apple_count=5;
    void total_money()
    {
       System.out.print(apple_price*apple_count);
    }
    public static void main(String[] args) {
        apple obj1 = new apple ();
        obj1.total_money();
    }
}
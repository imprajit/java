public class voidsum {
     void sum(int num1 , int num2)
     {
        System.out.println(num1+num2);
     }
    void  subraction( int num1 , int num2)
    {
        System.out.println(num1-num2);
    }
 void  multiplication( int num1 , int num2)
    {
        System.out.println(num1*num2);
    } void  divison( int num1 , int num2)
    {
        System.out.println(num1/num2);
    }
    public static void main(String args[]){
        voidsum obj1 = new voidsum();
        obj1.sum(10,2);
        obj1.subraction(10,2);
        obj1.multiplication(10,2);
        obj1.divison(10,2);

    }
}
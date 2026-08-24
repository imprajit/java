abstract class Shape {
    abstract void draw();
}
 class Circle extends Shape
 {
    void draw()
    {
        System.out.print("Circle");
    }
 }
 class question55
 {
    public static void main(String[]args)
    {
        Circle c1 = new Circle();
       c1.draw();
    }
 }
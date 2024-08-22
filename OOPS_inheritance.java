class Shape{
    public void area() {
        System.out.println("displays area");
    }
}
class Traingle extends Shape {
    public void area(int l,int h)
    {
        System.out.println(1/2*h*l);
    }

}
class Circle extends Shape {
    public void area(int r)
    {
        System.out.println((3.14)*r*r);
    }
}
public class OOPS_inheritance {
    public static void main(String arg[])
    {
        Traingle t1=new Traingle();
        t1.colour="red";


    }
}
    

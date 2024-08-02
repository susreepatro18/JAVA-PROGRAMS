import java.util.Scanner;

public class circum_func {
    public static void main(String arg[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the radius");
        double rad=sc.nextInt();
        double result=circum(rad);
        System.out.println("the circumference of the circle is:"+result);
    }
    public static double circum(double rad)
    {
        double circum=2*3.14*rad;
        return circum;
    }
    
}

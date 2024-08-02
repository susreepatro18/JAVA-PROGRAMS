import java.util.Scanner;

public class areacir {
    public static void main(String arg[]) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the radius of the circle");
        double rad =sc.nextInt();
        double area=3.14*rad*rad;
        System.out.println("the area is:");
        System.out.println(area);

    }
}

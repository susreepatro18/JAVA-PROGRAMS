import java.util.Scanner;

public class power_function {
    public static void main(String arg[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the base");
        int b=sc.nextInt();
        System.out.println("enter the exponent");
        int e=sc.nextInt();
        int result=power(b,e);
        System.out.println("the answer is:"+result);

    }
    public static int power(int b,int e)
    {
        int power=1;
        for(int i=1;i<=e;i++)
        {
            power=power*b;
        }
        return power;

    }
    
}

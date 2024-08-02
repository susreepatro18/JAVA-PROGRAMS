import java.util.Scanner;

public class power_logn_recursion {
    public static void main(String arg[]) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the base");
        int b=sc.nextInt();
        System.out.println("enter a exponent");
        int n=sc.nextInt();
        int r=power(b,n);
        System.out.println("the power is:"+r);
    }
    public static int power(int b,int n)
    {
        if(n<=0)
        {
            return 1;
        }
        else
        {
           if(n%2==0)
           {
                 return power(b,n/2)*power(b,n/2);
           }
           else
           {
                 return power(b,n/2)*power(b,n/2)*b;
           }
        }
    }
    
    
}

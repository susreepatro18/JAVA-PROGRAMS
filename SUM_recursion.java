import java.util.Scanner;

public class SUM_recursion {
    public static void main(String arg[]) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int r=sum(n);
        System.out.println("the sum is:"+r);
     }
     public static int sum(int n)
     {
        if(n<=0)
        {
            return 0;
        }
        else
        {
        return n+sum(n-1);
        }

     }
    
}

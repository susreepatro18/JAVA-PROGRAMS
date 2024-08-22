import java.util.Scanner;

public class FACTorial_recursion {
    public static void main(String arg[]) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int r=fact(n);
        System.out.println("the sum is:"+r);
     }
     public static int fact(int n)
     {
        if(n==0|n==1)
        {
            return 1;
        }
        else
        {
            return n*fact(n-1);
        }
     }

    
}

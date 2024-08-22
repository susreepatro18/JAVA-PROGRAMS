import java.util.Scanner;

public class Fibonaaci_recursion {
    public static void main(String arg[]) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int a=0;
        int b=1;
        System.out.print(a+" ");
        System.out.print(b+" ");
        printfib(a,b,n-2);
    }
    public static void printfib(int a,int b,int n)
    {
        if(n<=0)
        {
            return;
        }
        else
        {
        int c=a+b;
        System.out.print(c+" ");
        printfib(b, c, n-1);
        }
    }

    
}

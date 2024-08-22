import java.util.Scanner;

public class factorial_function {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int result=factorial(n);
        System.out.println("the factorial of the number is :"+result);

    }
    public static int factorial(int n)
    {
        int fact=1;
        for( int i=n;i>=1;i--)
        {
            fact=fact*i;

        }
        return fact;
    }
}

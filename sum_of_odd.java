import java.util.Scanner;

public class sum_of_odd {
    public static void main(String arg[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int result=sum_of_odd(n);
        System.out.println("the sum of odd number is :"+result);

    }
    public static int sum_of_odd(int n)
    {
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            if(i%2!=0)
            {
                sum=sum+i;
            }
        }
        return sum;
    }
    
}

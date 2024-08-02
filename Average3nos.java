import java.util.Scanner;

public class Average3nos {
    public static void main(String arg[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 1st number");
        int a=sc.nextInt();
        System.out.println("enter 2st number");
        int b=sc.nextInt();
        System.out.println("enter 3st number");
        int c=sc.nextInt();
        int result=avg(a,b,c);
        System.out.println("the average of the three numbers is :"+result);
    }
    public static int avg(int a,int b,int c)
    {
        int sum=a+b+c;
        int avg=sum/3;
        return avg;
    }
    
}

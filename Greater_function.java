import java.util.Scanner;

public class Greater_function {
    public static void main(String arg[])
{
    Scanner sc=new Scanner(System.in);
    System.out.println("enter 1st number");
    int a=sc.nextInt();
    System.out.println("enter 2st number");
    int b=sc.nextInt();
    greater(a,b);
}  

public static void greater(int a,int b)
{
    if(a>b)
    {
        System.out.println(a+" is greater than"+b);
    }
    else{
        System.out.println(b+" is greater than"+a);
    }
}
}

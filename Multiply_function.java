import java.util.Scanner;
public class Multiply_function {
   ;


    public static void main(String arg[]) {
        int int1,int2,result;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of number 1");
        int1=sc.nextInt();
        System.out.println("enter the value of number 2");
        int2=sc.nextInt();
        result=mul(int1,int2);
        System.out.println("the sum of two numbers is :"+result);

    }
    public static int mul(int a,int b)
    {
        int sum;
        sum=a*b;
        return sum;
    }
    
}

    


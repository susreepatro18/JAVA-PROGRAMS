import java.util.Scanner;

public class Decimal_to_Binary {
    public static void main(String arg[])
    {
        int r;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number to change from decimal to binary");
        int n=sc.nextInt();
        if(n==0)
        {
            System.out.println("Decimal is zero");
        }
        while(n!=0)
        {
            r=n%2;
            System.out.print(r);
            n=n/2;


        }
    }
    
}

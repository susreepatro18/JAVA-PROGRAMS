import java.util.Scanner;

public class PRint_number_recursion {
    public static void printnum(int n)
    {
        if(n!=6)
        {
        System.out.println(n);
        printnum(n+1);
        }
    }
    public static void main(String arg[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        printnum(n);
     }
    
}

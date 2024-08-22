import java.util.Scanner;

public class evennumber_function {
    public static void main (String arg[]) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        even(n);
     }
     public static void even(int n)
     {
        if(n%2==0)
        {
            System.out.println(n+ "is a even number");
        }
        else
        {
            System.out.println(n+ "is not a even number");
        }
     }
}    


import java.util.Scanner;

public class conditional {
    public static void main(String arg[]) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the age of the user");
        int age = sc.nextInt();
        if (age>=18)
        {
            System.out.println("user is a adult");
        }
        else
        {
            System.out.println("user is not a adult");
        }

        //check numbers
        System.out.println("enter a number");
        int a=sc.nextInt();
        System.out.println("enter second number");
        int b=sc.nextInt();
        if (a%2==0)
        {
            System.out.println("a is a even number");
        }
        else
        {
            System.out.println("a is a odd number");
        }

        if (a>b)
        {
            System.out.println("a is greater then b");
        }
        else if (a<b)
        {
            System.out.println("a is smaller than b");
        }
        else
        {
            System.out.println("a and b are equal");
        }
            
        }
    }
    


import java.util.Scanner;

public class calculator {
    public static void main(String arg[]) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the value of A");
        int a=sc.nextInt();
        System.out.println("enter the value of b");
        int b=sc.nextInt();
        System.out.println("1.addition\n2.substraction\n3.multiplication\n4.division\n5.modulo\n");
        int operator=sc.nextInt();
        switch(operator)
        {
            case 1:
            int addition=a+b;
            System.out.println(addition);
            break;
            case 2:
            int substraction=a-b;
            System.out.println(substraction);
            break;
            case 3:
            int multiplication=a*b;
            System.out.println(multiplication);
            break;
            case 4:
            int division=a/b;
            System.out.println(division);
            case 5:
            int modulo=a%b;
            System.out.println(modulo);
            break;
            default:
            System.out.println("invalid inputtttt!!!!!!");

        }
    }    
}

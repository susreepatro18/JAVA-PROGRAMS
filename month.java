import java.util.Scanner;

public class month {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1\n2\n3\n4\n5\n6\n7\n8\n9\n10\n11\n12\n");
        int operator=sc.nextInt();
        switch(operator)
        {
            case 1:
            System.out.println("january");
            break;
            case 2:
            System.out.println("february");
            break;
            case 3:
            System.out.println("march");
            break;
            case 4:
            System.out.println("april");
            break;
            case 5:
            System.out.println("may");
            break;
            case 6:
            System.out.println("june");
            break;
            case 7:
            System.out.println("july");
            break;
            case 8:
            System.out.println("august");
            break;
            case 9:
            System.out.println("september");
            break;
            case 10:
            System.out.println("october");
            break;
            case 11:
            System.out.println("november");
            break;
            case 12:
            System.out.println("december");
            break;
            default:
            System.out.println("invalid input!!!!");
        }
    }
    
}

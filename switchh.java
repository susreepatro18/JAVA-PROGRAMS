import java.util.Scanner;

public class switchh {
    public static void main(String arg[]) {
        System.out.println("1\n2\n3\n");
        Scanner sc = new Scanner(System.in);
        int button=sc.nextInt();
        switch(button)  {
            case 1: System.out.println("namanste");
            break;
            case 2:System.out.println("bonjour");
            break;
            case 3: System.out.println("hello");
            break;
            default:
            System.out.println("invalid button!!");

        }
        }
    
}

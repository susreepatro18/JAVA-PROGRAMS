import java.util.Scanner;

public class even {
    public static void main(String arg[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int a=sc.nextInt();
        for(int i=1;i<=a;i++)
        {
            if (i%2==0)
            {
            System.out.println(i);
            }
            
        }
    }
    
}

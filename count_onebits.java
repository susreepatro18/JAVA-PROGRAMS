import java.util.Scanner;

public class count_onebits {
    public static void main(String arg[]) {
        int c=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        while(n>0)
        {
            n=n&(n-1);
            c++;
        }
        System.out.println(c);
    }
    
}

import java.util.Scanner;

public class FibonacciFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms:");
        int n = sc.nextInt();
        
        int a = 0, b = 1;
        System.out.print("Fibonacci sequence: " + a + " " + b + " ");
        
        for (int i = 3; i <= n; i++)
        {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}

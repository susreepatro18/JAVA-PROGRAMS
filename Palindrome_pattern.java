public class Palindrome_pattern {
    public static void main(String arg[]) {
        for(int i=1;i<=5;i++)
        {
            for(int j=0;j<=5-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--)
            {
                System.out.print(j);
            }
            for(int j=2;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }

    }    
}

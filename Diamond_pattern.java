public class Diamond_pattern {
    public static void main(String arg[]){
        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=5-i-1;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++)
            {
                System.out.print("*");
            }
            for(int j=1;j<=5-i;j++)
            {
                System.out.print(" ");
            }
            System.out.println();

        }
        for(int i=4;i>=1;i--)
        {
            for(int j=5-i-1;j>=1;j--)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++)
            {
                System.out.print("*");
            }
            for(int j=5-i-1;j>=1;j--)
            {
                System.out.print(" ");
            }
            System.out.println();

        }
    }
    
}

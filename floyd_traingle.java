public class floyd_traingle {
    public static void main(String arg[]) {
        int n=1;
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(n);
                System.out.print("\t");
                n++;
            }
            System.out.println();
        }
    }
    
}

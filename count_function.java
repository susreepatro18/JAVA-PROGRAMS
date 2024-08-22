import java.util.Scanner;

public class count_function {
    public static void main(String arg[]) {
        int p=0;
        int z=0;
        int n=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int v=sc.nextInt();
        System.out.println("enter the numbers");
        for(int i=1;i<=v;i++)
        {
            int a =sc.nextInt();
            if(a==0)
            {
                z++;
            }
            else if(a>0)
            {
                p++;
            }
            else if(a<0)
            {
                n++;
            }
        }
        System.out.println("the number of positive number is:"+p);
        System.out.println("the number of negative number is:"+n);
        System.out.println("the number of zeroes number is:"+z);
        
        
    }
    
}

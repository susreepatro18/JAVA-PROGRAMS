import java.util.Scanner;

public class Binary_to_Decimal {
    public static void main(String arg[])
    {
        int dec=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number to change from binary to decimal");
        String n=sc.next();
        int l=n.length();
        for(int i=0;i<l;i++)
        {
            char charac=n.charAt(l-i-1);
            {
                if(charac =='1')
                {
                    dec+=Math.pow(2,i);
                }
            }
        }
        System.out.println(dec);
    }
    
}

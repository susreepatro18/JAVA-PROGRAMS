import java.util.Scanner;

public class STring_reverse_recursion {
    public static void main(String arg[]) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        reverse(s,s.length()-1);


    }
    public static void reverse(String s,int i)
    {
        if(i==0)
        {
            System.out.print(s.charAt(i));
            return;
        }
        else
        {
            System.out.print(s.charAt(i));
            reverse(s,i-1);
        }
    }
    
}

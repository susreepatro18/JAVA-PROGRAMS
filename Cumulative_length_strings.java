import java.util.Scanner;

public class Cumulative_length_strings {
    public static void main(String arg[] )
    {
        int total=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size ");
        int size=sc.nextInt();
        System.out.println("enter the string");
        for(int i=0;i<size;i++)
        {
            String n=sc.next();
            total=total+n.length();
        }
        System.out.println("the sum of length of all string is :"+ total);
    }
    
}

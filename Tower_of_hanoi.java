import java.util.Scanner;

public class Tower_of_hanoi {
public static void main (String arg[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        hanoi(n,"S","H","D");


    }
    public static void hanoi(int n,String s,String h,String d)
    {
        if(n==1)
        {
            System.out.println("transfer disk "+n+" from "+s+" to "+d);
            return;
           

        }
        hanoi(n-1,s,d,h);
        System.out.println("transfer disk "+n+" from "+s+" to "+d);
        hanoi(n-1,h,s,d);
    }
}
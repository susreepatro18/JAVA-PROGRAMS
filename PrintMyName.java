import java.util.Scanner;

public class PrintMyName {
    public static void PrintMyName(String name) 
    {
        System.out.println(name);
        return;
        
    }
    public static void main(String arg[]) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your name");
        String name=sc.nextLine();
        PrintMyName(name);
        sc.close();
    }
}


    


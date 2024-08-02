import java.util.Scanner;

public class strings_string {
    public static void main(String arg[]) {
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        System.out.println("your name is:"+name);
        System.out.println(name.length());
        System.out.println(name.charAt(4));
        String name2="goongoon";
        if(name.compareTo(name2)==0)
        {
            System.out.println("strings are equal");
        }
        else
        {
            System.out.println("strings are not equal");

        }
        
    }
    
}

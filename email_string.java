import java.util.Scanner;

public class email_string {
    public static void main(String arg[]) {
    Scanner sc = new Scanner (System.in);
    System.out.println("enter the mail id");
    String email = sc.next();
    int size=email.length();
    String str="";
    for(int i=0;i<size;i++)
    {
        if(email.charAt(i)=='@')
        {
            break;
        }
        else
        {
            str=str+email.charAt(i);
        }
    }
    
    System.out.println("the final email is :"+str);
    



    }
    
}

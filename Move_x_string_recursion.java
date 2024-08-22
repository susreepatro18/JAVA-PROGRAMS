import java.util.Scanner;


public class Move_x_string_recursion {
public static void main(String arg[])
   {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a string");
    String s=sc.next();
    System.out.println("enter the element");
    char ch=sc.next().charAt(0);
    move(s,ch,0,0,"");
}   
public static void move(String s,char ch,int idx,int c,String newString)
{
    if(idx==s.length())
    {
        for(int i=0;i<c;i++)
        {
            newString+=ch;
        }
        System.out.println(newString);
        return;

    }
    else
    {
    char curr=s.charAt(idx);
    if(curr==ch)
    {
        c+=1;
        move(s,ch,idx+1,c,newString);

    }
    else
    {
        newString+=curr;
        move(s,ch,idx+1,c,newString);

    }
}
}
}

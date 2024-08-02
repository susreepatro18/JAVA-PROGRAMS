import java.util.Scanner;

public class vote_function {
    public static void main(String arg []){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the age");
        int age=sc.nextInt();
        vote(age);

    }
    public static void vote(int age) 
    {
        if(age>=18)
        {
            System.out.println("you are eleigible to vote");
        }
        else{
            System.out.println("you are not eleigible for vote");
        }
    }
    
}

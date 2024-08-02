import java.util.Scanner;

public class BIT_Manipulation {
    public static void main(String arg[]) {
         
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the number");
            int n=sc.nextInt();
            System.out.println("enter the position:");
            int p=sc.nextInt();
            int bitMask=1<<p;
            int notbitMask=~(bitMask);
            if((bitMask & n)==0)
            {
                System.out.println("Bit was zero");
            }
            else
            {
                System.out.println("Bit was one");
            }
            int newNumber=bitMask|n;
            System.out.println(newNumber);
            int num=notbitMask&n;
            System.out.println(num);
            int operation=0;
            int number;
            if(operation==1)
            {
                number=bitMask|n;
                System.out.println(number);
            }
            else
            {
                int nbitMask=~(bitMask);
                number=nbitMask&n;
                System.out.println(number);
            }
            }
    }


    


import java.util.Scanner;

public class searching_array {
    public static void main(String arg[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size=sc.nextInt();
        int[] num = new int[size];
        for(int i=0;i<size;i++)
        {
            num[i]=sc.nextInt();
        }
        System.out.println("enter the number to be searched");
        int ele=sc.nextInt();
        for(int i=0;i<size;i++)
        {
            if(ele==num[i])
            {
                System.out.println(ele +" found at "+(i+1)+ " position!!");
            }
        }

    }
    
}

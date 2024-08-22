import java.util.Scanner;

public class max_min_array {
    public static void main(String arg[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size=sc.nextInt();
        int a[]=new int[size];
        System.out.println("enter the numbers");
        for(int i=0;i<size;i++)
        {
            a[i]=sc.nextInt();
        }
        int min=a[0];
        for(int i=0;i<size;i++)
        {
            if(a[i]<min)
            {
                min=a[i];
            }
        }
        int max=a[0];
        for(int i=0;i<size;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        System.out.println("the smallest number is "+min);
        System.out.println("the largest number is "+max);


    }
    
}

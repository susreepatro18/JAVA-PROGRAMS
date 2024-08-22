import java.util.Scanner;

public class check_sorted_array {
    public static void main(String arg[]) {
        int c=0,p=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size=sc.nextInt();
        int a[]=new int[size];
        System.out.println("enter the numbers");
        for(int i=0;i<size;i++)
        {
            a[i]=sc.nextInt();
        }
        boolean isSorted=true;
        for(int i=0;i<size-1;i++)
        {
            if(a[i]>a[i+1])
            {
                isSorted=false;
                break;

            }
        }
        if(isSorted)
        {
            System.out.println("array is sorted");
        }
        else
        {
            System.out.println("array is not sorted");
        }
    }
    
}

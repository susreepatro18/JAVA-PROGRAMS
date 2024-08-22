import java.util.Scanner;

public class Array_sorted_recursion {
    public static void main(String arg[]) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size=sc.nextInt();
        int a[]=new int[size];
        System.out.println("enter the numbers");
        for(int i=0;i<size;i++)
        {
            a[i]=sc.nextInt();
        }
        if (ischeck(a, 0)) {
            System.out.println("The array is sorted");
        } else {
            System.out.println("The array is not sorted");
        }
    }
    

public static boolean ischeck(int a[],int i)
{
    if(i==a.length-1)
    {
        return true;
    }
    else
    {
        if(a[i]>a[i+1])
        {
            return false;
           
        }
        

    }
      return ischeck(a,i+1);

}
}


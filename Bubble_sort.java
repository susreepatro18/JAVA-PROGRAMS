import java.util.Scanner;

public class Bubble_sort {
    public static void main(String arg[]) {
        int temp;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=sc.nextInt();
        int []a=new int[n];
        System.out.println("enter the elements of th array");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;

                }
            }
        }
        System.out.println("the sorted element is");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    

}

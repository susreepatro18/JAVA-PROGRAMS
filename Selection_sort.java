import java.util.Scanner;

public class Selection_sort {
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
        for(int i=0;i<n;i++)
        {
            int min_idx=i;
            for(int j=i+1;j<n;j++)
            {
                if(a[min_idx]>a[j])
                {
                min_idx=j;
                }

            }
            temp=a[min_idx];
            a[min_idx]=a[i];
            a[i]=temp;

        }
        System.out.println("the sorted array is");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    
}
}
    

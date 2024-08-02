import java.util.Scanner;

public class Matrix_search_2Darray {
    public static void main(String arg[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of rows");
        int r=sc.nextInt();
        System.out.println("enter the number of columns");
        int c=sc.nextInt();
        int [][]mat= new int[r][c];
        System.out.println("enter the elements of the array");
        for(int j=0;j<c;j++)
        {
            for(int i=0;i<r;i++)
        {
                mat[i][j]=sc.nextInt();
            }
        }
        for(int j=0;j<c;j++)
        {
            for(int i=0;i<r;i++)
            {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("enter the element to be searched");
        int ele=sc.nextInt();
        for(int j=0;j<c;j++)
        {
            for(int i=0;i<r;i++)
            {
                if(mat[i][j]==ele)
                {
                    System.out.println(ele+" found at "+"("+i+","+j+")"+ " position");
                    break;
                }

            }
            System.out.println();
        }


        
    
    }
    
}

import java.util.Scanner;

public class Transpose_matrix_2Darray {
    public static void main(String arg[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of rows");
        int r=sc.nextInt();
        System.out.println("enter the number of columns");
        int c=sc.nextInt();
        int [][]mat= new int[r][c];
        int [][]m= new int[c][r];
        System.out.println("enter the elements of the array");
        for(int j=0;j<c;j++)
            {
            for(int i=0;i<r;i++)
        {
                mat[i][j]=sc.nextInt();
            }
        }
        System.out.println("original matrix");
        for(int j=0;j<c;j++)
        {
            for(int i=0;i<r;i++)
            {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("the tranpose of the matrix is");
        for(int j=0;j<r;j++)
        {
            for(int i=0;i<c;i++)
            {
                m[j][i]=mat[i][j];
            }
            
        }
        for(int j=0;j<r;j++)
        {
            for(int i=0;i<c;i++)
            {
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
            
        }
    }
}

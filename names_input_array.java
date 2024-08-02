import java.util.Scanner;

public class names_input_array {
    public static void main(String arg[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("entert he size of the array");
        int size=sc.nextInt();
        String name[]=new String[size];
        System.out.println("enter the names!!");
        for(int i=0;i<size;i++)
        {
            name[i]=sc.next();
        }
        System.out.println("the names entered are");
        for(int i=0;i<size;i++)
        {
            System.out.println(name[i]);
        }

    }
    
}

import java.util.ArrayList;

public class Subsets_sets_recursion {
    public static void printsubset(ArrayList<Integer> subset)
    {
        for(int i=0;i<subset.size();i++)
        {
            System.out.print(subset.get(i)+" ");
        }
        System.out.println();
    }
    public static void subset(int n,ArrayList<Integer> subset)
    {
        if(n==0)
        {
            printsubset(subset);
            return;
        }
        //add hoga
        subset.add(n);
        subset(n-1,subset);


        //no addition
        subset.remove(subset.size()-1);
        subset(n-1,subset);
    }

    public static void main(String arg[])
    {
        int n=3;
        ArrayList<Integer> subset =new ArrayList<>();
        subset(n,subset);
    }
    
}

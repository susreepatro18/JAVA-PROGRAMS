import java.util.HashSet;

public class unique_subsequence_recursion {
    public static void main(String arg[]) 
    {

        String s="aaa";
        HashSet<String> set=new HashSet<>();
        sub(s,0," ",set);
    }
    public static void sub(String s,int idx,String newstring,HashSet<String>set)
    {
        if(idx==s.length())
        {
            if(set.contains(newstring))
            {
                return;
            }
            else
            {
                System.out.println(newstring);
                set.add(newstring);
                return;
            }
        }
        char curr=s.charAt(idx);
       
       
            sub(s, idx+1, newstring+curr,set);

            sub(s, idx+1, newstring,set);

       
    }
    
}

    


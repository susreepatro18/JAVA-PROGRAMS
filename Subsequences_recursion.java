public class Subsequences_recursion {
    public static void main(String arg[]) 
    {
        String s="abc";
        sub(s,0," ");
    }
    public static void sub(String s,int idx,String newstring)
    {
        if(idx==s.length())
        {
            System.out.print(newstring);
            System.out.println();
            return;
        }
        char curr=s.charAt(idx);
       
       
            sub(s, idx+1, newstring+curr);

            sub(s, idx+1, newstring);

       
    }
    
}

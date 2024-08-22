public class Occurence_recursion {
    public static int first=-1;
    public static int last=-1;
    public static void occ(String str,int idx,char element)
    {
        if(idx==str.length())
        {
            System.out.println(first+1);
            System.out.println(last+1);
            return;
        }
        char curr=str.charAt(idx);
        if(curr==element)
        {
            if(first==-1)
            {
                first=idx;
            }
            else
            {
                last=idx;
            }
        }
        occ(str,idx+1,element);

    }
    public static void main(String arg[])
    {
        String s="aaaanjhgyhntccaa";
        occ(s,0,'a');

    }
    
}

public class Remove_dupli_recursion {
    public static void main(String arg[]) {
        String s="aaaadcsddbbbdgertrdxc";
        removedup(s,0," ");
    }    
    public static boolean[]map=new boolean[26];
    public static void removedup(String s,int idx,String newstring)
    {
        if(idx==s.length())
        {
            System.out.print(newstring);
            return;
        }
        char curr=s.charAt(idx);
        if(map[curr-'a']==true)
        {
            removedup(s, idx+1, newstring);
        }
        else{
            newstring+=curr;
            map[curr-'a']=true;
            removedup(s, idx+1, newstring);
        }
    }
}

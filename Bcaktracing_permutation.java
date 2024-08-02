public class Bcaktracing_permutation {
    public static void permu(String s,String per,int idx)
    {
        if(s.length()==0)
        {
            System.out.println(per);
            return;
        }
        for(int i=0;i<s.length();i++)
        {
            char curr=s.charAt(i);
            String newStr=s.substring(0,i)+s.substring(i+1);
            permu(newStr, per+curr,idx+1);
        }
    }
    public static void main(String arg[])
    {
        String s="ABC";
        permu(s, " ", 0);
    }
    
}

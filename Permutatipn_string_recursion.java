public class Permutatipn_string_recursion {
    public static void permu(String s,String per)
    {
        if(s.length()==0)
        {
            System.out.println(permu);
            return;
        }
        for(int i=0;i<s.length();i++)
        {
            char curr=s.charAt(i);
            String newstring=s.substring(0,i)+s.subString(i+1);
            permu(newstring, per+curr);
        }

    }
    public static void main(String arg[])
    {
        String s="abc";
        permu(s, " ");
        

    }
}

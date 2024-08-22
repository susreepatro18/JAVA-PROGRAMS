public class Keypad_combination_recursion {
    public static String [] keypad={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static void main(String arg[]) {
        String s="6666";
        comb(s, 0, " ");

    }
    public static void comb(String s,int idx,String comb)
    {
        if(idx==s.length())
        {
            System.out.println(comb);
            return;
        }
        char curr=s.charAt(idx);
        String mapping=keypad[curr-'0'];
        for(int i=0;i<mapping.length();i++)
        {
            comb(s, idx+1, comb+mapping.charAt(i));
        }
    }
    
}

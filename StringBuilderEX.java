public class StringBuilderEX {
    public static void main(String arg[]) {
        StringBuilder sb = new StringBuilder("Susree");
        System.out.println(sb);
        System.out.println(sb.charAt(4));
        sb.setCharAt(4, 'o');
        System.out.println(sb);
        sb.insert(0, 's');
        System.out.println(sb);
        sb.delete(0, 1);
        System.out.println(sb);
        sb.append('e');
        System.out.println(sb);
        int l=sb.length();
        //method 1
        for(int i=l-1;i>=0;i--)
        {
            System.out.print(sb.charAt(i));
        }
        System.out.println();
        //method 2
        for(int i=0;i<l/2;i++)
        {
            int front=i;
            int back=l-i-1;

            char frontchar=sb.charAt(front);
            char backchar=sb.charAt(back);

            sb.setCharAt(front, backchar);
            sb.setCharAt(back, frontchar);
        }
        System.out.println(sb);
    }
    
}

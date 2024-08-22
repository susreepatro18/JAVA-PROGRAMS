public class Total_guest_call_recursion {
    public static int callguests(int n)
    {
        if(n==1||n==0)
        {
            return 1;
        }

        //single
        int way1=callguests(n-1);

        //pair
        int way2=(n-1)*callguests(n-2);

        return way1+way2;
    }
    public static void main(String arg[])
    {
        int n=4;
        int r=callguests(n);
        System.out.println(r);
    }
    
}

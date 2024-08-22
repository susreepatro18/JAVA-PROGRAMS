public class Total_tiles_count_recursion {
    public static int placetiles(int n,int m)
    {
        if(n==m)
        {
            return 2;
        }
        if(n<m)
        {
            return 1;
        }



    //vertically placed
    int vert=placetiles(n-m,m);

    //horizontally placed
    int hori=placetiles(n-1, m);

    return vert+hori;
    }
    public static void main(String arg[]) {
        int n=4,m=4;
        int r=placetiles(n,m);
        System.out.println(r);

    }
}

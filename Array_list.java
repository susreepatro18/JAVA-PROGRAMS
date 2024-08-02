import java.util.ArrayList;
import java.util.Collections;
public class Array_list {
    public static void main(String args[]) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        // ArrayList<Stringr> list2=new ArrayList<String>();

        // ArrayList<Boolean> list3=new ArrayList<Boolean>();

        list.add(0);
        list.add(20);

        list.add(6);
        System.out.println(list);


        //hget elements

        int ele=list.get(2);
        System.out.println(ele);

        //add ele in between
        list.add(1,1);
        System.out.println(list);


        //set element
        list.set(0,5);
        System.out.println(list);


        //delete element
        list.remove(1);
        System.out.println(list);


        //size
        int s=list.size();
        System.out.println(s);


        //loops
        for(int i=0;i<s;i++)
        {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();


        //sort
        Collections.sort(list);
        System.out.println(list);






    }
    
}

import java.util.*;

public class Linked_list_automatic {
    public static void main(String args[])
{
    LinkedList<String> list=new LinkedList<String>();
    list.addFirst("a");
    list.addFirst("is");
    System.out.println(list);
    list.addFirst("this");
    list.add("list");
    System.out.println(list);
    System.out.println(list.size());
    for(int i=0;i<list.size();i++)
    {
        System.out.print(list.get(i)+"->");
    }
    System.out.println("null");
    list.removeFirst();
    System.out.println(list);

    list.removeLast();
    System.out.println(list);
    list.remove(0);
    System.out.println(list);
}    
}

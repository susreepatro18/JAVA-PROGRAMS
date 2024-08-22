public class Linked_list_1 {
    Node head;
    private int size;
    Linked_list_1()
    {
        this.size=0;
    }


    class Node{
        String data;
        Node next;


        Node(String data)
        {
            this.data=data;
            this.next=null;
            size++;
        }
    }
    //add first,data
    public void addfirst(String data)
    {
        Node newnode=new Node(data);
        if(head==null)
        {
            head=newnode;
            
            return;
        }
        
            newnode.next=head;
            head=newnode;
           

        
    }

    //add last
    public void addlast(String data)
    {
        Node newnode=new Node(data);
        if(head==null)
        {
            head=newnode;
            return;
          

        }
        
            Node curr=head;
            while(curr.next!=null)
            {
                curr=curr.next;
            }
            curr.next=newnode;
            
       
    }
    //delete first
    public void deletefirst()
    {
        if(head==null)
        {
            System.out.println("list is empty");
            return;

        }
        size--;
        head=head.next;
    }

    //delete last
    public void deletelast()
    {
        if(head==null)
        {
            System.out.println("list is empty");
        }
        size--;
        if(head.next==null)
        {
            head=null;
            return;
        }
        Node secondlast=head;
        Node lastnode=head.next;
        while(lastnode.next!=null)
        {
            lastnode=lastnode.next;
            secondlast=secondlast.next;
        }
        secondlast.next=null;

    }
    public void printlist()
    {
        Node curr=head;
        if(head==null)
        {
            System.out.println("list is empty");
            return;
        }
        while(curr!=null)
        {
            System.out.print(curr.data+"->");
            curr=curr.next;
        }
    }
    public int getsize()
    {
        return size;
    }
    public static void main(String args[]){
        Linked_list_1 list=new Linked_list_1();
        list.addfirst("a");
        list.addfirst("is");
        list.addfirst("this");
        list.addlast("linked list");
        list.printlist();
        int s=list.getsize();
        System.out.println("\n"+s);
        list.deletefirst();
        list.printlist();
        System.out.println();
        list.deletelast();
        list.printlist();
        System.out.println("\n"+list.getsize());





    }
    
}

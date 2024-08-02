public class ADDING_numbers_linkedlist {
    Node head;
    class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public void add(int data)
    {
        Node newnode=new Node(data);
        if(head==null)
        {
            head=newnode;
            return;
        }
        Node curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
           curr.next=newnode;
    }
        public static void main(String args[])
    {
        ADDING_numbers_linkedlist list=new ADDING_numbers_linkedlist();
        list.add(1);
        list.add(5);
        list.add(7);
        list.add(3);
        list.add(8);
        list.add(2);
        list.add(3);

        int target=7;
        Node c= list.head;
        int i=0;
        while(c!=null)
        {
            if(c.data==target)
            {
                System.out.println("element at"+" "+i);
            }
            c=c.next;
            i++;
        }


    }
    
}

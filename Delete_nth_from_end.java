public class Delete_nth_from_end {
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
    public Node remove(Node head,int n)
    {
        if(head==null)
        {
            return null;
        }

        //size
        int size=0;
        Node curr=head;
        while(curr!=null)
        {
            curr=curr.next;
            size++;
        }
        if(n==size)
        {
            return head.next;
        }
        int idx=size-n;
        Node prev=head;
        for (int i = 1; i < idx; i++) {
            prev = prev.next;
        }

        // Remove the nth node from the end
        if (prev.next != null) {
            prev.next = prev.next.next;
        }
        
        return head;
    }
    public static void main(String args[]) {
        Delete_nth_from_end list=new Delete_nth_from_end();
            list.add(1);
            list.add(5);
            list.add(7);
            list.add(3);
            list.add(8);
            list.add(2);
            list.add(3);
            list.remove(list.head,2);
            Node current=list.head;
            while(current!=null)
            {
                System.out.print(current.data+"->");
                current=current.next;
            }

    }
    
}

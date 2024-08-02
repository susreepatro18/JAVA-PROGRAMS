
    public class Reverse_linked_list {
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
        public void reverseList() {
            if(head == null || head.next == null) {
                return;
            }
     
     
            Node prevNode = head;
            Node currNode = head.next;
            while(currNode != null) {
                Node nextNode = currNode.next;
                currNode.next = prevNode;
                prevNode = currNode;
                currNode = nextNode;
            }
            head.next = null;
            head = prevNode;
        }
        public Node reverseListRecursive(Node head) {
            //empty node || last node or only one node
            if(head == null || head.next == null) {
                return head;
            }
     
     
            Node newHead = reverseListRecursive(head.next);
           
            head.next.next = head;
            head.next = null;
            return newHead;
        }
     
     
     
            public static void main(String args[])
        {
            Reverse_linked_list list=new Reverse_linked_list();
            list.add(1);
            list.add(5);
            list.add(7);
            list.add(3);
            list.add(8);
            list.add(2);
            list.add(3);
            list.reverseList();
            Node current=list.head;
            while(current!=null)
            {
                System.out.print(current.data+"->");
                current=current.next;
            }
    
            // int target=7;
            // Node c= list.head;
            // int i=0;
            // while(c!=null)
            // {
            //     if(c.data==target)
            //     {
            //         System.out.println("element at"+" "+i);
            //     }
            //     c=c.next;
            //     i++;
            // }
    
    
        }
        
    }
        


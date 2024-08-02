public class CHECK_linkedlist_loop {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void add(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;
        }
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newnode;
    }

    public void printlist() {
        Node curr = head;
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        while (curr != null) {
            System.out.print(curr.data + "->");
            curr = curr.next;
        }
        System.out.println("null");
    }
    public boolean hascycle(Node head)
    {
        if(head==null)
        {
            return false;
        }
        Node hare=head;
        Node turtle=head;
        while(hare!=null&&hare.next!=null)
        {
            hare=hare.next.next;
            turtle=turtle.next;

            if(hare==turtle)
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]) {
        CHECK_linkedlist_loop list = new CHECK_linkedlist_loop();
            
            list.add(4);
            list.add(5);
            list.add(5);
            list.add(5);
            list.add(5);
            list.add(4);
    
            list.printlist();
            if (list.hascycle(list.head)) {
                System.out.println("The linked list is a cycle.");
            } else {
                System.out.println("The linked list is not a cycle.");
            }
        }
    }

public class Palindrome_linkedlist {
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

    public Node reverse(Node head) {
        Node prev = null;
        Node curr = head;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public Node findmiddle(Node head) {
        Node hare = head;
        Node turtle = head;
        while (hare.next != null && hare.next.next != null) {
            hare = hare.next.next;
            turtle = turtle.next;
        }
        return turtle;
    }

    public boolean ispalindrome(Node head) {
        if (head == null || head.next == null) {
            return true;
        }

        Node middle = findmiddle(head); // 1st half's end
        Node secondhalfstart = reverse(middle.next);
        Node firsthalfstart = head;

        while (secondhalfstart != null) {
            if (firsthalfstart.data != secondhalfstart.data) {
                return false;
            }
            firsthalfstart = firsthalfstart.next;
            secondhalfstart = secondhalfstart.next;
        }
        return true;
    }

    public static void main(String args[]) {
        Palindrome_linkedlist list = new Palindrome_linkedlist();
        list.add(4);
        list.add(5);
        list.add(5);
        list.add(5);
        list.add(5);
        list.add(4);

        list.printlist();

        if (list.ispalindrome(list.head)) {
            System.out.println("The linked list is a palindrome.");
        } else {
            System.out.println("The linked list is not a palindrome.");
        }
    }
}

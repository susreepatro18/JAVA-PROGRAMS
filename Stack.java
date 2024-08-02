public class Stack {
    static class Node {
        int data;
        Node next;
        
        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    static class StackOps {
        public Node head;

        public boolean isempty() {
            return head == null;
        }

        public void push(int data) {
            Node newnode = new Node(data);
            newnode.next = head;
            head = newnode;
        }

        public int pop() {
            if (isempty()) {
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        public int peek() {
            if (isempty()) {
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String arg[]) {
        StackOps s = new StackOps();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);

        while (!s.isempty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}

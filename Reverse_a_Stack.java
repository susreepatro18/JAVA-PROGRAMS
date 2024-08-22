import java.util.Stack;

public class Reverse_a_Stack {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(3);
        s.push(2);
        s.push(1);
        //int data = 4; // Define the data to be pushed at the bottom
        reverse(s);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }

        public static void reverse(Stack<Integer> s)
        {
            if(s.empty())
            {
                return;
            }
            int top=s.pop();
            reverse(s);
            pushAtBottom(top,s);
        }
        public static void pushAtBottom(int data, Stack<Integer> s) {
            if (s.isEmpty()) {
                s.push(data);
                return;
            }
            int top = s.pop();
            pushAtBottom(data, s);
            s.push(top);
        }


    
}


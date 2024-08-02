import java.util.*;

public class Queue_collection_framework {
    public static void main(String[] args) {
        // Queue<Integer> q=new LinkedList<>();
        Queue<Integer> q=new ArrayDeque<>();
        q.add(11);
        q.add(12);
        q.add(13);
        q.add(14);
        q.add(15);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
    
}

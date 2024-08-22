public class Circular_Queue_Array {
    static class Queue{
        static int arr[];
        static int size;
        static int rear=-1;
        static int front =-1;
        Queue(int n)
        {
            arr=new int[n];
            this.size=n; 
        }
        public static boolean isEmpty()
        {
            return rear==-1 && front==-1;
        }
        public static boolean isFull()
        {
            return (rear+1)%size==front;
        }
        //add or enqueue
        public static void add(int data)
        {
            if(isFull())
            {
                System.out.println("queue is full");
                return;
            }
            if(front==-1)
            {
                front=0;
            }
            rear=(rear+1)%size;
            arr[rear]=data;
        }
        //remove or dequeue
        public static int remove()
        {
            if(isEmpty())
            {
                System.out.println("queue empty");
                return -1;
            }
            int result=arr[front];
            if(rear==front)
            {
                rear=front=-1;
            }
            else{
                front=(front+1)%size;
            }
            return result;

            
        }
        //peek
        public static int peek()
        {
            if(isEmpty())
            {
                System.out.println("empty queue");
                return 0-1;
            }
            return arr[front];
        }
    }
        public static void main(String args[])
    {
            Queue q = new Queue(5); 
                q.add(11);
                q.add(12);
                q.add(13);
                q.add(14);
                q.add(15);
                q.remove();

                while(!q.isEmpty())
                {
                    System.out.println(q.peek());
                    q.remove();
                }
                
            }
    
}


import java.util.Queue;
// queue using array
public class Queue1 {
    static class Queue{
        static int arr[];
        static int size;
        static int rear=-1;
        Queue(int n)
        {
            arr=new int[n];
            this.size=n; 
        }
        public static boolean isEmpty()
        {
            return rear==-1;
        }

        //add or enqueue
        public static void add(int data)
        {
            if(rear==size-1)
            {
                System.out.println("queue is full");
                return;
            }
            rear++;
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
            int front=arr[0];
            for(int i=0;i<rear;i++)
            {
                arr[i]=arr[i+1];
            }
            rear--;
            return front;
        }

        //peek
        public static int peek()
        {
            if(isEmpty())
            {
                System.out.println("empty queue");
                return 0-1;
            }
            return arr[0];
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
    


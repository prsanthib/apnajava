class circularqueue
{
    static class queue
    {
        static int[] arr;
        static int rear;
        static int front;
        static int size;
        queue(int n)
        {
            arr = new int[n];
            rear = -1;
            size = n;
            front = -1;
        }
        public static boolean isEmpty()
        {
            return rear == -1 && front == -1;
        }
        public static boolean isFull()
        {
            return (rear+1)%size == front;
        }
        public static void add(int data)
        {
            //full condition
            if(isFull())
            {
                System.out.println("que if full");
                return;
            }
            if(front == -1)
            {
                front = 0;
            }
            rear = (rear+1)%size;
            arr[rear] = data;
        }
        public static int remove()
        {
            if(isEmpty())
            {
                System.out.println("queue is empty");
                return -1;
            }
            int result = arr[front];
            if(rear == front)
            {
                rear = front = -1;
            } else {
                front = (front + 1)%size;
            }
            
            return result;
        }
        public static int peek()
        {
            if(front == -1)
            {
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String args[])
    {
        queue q = new queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        while(!q.isEmpty())
        {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
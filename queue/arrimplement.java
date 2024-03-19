class arrimplement
{
    static class queue
    {
        static int[] arr;
        static int rear;
            queue(int size)
            {
                arr = new int[size];
                rear = -1;
            }

    public  boolean isEmpty()
    {
        return rear == -1;
    }
    public static int peek()
    {
        return arr[0];
    }
    public  void add(int data)
    {
        if(rear == arr.length-1)
        {
            System.out.println("queue is full");
            return;
        }
        rear = rear+1;
        arr[rear] = data;
    }
    public int remove()
    {
        if(rear == -1)
        {
            System.out.println("empty queue");
            return -1;
        }
        int front = arr[0];
        rear = rear-1;
        for(int i = 0 ; i< arr.length-1 ; i++)
        {
            arr[i] = arr[i+1];
        }
        return front;
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
        //System.out.println(q.remove());

        while(!q.isEmpty())
        {
            System.out.println(q.peek());
            q.remove();
        }
    }
}

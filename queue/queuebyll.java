class queuebyll
{
    static class Node
    {
        int data;
        Node next;
            Node(int data)
            {
                this.data = data;
                this.next = null;
            }
    }
    public static class queue
    {
      public static Node head = null;
      public static Node tail = null; 

      public static boolean isEmpty()
      {
        return head == null && tail == null;
      }   

      public static void add(int data)
      {
        Node newNode = new Node(data);
        if(head == null)
        {
            head = tail = newNode;
        }
        tail.next = newNode;
        tail = newNode;
      }
      public static int remove()
      {
        if(isEmpty())
        {
            System.out.println("empty queue");
            return -1;
        }
        int element = head.data;
        if(head == tail)
        {
            head = tail = null; 
        } else {
            head = head.next;
        }
            return element;
      }

      public static int peek()
      {
        return head.data;
      }
    }
    public static void main(String args[])
    {
        queue q = new queue();
        q.add(5);
        q.add(7);
        q.add(1);
        q.add(2);
        q.remove();
        q.add(4);
        System.out.println("peek is "+q.peek());

        while(!q.isEmpty())
        {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
class stackll
{
    public static class Node
    {
        int data;
        Node next;   
        public Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;

    public static class stack
    {
        public static boolean isEmpty()
        {
            return head == null;
        }

        public static void push(int data)
        {
            Node newNode = new Node(data);
            if(isEmpty())
            {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        public static int pop()
        {
            if(isEmpty())
            {
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        public static int peek()
        {
            if(isEmpty())
            {
                return -1;
            }
            return head.data;
        }

        public static void print()
        {
            Node temp = head;
            while(temp != null)
            {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
 }
 public static void main(String args[])
        {
            stack sc = new stack();
            sc.push(1);
            sc.push(2);
            sc.push(3);
            sc.push(4);
            sc.print();
            System.out.println("peek is "+sc.peek());
            System.out.println("poped element is "+sc.pop());
            sc.print();


    }
}

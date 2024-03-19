class circularll
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
    public static Node tail;
    public void addFirst(int data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            head = tail = newNode;
            head.next = head;
            return;
        }
        newNode.next = head;
        head = newNode;
        tail.next = head;
    }
    public void addLast(int data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            head = tail = newNode;
            head.next = head;
            return;
        }

        newNode.next = head;
        tail.next = newNode;
        tail = newNode;
    }
    public void print()
    {
        if(head == null)
        {
            System.out.println("circular linked list is empty");
            return;
        }
        Node temp = head;
        do
        {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }while(temp!= head);
        System.out.print(temp.data);
        System.out.println();
        
    }
    public void removeFirst()
    {
        if(head == null)
        {
            System.out.println("the circular linked list is empty");
            return;
        }
        head = head.next;
        tail.next = head;
    }
    public void removeLast()
    {
        if(head == null)
        {
            System.out.println("Circular inked list is empty");
            return;
        }
        Node temp = head;
        while(temp.next != tail)
        {
            temp = temp.next;
        }
        tail = temp;
        temp.next = head;

    }
    public static void main(String args[])
    {
        circularll cl = new circularll();
        cl.addFirst(2);
        cl.addFirst(1);
        cl.addLast(5);
        cl.addLast(3);
        cl.addLast(7);
        cl.print();
        cl.removeFirst();
        cl.removeLast();
        cl.print();
     
    }
}
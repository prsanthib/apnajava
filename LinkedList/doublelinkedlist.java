class doublelinkedlist
{
    public static class Node
    {
        int data;
        Node next;
        Node prev;

        public Node(int data)
        {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public void addFirst(int data)
    {
        Node newNode = new Node(data);
        size++;
        if(head == null)
        {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void addLast(int data)
    {
        Node newNode = new Node(data);
        size++;
        if(head == null)
        {
            head = tail = newNode;
            return;
        }
        newNode.prev = tail;
        tail.next = newNode;
        tail = newNode;
    }
    public int removeFirst()
    {
        if(head == null)
        {
            System.out.println("doublelinked list is empty");
            size--;
            return Integer.MIN_VALUE;
        }
        if(size == 1)
        {
            int value = head.data;
            head = tail = null;
            size--;
            return value;
        }
        int value = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return value;
    }
    public int removeLast()
    {
        int value = tail.data;
        tail = tail.prev;
        tail.next = null;
        size--;
        return value;
    }
    public void print()
    {
        if(head == null)
        {
            System.out.println("double linked list is empty");
        }
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data+"<->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String args[])
    {
        doublelinkedlist dl = new doublelinkedlist();
        dl.addFirst(3);
        dl.addFirst(4);
        dl.addFirst(2);
        dl.addFirst(1);
        dl.print();
        dl.addLast(9);
        dl.addLast(5);
        dl.print();
        System.out.println("size is "+size);
        System.out.println("removed element is "+dl.removeFirst());
        System.out.println("removed element is "+dl.removeFirst());
        dl.print();
        System.out.println("size is "+size);
        System.out.println("removed element is "+dl.removeLast());
        dl.print();
        System.out.println("size is "+size);
    }
}
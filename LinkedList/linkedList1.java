//linked list is a linear data structure
public class linkedList1
{
    public static class Node
    {
        int data;
        Node next;

        public Node(int data)
        {
            this.data = data;
            this.next = next;
        }
    }
    public Node head ;
    public Node tail ;
    public static int size;

    public void addfirst(int data)
    {
        Node newNode = new Node(data);
        size++;
        if(head == null)
        {
            head = tail = newNode;
            head.next = null;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addlast(int data)
    {
        Node newNode = new Node(data);
        size++;
        if(head == null)
        {
            head = tail = newNode;
            head.next = null;
        }

        tail.next = newNode;
        tail = newNode;
    }

    public void addmiddle(int index , int data)
    {
        Node newNode = new Node(data);
        size++;
        if(head == null)
        {
            head = tail = newNode;
            head.next = null;
            return;
        }
        Node temp = head;
        int count = 0;
        while(count < index-1)
        {
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;

    }

    public int removefirst()
    {
        if(size == 0)
        {
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1){
            int value = head.data;
            head = tail = null;
            size = 0;
            return value;
        }
        int k = head.data;
        head = head.next;
        size--;
        return k;
    }
    public void printll()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public int removelast()
    {
        if(size == 0)
        {
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        } else if(size == 1) {
            int k = head.data;
            head = tail = null;
            size = 0;
            return k;
        }

        Node  prev = head;
        
        for(int i = 0 ; i< size-2 ; i++)
        {
            prev = prev.next;
        }

        int k = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return k;
    }
    public static void main(String args[])
    {
        linkedList1 ll = new linkedList1();
        ll.addfirst(1);
        ll.printll();
        ll.addfirst(2);
        ll.printll();
        ll.addlast(3);
        ll.printll();
        ll.addlast(4);
        ll.printll();
        ll.addmiddle(1,9);
        ll.printll();
        System.out.println("removed element is "+ll.removefirst());
        ll.printll();
        System.out.println("removed element is "+ll.removelast());
        ll.printll();
        System.out.println("size is "+size);
    }
}
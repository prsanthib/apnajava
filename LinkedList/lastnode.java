public class lastnode
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
    public static Node head;
    public static Node tail;
    public static int size ;
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
    public void nthnode(int n)
    {
        int sz = 0;
        Node temp = head;
        while(temp != null)  //1 2 3 4 5 
        {
            temp = temp.next;
            sz++;
        }
        if(n == sz)
        {
            head = head.next;
            return;
        }
        int count = 1 ;
        int k = sz-n;
        Node prev = head;
        while(count < k)
        {
            prev = prev.next;
            count++;
        }

        //int p = prev.next.data;
        prev.next = prev.next.next;
        //return p;
    }
    public void printll()
    {
        if(head == null)
        {
            System.out.println("empty list");
        }

        Node temp = head;

        while(temp != null)
        {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
   public static void main(String args[])
    {
        lastnode ll = new lastnode();
        ll.addfirst(5);
        ll.addfirst(4);
        ll.addfirst(3);
        ll.addfirst(2);
        ll.addfirst(1);
        ll.addfirst(7);
        ll.printll();
        ll.nthnode(4);
        //System.out.println(""+k);
        ll.printll();
    }
}
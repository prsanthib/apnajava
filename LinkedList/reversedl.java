class reversedl
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
    public void addFirst(int data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }
    public void print()
    {
        if(head == null)
        {
            System.out.println("double linked list is empty");
            return;
        }
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data+"<->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    //printing reverse
    public void preverse()
    {
        if(head == null)
        {
            System.out.println("empty double linked list");
            return;
        }
         Node temp = tail;
         while(temp != null)
         {
            System.out.print(temp.data+"<->");
            temp = temp.prev;
         }
         System.out.println("null");
    }
    public void reverse()
    {
        Node prev = null;
        Node curr = head;
        Node next;
        while(curr != null)
        {
            next = curr.next;
            curr.prev = next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    public static void main(String args[])
    {
        reversedl dl = new reversedl();
        dl.addFirst(9);
        dl.addFirst(8);
        dl.addFirst(7);
        dl.addFirst(6);
        dl.addFirst(5);
        dl.addFirst(4);
        dl.print();
        dl.preverse();
        dl.reverse();
        dl.print();

    }
}
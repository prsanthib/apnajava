public class reversell
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

    public void addfirst(int data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            head = tail = newNode;
            head.next = null;
            return;
        }

        newNode.next = head;
        head = newNode;

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
    public void reverse()    //o(n)
    {
        Node prev = null;
        Node curr = head;
        Node next;

        while(curr != null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    public static void main(String args[])
    {
        reversell ll = new reversell();
        ll.addfirst(5);
        ll.addfirst(4);
        ll.addfirst(3);
        ll.addfirst(2);
        ll.addfirst(1);
        ll.addfirst(7);
        ll.printll();
        ll.reverse();
        ll.printll();

    }
}
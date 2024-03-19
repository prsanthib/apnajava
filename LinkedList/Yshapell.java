//time complexity is O(m*n) space complexity is O(1)
class Yshapell
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
    public static Node head1;
    public static Node head2;
    public static Node tail1;
    public static Node tail2;
    public void addFirstl1(int data)
    {
        Node newNode = new Node(data);
        if(head1 == null)
        {
            head1 = tail1 = newNode;
            return;
        }
        newNode.next = head1;
        head1 = newNode;
    }
    public void addFirstl2(int data)
    {
        Node newNode = new Node(data);
        if(head2 == null)
        {
            head2 = tail2 = newNode;
            return;
        }
        newNode.next = head2;
        head2 = newNode;
    }
    public void print(Node head)
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
     public void connectnode()
     { 
        for(Node temp1 = head1 ; temp1 != null ; temp1 = temp1.next)
        {
            for(Node temp2 = head2 ; temp2 != null ; temp2 = temp2.next)
            {
                if(temp1 == temp2)
                {
                    return temp1.data;
                    
                }
            }
        }
        return -1;
    }
    public static void main(String args[])
    {
        Yshapell ll = new Yshapell();
        ll.addFirstl1(7);
        ll.addFirstl1(6);
        ll.addFirstl1(3);
        ll.addFirstl1(2);
        ll.addFirstl1(1);
        ll.addFirstl2(5);
        ll.addFirstl2(4);
        Node temp = head1;
        while(temp.next.next != null)
        {
            temp = temp.next;
        }
        tail2.next = temp;
        tail2 = tail1;
        ll.print(head1);
        ll.print(head2);
        System.out.println(""+ll.connectnode());
    }
}

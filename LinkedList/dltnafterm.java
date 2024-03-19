class dltnafterm
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
    public void print(Node head)
    {
        Node temp = head;
        while (temp != null)
        {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void dlt(int m, int n, Node head)
    {
    
    Node temp = head;
    Node temp2 = head;
    while(temp != null)
    {
        int cm = 1;
        int cn = 1;
    while( cm < m && temp != null)
    {
        temp = temp.next;
        cm++;
    }
    if(temp == null)
    {
        return;
    }
    
    temp2 = temp.next;
    while(cn <= n && temp2 != null)
    {
        Node t = temp2;
        temp2 = temp2.next;
        cn++;
    }
    temp.next = temp2;
    temp = temp2;
    }
    }
    public static void main(String args[])
    {
        dltnafterm ll = new dltnafterm();
        Node newNode = new Node(1);
        Node head = newNode;
        newNode = new Node(2);
        head.next = newNode;
        newNode = new Node(3);
        head.next.next = newNode;
        newNode = new Node(4);
        head.next.next.next = newNode;
        newNode = new Node(5);
        head.next.next.next.next= newNode;
        newNode = new Node(6);
        head.next.next.next.next.next= newNode;
        newNode = new Node(7);
        head.next.next.next.next.next.next= newNode;
        newNode = new Node(8);
        head.next.next.next.next.next.next.next= newNode; 
        ll.print(head);     
        int m = 2;
        int n = 2;
        ll.dlt(m,n,head);  
        ll.print(head);
    }
}


class evenfirst
{
    public static class Node{
        int data;
        Node next;

        public Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public void efol()
    {
        Node temp = head;
        Node temp2 = head;
        int k,p;
       while(temp.data % 2 != 0 && temp != null)
       {
             k = temp.data;
            temp = temp.next;
       }
       while(temp2.data % 2 == 0 && temp != null)
       {
            p = temp2.data;
            temp2 = temp2.next;
       }
        int tep = k;
        k = p ;
        p = tep;

    }
    public static void main(String args[])
    {
        evenfirst ll = new evenfirst();
        Node newNode = new Node(1);
        head = newNode;
        newNode = new Node(2);
        head.next = newNode;
        newNode = new Node(3);
        head.next.next = newNode;
        newNode = new Node(4);
        head.next.next.next = newNode;
        newNode = new Node(5);
        head.next.next.next.next = newNode;
        ll.efol();
    }
}
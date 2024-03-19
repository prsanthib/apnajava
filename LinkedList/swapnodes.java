class swapnodes
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
    public void swap(int key1 , int key2)
    {
        // if both are equal then nothing should be done
        if(key1 == key2)
        return;
        Node currx = head;
        Node curry = head;
        Node prevx = null;
        Node prevy = null;
        while(currx != null && currx.data != key1)
        {
            prevx = currx;
            currx = currx.next;
        }

        //check for other pointer
        while(curry != null && curry.data != key2)
        {
            prevy = curry;
            curry = curry.next;
        }

        //check whether they are null
        if(curry == null || currx == null)
        {
            return;
        }

        //check whether it is head node
        if(prevx != null)
        {
            prevx.next = curry;
        }
        else
        {
            head = curry;
        }

        if(prevy != null)
        {
            prevy.next = currx;
        }
        else
        {
            head = currx; 
        }

        //then swap the nodes
        Node temp = currx.next;
        currx.next = curry.next;
        curry.next = temp;
    }
    public void print()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static Node head;
    public static void main(String args[])
    {
        swapnodes ll = new swapnodes();
        Node newNode = new Node(1);
        head = newNode;
        newNode = new Node(2);
        head.next = newNode;
        newNode = new Node(3);
        head.next.next = newNode;
        newNode = new Node(4);
        head.next.next.next = newNode;
        ll.print();
        ll.swap(1,2);
        ll.print();
    }
}
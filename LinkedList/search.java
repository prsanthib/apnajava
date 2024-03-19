public class search
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
    public int search(int key)
    {
        int i = 1;
        Node temp = head;
        while(temp != null)
        {
            if(temp.data == key)
            {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }
    //recursive search
    public int helper(Node head ,int key)
    {
        if(head == null)
        {
            return -1;
        }

        if(head.data == key)
        {
            return 0;
        }

        int idx = helper(head.next,key);
        if(idx == -1)
        {
            return -1;
        }

        return idx+1;
    }
    public int recursivesearch(int key)
        {
            return helper(head,key);
        }

    public static void main(String args[])
    {
        search ll = new search();
        ll.addfirst(5);
        ll.addfirst(4);
        ll.addfirst(3);
        ll.addfirst(2);
        ll.addfirst(1);
        ll.addfirst(7);

        ll.printll();

        //int k = ll.search(4);

       // System.out.println("the element found at index "+k);
        System.out.println(""+ll.helper(head,4));

    }
}
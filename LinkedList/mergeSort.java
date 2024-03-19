class mergeSort
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
    public void addfirst(int data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            head = newNode;
            head.next = null;
            return;
        }

        newNode.next = head;
        head = newNode;

    }
    public static void printll()
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
    public static Node midd(Node head)
    {
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public Node mergesort(Node head)
    {
        //base condition
        if(head == null || head.next == null)
        {
            return head;
        }
        //find middle
        Node mid = midd(head);
        // divide the ll into 1st half and second half
        Node righthead = mid.next;
        mid.next = null;
        Node newleft = mergesort(head);
        Node newright = mergesort(righthead);

    return merge(newleft , newright);
    }
    public static Node merge(Node left , Node right)
    {
        Node aux = new Node(-1);
        Node temp = aux;
        while(left != null && right != null)
        {
            if(left.data <= right.data)
            {
                temp.next = left;
                left = left.next;
                temp = temp.next;
            }
            else
            {
                temp.next = right;
                right = right.next;
                temp = temp.next;
            }

            while(left!= null)
            {
                temp.next = left;
                left = left.next;
                temp = temp.next;
            }
            while(right!= null)
            {
                temp.next = right;
                right = right.next;
                temp = temp.next;
            }
        }
        return aux.next;
    }
    public static void main(String args[])
    {
        mergeSort ll = new mergeSort();
        ll.addfirst(1);
        ll.addfirst(2);
        ll.addfirst(3);
        ll.addfirst(4);
        ll.addfirst(5);
        printll();  
        ll.head = ll.mergesort(ll.head);
        printll();       
    }
}
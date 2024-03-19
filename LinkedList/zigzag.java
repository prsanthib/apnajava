class zigzag
{
    public class Node
    {
        int data ;
        Node next;
        public Node(int data)
        {
            this.data = data;
            this.next = next;
        }
    }
    public static Node head;
    public void addFirst(int data)
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
    public void print()
    {
        if(head == null)
        {
            System.out.println("empty linked list");
            return;
        }

        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // for finding zigzag first we have to find mid such that mid is last node of left half
    public Node getMid()
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
    //now reverse the 2nd half of the linked list
    public Node reverse()
    {
        Node mid = getMid();

        Node prev = null;
        Node curr = mid.next;
        mid.next = null;
        Node next;
        while(curr != null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;           
        }
        return prev;
    }
    public void zigzag()
    {
        Node rhead = reverse();
        Node lhead = head;
        while(rhead != null && lhead != null)
        {
            Node nleft = lhead.next;
            lhead.next = rhead;
            Node nright = rhead.next;
            rhead.next = nleft;
            //update
            lhead = nleft;
            rhead = nright; 
        }
    }
    public static void main(String args[])
    {
        zigzag ll = new zigzag();
        ll.addFirst(6);
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.print();
        ll.zigzag();
        ll.print();

    }
}
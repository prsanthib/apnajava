public class pal
{
    public class Node
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
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public Node mid()
    {
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null)
        {
            slow = slow.next; //turtle
            fast = fast.next.next; //hare
        }
        return slow;
    }
    public boolean divide()
    {
        if(head == null || head.next == null )
        {
            return true;
        }
        Node midValue = mid();
        Node prev = null;
        Node curr = midValue;
        Node next;
        while(curr != null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next; 
        }
        Node right = prev;
        Node left = head;
        while(right != null && left != null)
        {
            if(right.data !=left.data)
            {
                return false;
            }
            right = right.next;
            left = left.next;
        }
        return true;
}
    public static void main(String args[])
    {
        pal p = new pal();
        p.addfirst(1);
        p.addfirst(2);
        p.addfirst(1);
        p.addfirst(2);
        p.addfirst(1);
        p.addfirst(2);
        p.addfirst(1);
       // p.addfirst(2);
        p.printll();
        System.out.println(""+p.divide());


    }
}
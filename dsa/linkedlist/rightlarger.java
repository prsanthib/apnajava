//delete node if its right node is larger
import java.util.*;
class rightlarger
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
    public static void delete()
    {
        Node temp = head;
        while(temp != null)
        {
            if(temp.next.data < temp.next.next.data)
            {
                temp.next = temp.next.next;
            }
            temp = temp.next;
        }
    }
    public static Node head;
    public static void main(String args[])
    {
        head = new Node(4);
        head.next = new Node(3);
        head.next.next = new Node(2);
        head.next.next.next = new Node(8);
        head.next.next.next.next = new Node(6);

        Node temp1 = head;
        while(temp1 != null)
        {
            System.out.print(" "+temp1.data);
            temp1 = temp1.next;
        }

        delete();
        Node temp2 = head;
        while(temp2 != null)
        {
            System.out.print(" "+temp2.data);
            temp2 = temp2.next;
        }

    }
}
public class removeCycle
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
    public static void remove()
    {
        Node slow = head;
        Node fast = head;
        int flag = 0;

        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
            {
                flag = 1;
                break;
            }
        }

        if (flag == 0)
        {
            return;
        }
        else
        {
            slow = head;
        }
        Node prev = null;
        while(slow != fast)
        {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        prev.next = null;
    }
    public static boolean isCycle()
    {
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
            {
                return true;
            }
        }
        return false;
    }
    public static void printll()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String args[])
    {
        head = new Node(1);
        Node temp = new Node(3);
        head.next = temp;
        head.next.next = new Node(2);
        head.next.next.next = temp;
        System.out.println(isCycle());
        remove();
        System.out.println(isCycle());
    }
}
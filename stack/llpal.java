import java.util.*;
class llpal
{
    static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String args[])
    {
        Stack<Integer> s = new Stack<>();
        Node head = new Node(2);
        head.next = new Node(3);
        head.next.next = new Node(4);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(2);
        
        Node temp = head;
        while(temp != null)
        {
            s.push(temp.data);
            temp = temp.next;
        }

        int flag = 0;
        Node temp1 = head;
        while(!s.isEmpty())
        {
            if(temp1.data != s.pop()){
            flag = 1;
            break;
            }
            temp1 = temp1.next;
        }
        if(flag == 0)
        {
            System.out.println("LINKED LIST IS A PALINDROME");
        } else {
            System.out.println("LINKED LIST IS NOT A PALINDROME");
        }
    }
}
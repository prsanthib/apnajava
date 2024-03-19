import java.util.*;
public class Yll
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

public static Node head2;
public static Node head1;
public static Node tail1;
public static Node tail2;

public static void print(Node head)
{
    Node k = head;
    while(k != null)
    {
        System.out.print(k.data+"->");
        k = k.next;
    }
    System.out.println("null");
}
public static int findintersection()
{
     Node temp1 = head1;
     Node temp2 = head2;

     while(temp1 != null && temp2 != null)
     {
        if(temp1 == temp2)
        {
            return temp1.data;
        }
        temp1 = temp1.next;
        temp2 = temp2.next;
     }
     return 0;
}
public static void main(String args[])
{
    head1 = new Node(1);
    head1.next = new Node(2);
    head1.next.next = new Node(3);
    Node temp = head1.next.next;
    head1.next.next.next = new Node(4);
    tail1 = head1.next.next.next;
    tail2 = head1.next.next.next;

    head2 = new Node(6);
    head2.next = new Node(7);
    head2.next.next = temp;
    print(head1);
    print(head2);    
    if(findintersection() == 0)
    {
        System.out.println("there is no intersection");
    }
    else
    {
        System.out.println("the node is "+findintersection());
    }
}
}
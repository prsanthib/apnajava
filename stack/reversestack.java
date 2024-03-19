import java.util.*;
class reversestack
{
    public static void pushbottom(Stack<Integer> sc , int data)
    {
        if(sc.isEmpty())
        {
            sc.push(data);
            return;
        }
        int top = sc.pop();
        pushbottom(sc,data);
        sc.push(top);
    }
    public static void reverse(Stack<Integer> sc)
    {
        if(sc.isEmpty())
        {
            return;
        }
        int top = sc.pop();
        reverse(sc);
        pushbottom(sc,top);
    }
    public static void main(String args[])
    {
        Stack<Integer> sc = new Stack<>();
        sc.push(1);
        sc.push(2);
        sc.push(3);
        sc.push(4);

        reverse(sc);

        while(!sc.isEmpty())
        {
            System.out.println(sc.peek());
            sc.pop();
        }
    }
}
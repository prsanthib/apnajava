import java.util.*;
class pushbottom
{
    public static void pushb(Stack<Integer> s , int data)
    {
        if(s.isEmpty())
        {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushb(s,data);
        s.push(top);
    }
    public static void main(String args[])
    {
        Stack<Integer> s = new Stack<>();
        s.push(3);
        s.push(4);
        s.push(5);
        
        pushb(s,7);

        while(!s.isEmpty())
        {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
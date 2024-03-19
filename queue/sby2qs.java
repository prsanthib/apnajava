//here push is O(n) and pop is O(1)
import java.util.*;
class sby2qs
{
    static class Stack
    {
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();

         public static boolean isEmpty()
         {
            return q1.isEmpty();
         }

         public static void push(int data)
         {
             while(!q1.isEmpty())
             {
                q2.add(q1.remove());
             }
             q1.add(data);
             while(!q2.isEmpty())
             {
                q1.add(q2.remove());
             }
         } 

         public static int pop()
         {
            if(q1.isEmpty())
            {
                return -1;
            }
            return q1.remove();
         }
         public static int peek()
         {
            return q1.peek();
         }
    }
    public static void main(String args[])
    {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while(!s.isEmpty())
        {
            System.out.println(s.peek());
            s.pop();
        }
        System.out.println(s.isEmpty());
    }
}
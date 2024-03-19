//here push is O(1) and remove is O(n)
import java.util.*;
class stackbby2queues
{
    static class stack
    {
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();

        public static boolean isEmpty()
        {
            return q1.isEmpty() && q2.isEmpty();
        }

        public static void push(int data)
        {
            if(!q1.isEmpty())
            {
                q1.add(data);       //we add elements to non empty queue
            } else {
                q2.add(data);
            }
        }

        public static int pop()
        {
            int top = 0;
            if(!q1.isEmpty())
            {
                while(!q1.isEmpty())
                {
                top = q1.remove();
                if(q1.isEmpty())
                {
                    break;
                } 
                q2.add(top);
                }
            } else {
                while(!q2.isEmpty())
                {
                top = q2.remove();
                if(q2.isEmpty())
                {
                    break;
                } 
                q1.add(top);
                }
            }
            return top;
        }

        public static int peek()
        {
            int top = 0;
            if(!q1.isEmpty())
            {
                while(!q1.isEmpty())
                {
                top = q1.remove();
                q2.add(top);
                }
            } else {
                while(!q2.isEmpty())
                {
                top = q2.remove();
                q1.add(top);
                }
            }
            return top;
        }

    }
    public static void main(String args[])
    {
        stack s = new stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty())
        {
            System.out.println(s.peek());
            s.pop();
        }
    }
}

import java.util.*;
class deque
{
    
    static Deque<Integer> stack = new LinkedList<>();
    static Deque<Integer> queue = new LinkedList<>();

    public static void push(int data)
    {
        stack.addFirst(data);
    }
    public static int pop()
    {
        return stack.removeFirst();
    }
    public static int peek()
    {
        return stack.getFirst();
    }

    //for queue
    public static void add(int data)
    {
        queue.addFirst(data);
    }
    public static int remove()
    {
        return queue.removeLast();
    }
    public static int qpeek()
    {
        return stack.getLast();
    }
    public static void main(String args[])
    {
        deque d = new deque();
        d.add(1);
        d.add(2);
        d.add(3);
        d.add(4);

       System.out.println("queue is");
        System.out.println(d.remove());
        System.out.println(d.remove());
        System.out.println(d.remove());
        System.out.println(d.remove());
        //stack
        d.push(1);
        d.push(2);
        d.push(3);
        d.push(4);
        
        System.out.println("stack is");
        System.out.println(d.pop());
        System.out.println(d.pop());
        System.out.println(d.pop());
        System.out.println(d.pop());
    }
}
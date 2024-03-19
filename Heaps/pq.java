import java.util.*;
class pq
{
    public static void main(String args[])
    {
        PriorityQueue<Integer> p = new PriorityQueue<>();
        p.add(4);
        p.add(5);
        p.add(1);
        p.add(6);
        p.add(3);

        while(!p.isEmpty())
        {
            System.out.println(p.peek()+" ");
            p.remove();
        }

        //for reverse order
        System.out.println("for reverse order ");
        PriorityQueue<Integer> pq2 = new PriorityQueue<>(Comparator.reverseOrder());
        pq2.add(4);
        pq2.add(5);
        pq2.add(1);
        pq2.add(2);

        while(!pq2.isEmpty())
        {
            System.out.println(pq2.peek()+" ");
            pq2.remove();
        }
    }
}
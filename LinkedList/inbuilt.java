import java.util.LinkedList;
class inbuilt
{
    public static void main(String args[])
    {
        LinkedList<Integer> ll = new LinkedList<>();

        ll.addFirst(1);
        ll.addFirst(2);
        ll.addLast(7);
        ll.addLast(8);
        System.out.println(ll);
        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll);
    }
}
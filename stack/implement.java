//stack using arraylist
import java.util.ArrayList;
public class implement
{
public static class stack
{
    static ArrayList<Integer> list = new ArrayList<>();
    public static boolean isempty()
    {
        return list.size() == 0;
    }
    public static void push(int a)
    {
        list.add(a);
    }
    public static int pop()
    {
        if(isempty())
        {
            System.out.println("nothing to delete");
        }
        int top = list.get(list.size()-1);
        list.remove(list.size()-1);
        return top;
    }
    public static int peek()
    {
        return list.get(list.size()-1);
    }
}    
    public static void main(String args[])
    {
        stack sc = new stack();
        sc.push(1);
        sc.push(2);
        sc.push(3);

        while(!sc.isempty())
        {
            System.out.print(sc.pop()+" ");
        }
        System.out.println();
    }
}

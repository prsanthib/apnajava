// if for all elements value(i)<= value(i+1) it is monotonic increasing
//and value(i) >= value(i+1) then it is monotonic decreasing 
import java.util.ArrayList;
class monotonic 
{
    public static boolean mono(ArrayList<Integer> list)
    {
        boolean k = true;
        boolean j = true;
        for (int i = 0 ; i < list.size()-1 ; i++)
        {
           
            if(list.get(i) > list.get(i+1))
            {
                k = false;
            }
            if(list.get(i) < list.get(i+1))
            {
                j = false;
            }

        }
        return k || j;
    }
    public static void main(String args[])
    {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        System.out.println(mono(list));
    }
}
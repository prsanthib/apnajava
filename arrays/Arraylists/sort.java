import java.util.ArrayList;
import java.util.Collections;

class sort
{
    public static void main(String args[])
    {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(9);
        list.add(5);
        System.out.println(list);
        //sorts in ascending order
        Collections.sort(list);
        System.out.println(list);  
        //descending order
        Collections.sort(list , Collections.reverseOrder());  
        System.out.println(list);  
    }
}
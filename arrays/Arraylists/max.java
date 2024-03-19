import java.util.*;
class max
{
    public static void main(String args[])
    {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(22);
        list.add(03);
        list.add(99);
        list.add(8);

        int max = Integer.MIN_VALUE;

        for(int i = 0 ; i< list.size() ; i++)
        {
            //if(list.get(i) > max)
            //{
              //  max = list.get(i);
           // }
           
           max = Math.max(max,list.get(i));
        }
        System.out.println("the max of the arraylist = " +max );

    }
}
import java.util.*;
class lonelynumbers
{
    public static void lone(ArrayList<Integer> list)
    {
        ArrayList<Integer> list2 = new ArrayList<>();
        for(int i = 0 ; i< list.size() ; i++)
        {
            for(int j = i+1 ; j < list.size() ; j++)
            {
                if(list.get(i)+1  != list.get(j) && list.get(i)-1 != list.get(j) && list.get(i) != list.get(j))
                {

                    if(!list2.contains(list.get(i)))
                    {
                        list2.add(list.get(i));
                    }
                }
            }
        }
        System.out.println(list2);
    }
    public static void main(String args[])
    {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(9);
        list.add(4);
        list.add(5);
        list.add(7);
        
        lone(list);
        //System.out.println(lone(list));
        
    }
}
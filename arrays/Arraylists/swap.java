import java.util.ArrayList;
class swap
{
    public static void swapp(ArrayList<Integer> list , int ind1 ,int ind2)
    {
        //for swapping we use temp
        int temp  = list.get(ind1);
        list.set(ind1 , list.get(ind2));
        list.set(ind2 , temp);
    }
    public static void main(String args[])
    {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("before swapping lis is "+list);
        swapp(list,1,3);
        System.out.println("after swapping list is "+list);
    }
}
import java.util.*;
class hash
{
    public static void main(String args[])
    {
        HashMap<Integer,String> hm = new HashMap<>();
        hm.put(1,"prashu");
        hm.put(2,"Tarun");
        hm.put(3,"mom");
        hm.put(4,"dad");

        System.out.println(hm);

        System.out.println(hm.get(1));    

        System.out.println(hm.containsKey(2));    
        System.out.println(hm.remove(3));

         System.out.println(hm);

         System.out.println(hm.isEmpty());

    }
}
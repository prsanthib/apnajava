import java.util.*;
class hashmap
{
    public static void main(String args[])
    {
        HashMap<String,Integer> hm = new HashMap<>();
        //add
        hm.put("SAMOSA",10);
        hm.put("CHOCOLATE",20);
        hm.put("CAKE",30);
        hm.put("LOVE",40);

        System.out.println(hm);

        System.out.println(hm.get("SAMOSA"));
        System.out.println(hm.get("CAKE"));

        System.out.println(hm.containsKey("SAMOSA"));

        hm.remove("LOVE");
        System.out.println(hm);

        System.out.println(hm.size());

        System.out.println(hm.isEmpty());
    }
}
//here its time complexity is O(n^2)
import java.util.*;
class subarr
{
    public static void sub(int a[])
    {
        List<List<Integer>> subarrays = new ArrayList<>();

        for(int i = 0 ; i < a.length ; i++)
        {
            List<Integer> subarray = new ArrayList<>();
            for(int j = i ; j < a.length ; j++)
            {
                subarray.add(a[j]);
                subarrays.add(new ArrayList<>(subarray));
            }
        }


        //print
        for(int i = 0 ; i < subarrays.size() ; i++)
        {
            System.out.print("[");
            for(int j = 0 ; j < subarrays.get(i).size() ; j++)
            {
            System.out.print(subarrays.get(i).get(j)+" ");
            }
            System.out.print("]");
        }
    }
    public static void main(String args[])
    {
        int a[] = {1,2,3};
        sub(a);
    }
}
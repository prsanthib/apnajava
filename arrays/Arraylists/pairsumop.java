import java.util.*;
class pairsumop
{
    public static boolean sum(ArrayList<Integer> height , int target)
    {
        int lp = 0;
        int rp = height.size()-1;
        while(lp < rp)
        {
           int k = height.get(lp)+height.get(rp); 
            if (k == target)
            {
                return true;
            }
            else if(k > target)
            {
                rp--;
            }
            else
            {
            lp++;
            }
        }
        return false;
    }
    public static void main(String args[])
    {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        
        int target = 10;
        System.out.println(sum(height , target));
    }
}
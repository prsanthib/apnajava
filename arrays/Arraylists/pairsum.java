import java.util.ArrayList;
class pairsum
{
    public static boolean sum(ArrayList<Integer> height , int target)
    {
        for(int i = 0 ; i< height.size() ; i++)
        {
            for(int j = i+1 ; j< height.size() ; j++)
            {
                if(height.get(i) + height.get(j) == target)
                {
                    return true;
                }
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
        
        int target = 18;
        System.out.println(sum(height , target));
    }
}
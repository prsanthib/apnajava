//here we are given an arraylist which is sorted and rotated
//so first we find pivot point and then smallest element has the leftpointer 
//and largest pointer has the right pointer

import java.util.ArrayList;
class pairsum2
{
    public static boolean sum(ArrayList<Integer> list ,int target)
    {
        int bp = 0;        
        for(int i = 0 ; i < list.size()-1 ; i++)
        {
            if((list.get(i) > list.get(i+1)))
            bp = i;            
        }

        int lp = bp+1;
        int rp = bp;
        
        while(lp != rp)
        {
            if(list.get(lp)+list.get(rp) == target)
            {
                return true;
            }

            else if(list.get(lp)+list.get(rp) < target)
            {
            lp = (lp + 1)%list.size();
            }
            else{
            rp = (list.size()+rp - 1)%list.size();
            }
        }
    return false;
    }

    public static void main(String args[])
    {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        int target = 14;

        System.out.println(list);

        System.out.println(sum(list,target));
}
}
//we have to make a container which stores max water
//brute force
import java.util.ArrayList;
class waterincontainer
{
    public static void main(String args[])
    { 
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        int maxwater = 0;
        for(int i = 0 ; i<height.size() ; i++)
        {
            for(int j = i+1 ; j< height.size() ; j++)
            {
                int ht = Math.min(height.get(i) , height.get(j));
                int width = j-i;
                int area = ht * width;
                maxwater = Math.max(area,maxwater);
            }
        }
        System.out.println("the maximum water in container is "+maxarea);
        
    }
}
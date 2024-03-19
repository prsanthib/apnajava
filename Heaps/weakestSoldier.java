import java.util.*;
class weakestSoldier
{
    static class army implements Comparable<army>
    {
        int soldiers;
        int idx;

        public army(int soldiers , int idx)
        {
            this.soldiers = soldiers;
            this.idx = idx;
        }

         @Override
    public int compareTo(army r2)
    {
        if(this.soldiers == r2.soldiers)
        {
           return this.idx - r2.idx;
        }
        return this.soldiers - r2.soldiers;
    }
    }

   

    public static void main(String args[])
    {
        int arr[][] = {{1,0,0,0},{1,1,1,1},{1,0,0,0},{1,0,0,0}};
        PriorityQueue<army> pq = new PriorityQueue<>();
        
        int k = 2;

        for(int i = 0 ; i < arr.length ; i++)
        {
            int count = 0;
            for(int j = 0 ; j < arr[0].length ; j++)
            {
                if(arr[i][j] == 1)
                {
                    count ++;
                }
            }
            pq.add(new army(count,i));
        }
        
        for(int i = 0 ; i<k ; i++)
        {
            System.out.println("R"+i);
        }
    }
}
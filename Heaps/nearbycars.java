import java.util.*;
class nearbycars
{
    static class cars implements Comparable<cars>
    {
        int x;
        int y;
        int dist;
        int idx;

        public cars(int x , int y , int dist , int idx)
        {
            this.x = x;
            this.y = y;
            this.dist = dist;
            this.idx = idx;
        }

        @Override
        public int compareTo(cars c)
        {
            return this.dist - c.dist;
        }
    }

    public static void main(String args[])
    {
        int arr[][] = {{3,3},{5,-1},{-2,4}};
        PriorityQueue<cars> pq = new PriorityQueue<>();
        
        for(int i = 0 ; i< arr.length ; i++)
        {
                //dist^2 = x^2 +y^2;
                int dist = arr[i][0]*arr[i][0] + arr[i][1]*arr[i][1];
                pq.add(new cars(arr[i][0],arr[i][1],dist,i));
        }

        int k = 2;

        for(int i = 0 ; i<k ; i++)
        {
            System.out.println("C"+pq.remove().idx);
        }
    }   
}
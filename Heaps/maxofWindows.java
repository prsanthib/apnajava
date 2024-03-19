//here we have to return a maximum element from each sub array
import java.util.*;
class maxofWindows
{
    static class pairs implements Comparable<pairs>
    {
        int data;
        int idx;

        public pairs(int data ,int idx)
        {
            this.data = data;
            this.idx = idx;       
        }

        @Override
        public int compareTo(pairs p2)
        {
            //ascending order
            //return this.data - p2.data;
            //descending order
            return p2.data - this.data;
        }
    }
    public static void main(String args[])
    {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int k = 3;
        int result[] = new int[arr.length - k + 1];
        PriorityQueue<pairs> pq = new PriorityQueue<>();

        //here pq size is the size of k(each window)
        for(int i = 0 ; i < k ;i++)
        {
            pq.add(new pairs(arr[i] , i));
        }

        //for 1st window
        result[0] = pq.peek().data;

        for(int i = k ; i < arr.length ; i++)
        {
            while(pq.size() > 0 && pq.peek().idx <= (i-k))
            {
                pq.remove();
            }
            pq.add(new pairs(arr[i],i));
            result[i-k+1] = pq.peek().data;
        }

        for(int i = 0 ; i< result.length ; i++)
        {
            System.out.print(result[i]+" ");
        }
        System.out.println();
    }
}
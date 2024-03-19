//we have to return the majority repeating element 
// nums = {2,3,4,3}; returns 3
//here majority element is 3
// time complexity is O(n^2)
import java.util.*;
class majorityelement
{
    public static int majority(int arr[])
    {
        int k = 0;
        int max = 0 ;
        //int count = 0;
        for(int i = 0 ; i < arr.length ; i++)
        {
           int count = 0;
            for(int j = 1 ;j< arr.length ;j++ )
            {
                if(arr[i] == arr[j])
                {
                    count ++;
                }
            }
         if (count > max )
        {
          max = count;
          k = arr[i];
        }
        }
       //System.out.println(max);
    return k;
    }
    public static void main(String args[])
    {
        int arr[] = {2,3,4,3};
        System.out.println(majority(arr));
    }
}
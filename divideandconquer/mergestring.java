import java.util.*;
class mergestring
{
    public static void merge(String arr[],int start,int mid,int end)
    {
        int i = start ;
        int  j = mid+1;
        int k = 0;
        String temp[] = new String[end-start+1];

         while(i<= mid && j<=end)
         {
            if(arr[i].compareTo(arr[j]) < 0)
            {
                temp[k] = arr[i];
                i++;
            }
            else
            {
            temp[k] = arr[j];
            j++;
            }
            k++;
        }
        while(i <= mid)
        {
            temp[k++] = arr[i++];
        }        
        while(j<= end)
        {
            temp[k++] = arr[j++];
        }
        for(k = 0 , i = start ; i <= end ; i++,k++)
        {
            arr[i] = temp[k];
        }
    }
    public static void mergesort(int start , int end , String arr[])
    {
        if (start >= end)
        {
            return;
        }
        int mid = (start + end) / 2;
        mergesort(start,mid,arr);
        mergesort(mid+1 , end ,arr);
        merge(arr,start,mid,end);
    }
public static void main(String args[])
{
    String arr[] = {"prashu" , "josh" , "ramya" , "shiva" , "ankitha" , "srihitha"};
    int start = 0 ;
    int end = arr.length-1;
    mergesort(start, end,arr);
    for (int i = 0 ; i < arr.length ; i++)
    {
        System.out.print(" "+arr[i]);
    }
}
}
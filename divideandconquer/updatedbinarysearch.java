//sorted and rotated array
// mid can be on line one or line 2 
//line one is 0 1 2 3 and line two is 4 5 6
import java.util.*;
class updatedbinarysearch
{
    public static int search(int arr[] , int tar ,int start , int end)
    {
        if(start >=end)
        {
            return -1;
        }
        int mid = start + (end-start)/2;
        
        if (arr[mid] == tar)
        {
            return mid;
        }
        // mid on line one

        if(arr[start] <= arr[mid])
        {
            // mid on left
            if(start <= tar && tar <= mid)
            {
                search(arr,tar,start, mid);
            }
            //tar on right
            else
            {
                search(arr,tar,mid + 1, end);
            }
        }
        else 
        {
            if(arr[mid+1] <= tar && tar <= arr[end])
            {
                search(arr,tar,mid+1,end);
            }
            else
            {
                search(arr,tar,start,mid);
            }    
        }
        return -1; 
    }
    public static void main(String args[])
    {
        int arr[] = {4,5,6,0,1,2,3};  //sorted and rotated array
        int tar = 0; //index = 3
        int start = 0 ;
        int end = arr.length - 1;
        System.out.println(search(arr , tar , start , end));    
    }
}
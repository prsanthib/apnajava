// in an array find the occurence(index)of the given element
import java.util.*;
class occurenceofkey
{
    public static void occurence(int arr[],int key,int index)
    {
        if(index == arr.length-1)
        return;
        if(arr[index] == key)
        {
            System.out.print(index+" ");
        }
        occurence(arr,key,index+1);
    }

    public static void main(String args[])
    {
       int arr[] = {1,2,3,6,3,2,6,6,4};
       int key = 6;
       occurence(arr,key,0);
    }
}
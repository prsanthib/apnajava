//find next highest of an element and insert the
//next highest value at the position of the element
import java.util.*;
class nexthighest
{
    public static void next(int arr[] , int highest[])
    {
        Stack<Integer> s = new Stack<>();
        
        for(int i = arr.length-1 ; i >= 0 ; i--)
        {
            while(!s.isEmpty() && arr[s.peek()] < arr[i])
            {
                s.pop();
            }
            if(s.isEmpty())
            {
                highest[i] = -1;
            } else {
                highest[i] = arr[s.peek()];
            }
            s.push(i);
        }
    }
    public static void main(String args[])
    {
        int arr[] = {5,4,7,2,8,1,9,10};
        int highest[] = new int[arr.length];
        next(arr,highest);
        for(int i = 0 ; i< arr.length ; i++)
        {
            System.out.print(" "+highest[i]);
        }
        System.out.println();
    }
}
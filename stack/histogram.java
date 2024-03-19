//return rectangle with greatest area
/*import java.util.*;
class histogram
{
    public static void sucks(int[] arr)
    {
        Stack<Integer> s = new Stack<>();
        int[] nsl = new int[arr.length]; //next smaller left
        int[] nsr = new int[arr.length];
        int maxArea = 0;
        //next smaller left
         for(int i = 0 ; i < arr.length ; i++)
        {
            while(!s.isEmpty() && arr[i] <= arr[s.peek()])
            {
                s.pop();
            }
            if(s.isEmpty())
            {
                nsl[i] = -1;
            }
            else
            {
                nsl[i] = s.peek();
            }
            s.push(i);
        }
        //next smaller right
        s = new Stack<>();
        for(int i = arr.length-1 ; i >= 0 ; i--)
        {
            while(!s.isEmpty() && arr[i] >= arr[s.peek()])
            {
                s.pop();
            }
            if(s.isEmpty())
            {
                nsr[i] = arr.length;
            }
            else
            {
                nsr[i] = s.peek();
            }
            s.push(i);
        }
        
        for(int i = 0 ; i < arr.length ; i++)
        {
            int height = arr[i];
            int width = nsr[i]-nsl[i]-1; 
            int currarea = height*width;
            maxArea = Math.max(currarea , maxArea);
        }

        System.out.println("max area is "+maxArea);
    }
    public static void main(String args[])
    {
        int []arr = {2,1,5,6,2,3};
        sucks(arr);
    }
}
*/

import java.util.*;
class histogram
{
    public static void hist(int arr[])
    {
        int nsl[] = new int[arr.length];
        int nsr[] = new int[arr.length];
        int maxArea = 0 ;
        Stack<Integer> s = new Stack<>();
        //next smaller right
        for(int i = arr.length-1 ; i >= 0  ; i--)
        {
            while(!s.isEmpty() && arr[s.peek()] >= arr[i])
            {
                s.pop();
            }
            if(s.isEmpty())
            {
                nsr[i] = arr.length;
            } else {
                nsr[i] = s.peek();
            }
        s.push(i);
        }
        //next smaller left
        s = new Stack<>();
        for(int i = 0; i< arr.length ; i++)
        {
            while(!s.isEmpty() && arr[s.peek()] >= arr[i])
            {
                s.pop();
            }
            if(s.isEmpty())
            {
                nsl[i] = -1;
            }else{
                nsl[i] = s.peek();
            }
        s.push(i);
        }
        //max area
        
        for(int i = 0 ; i < arr.length ; i++)
        {
            int height = arr[i];
            int width = nsr[i] - nsl[i] -1;
            int currArea = height*width;
            maxArea = Math.max(maxArea , currArea);
        }
        System.out.println(maxArea+" max area");
    }
    public static void main(String args[])
    {
        int arr[] = {2,1,5,6,2,3};
        hist(arr);
    }
}
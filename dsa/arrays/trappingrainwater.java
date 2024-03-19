/*import java.util.*;
class trappingrainwater
{
    public static int trapping(int[] a,int width)
    {
        int water = 0;
        if(a.length == 1 || a.length == 2)
        return 0;

        for(int i = 0 ; i < a.length ; i++)
        {
           /* int curr = i;
            int leftmax = a[i];
            int rightmax = a[i];
            //finding left max
            for(int j = 0 ; j < curr ; j++)
            {
                leftmax = Math.max(leftmax,a[j]);
            }
            //finding right max
            for(int k = curr+1 ; k < a.length ; k++)
            {
                rightmax = Math.max(rightmax,a[k]);
            }
           
            //water level is minumum of both
            int waterlevel = Math.min(leftmax,rightmax);
            //water stored is waterlevel - height *width
             water += width*(waterlevel - a[i]);

        }
        return water;
    }
    public static void main(String args[])
    {
        int[] arr = {5,1,3,2,7,9,4,10};
        int width = 1;
        System.out.println("traped water is "+trapping(arr,width));
    }
}


here the time complexity is O(n^2)
so optimised code is

int leftmax[0] = a[0];
for(int i = 1 ; i< a.length ; i++)
{
    leftmax[i] = Math.max(leftmax[i-1],a[i]);
} 
int rightmax[n-1] = a[n-1];
for(int i = n-2 ; i>0 ; i++)
{
    rightmax[i] = Math.max(a[i],rightmax[i+1]);
}
*/
class trappingrainwater
{
    public static void main(String args[])
    {
        int[] arr = {5,1,3,2,7,9,4,10};
        //leftmax
        int n = arr.length;
        int width = 1;
        int leftmax[] = new int[n];
        leftmax[0] = arr[0];
        if(n ==  1|| n == 2)
        {
            System.out.println("no water is stored");
        }
        for(int i = 1 ; i < n ; i++)
        {
            leftmax[i] = Math.max(leftmax[i-1],arr[i]);
        }
        int[] rightmax = new int[n];
        rightmax[n-1] = arr[n-1];
        for(int i = n-2 ; i >= 0 ; i--)
        {
            rightmax[i] = Math.max(rightmax[i+1] , arr[i]);
        }
        
        int waterlevel= 0;
        int water = 0;
        for(int i = 0 ; i < n ; i++)
        {
            waterlevel = Math.min(leftmax[i] , rightmax[i]);
            water += waterlevel - arr[i];
        }

        System.out.println("trapped water is "+water);

    }
}

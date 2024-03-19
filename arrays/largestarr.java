import java.util.*;
class largestarr
{
    public static void larsmall(int n,int a[] )
    {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0 ;i<n;i++)
        {
            if (a[i]>largest)
            {
                largest = a[i];
            }
            if (a[i]<smallest)
            {
                smallest = a[i];
            }
        }
        System.out.println("LARGEST ELEMENT IS "+largest);
        System.out.println("SMALEST ELEMENT IS "+smallest);
    }
    public static void main (String args[])
    {
        
        Scanner sc= new Scanner(System.in);
        System.out.println("ENTER NO OF ELEMENTS OF AN ARRAY");
        int num = sc.nextInt();
        int arr[] = new int[num];
        System.out.println("ENTER ELEMENTS OF THE ARRAY");
        for (int i = 0; i<num ; i++)
        {
            arr[i] = sc.nextInt();
        }
        
        larsmall(num,arr);
        
    }
}
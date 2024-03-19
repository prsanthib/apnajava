import java.util.*;
class binarysearch
{
    public static int bin(int a[],int n,int key)
    {
        int start = 0, end = a.length-1;
        while(start<=end)
        {
            int mid = (start+end)/2;
            if (a[mid] == key)
            {
                return mid;
            }
            else if (key > a[mid])
            {
                start = mid + 1;
            }
            else 
            {
                end = mid -1;
            }
        }
        return -1;

    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER NO OF ELEMENTS OF AN ARRAY");
        int num = sc.nextInt();
        int arr[] = new int[num];
        System.out.println("ENTER ELEMENTS OF THE ARRAY");
        for (int i = 0; i<num ; i++)
        {
            arr[i] = sc.nextInt();
        } 
        Arrays.sort(arr);
        System.out.println("ENTER THE ELEMENT TO BE SEARCHED");
        int key = sc.nextInt();
        int k = bin(arr,num,key);
        if (k == -1)
        {
            System.out.println("ELEMENT NOT FOUND");
        } else {
            System.out.println("ELEMENT FOUND AT INDEX "+k);
        }

        
    }
}
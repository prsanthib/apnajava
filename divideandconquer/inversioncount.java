//how far the array is from being sorted
//n = {2,4,1,3,5} : (2,1),(4,1),(4,3)
//it can be done by using insertion sort 
/*import java.util.*;
class inversioncount
{
    public static int inversion(int arr[])
    {
        int count = 0;
        for(int i = 1; i< arr.length ; i++)
        {
            int prev = i-1;
            int curr = arr[i];
            while(prev >= 0 && curr < arr[prev])
            {
                arr[prev+1] = arr[prev];
                prev--;
                count++;
            }
            arr[prev+1] = curr;
        }
        return count;
    }
       
    public static void main(String args[])
    {
        int arr[] = {2,4,1,3,5};
        System.out.println(inversion(arr));
    }
}*/
/* both are same
class mergesort
{
    public static void merge(int arr[],int start,int end,int mid)
    {
        //0 to 2 and 3 to 5 end = 5 start = 0 e-s = 5 
        int temp[] = new int[end - start+1];
        int i = start;
        int j = mid+1;
        int k = 0;
        while(i <= mid && j <= end)
        {
            if(arr[i] < arr[j])
            {
            temp[k] = arr[i];
            i++;
            }
            else{ 
            temp[k] = arr[j];
            j++;
            }
            k++;
        }
        while(i<=mid)
        {
            temp[k] = arr[i];
            i++;
            k++;
        }
        while(j<=end)
        {
            temp[k] = arr[j];
            j++;
            k++;
        }
    //copying the temp to original array
    for(k = 0 , i = start ; k<temp.length ; k++,i++)
    {
        arr[i] = temp[k];
    }
}
    public static void mergesort(int arr[], int start , int end)
    {
        if(start >= end)
        return;
        int mid = start+(end - start)/2;
        mergesort(arr,start,mid);
        mergesort(arr,mid+1,end);
        merge(arr,start,end,mid);
    }
    public static void main(String args[])
    {
        int arr[] = {6,3,7,2,9,1};
        int start = 0;
        int end = arr.length-1;
        mergesort(arr,start,end);
        for(int i = 0 ; i< arr.length ; i++)
        {
            System.out.print(" "+arr[i]);
        }
        System.out.println();
    }
}*/
import java.util.*;
class mergesort
{
    public static int merge(int arr[],int start,int mid,int end , int invco)
    {
        int temp[] = new int[end-start+1];
        int i= start;
        int j = mid+1;
        int k = 0;
        while(i<=mid && j<=end)
        {
            if(arr[i]<arr[j])
            {
            temp[k] = arr[i];
            i++;
            }

            else{
                invco += (mid - i); 
            temp[k] = arr[j];
            j++;
            }
            k++;
        }
        while (i<=mid)
        {
            temp[k++] = arr[i++];
        }
        while(j<=end)
        {
            temp[k++] = arr[i++];
        }

        for(k = 0 ,i = start;k<temp.length;k++,i++)
        {
            arr[i] = temp[k];
        }
        return invco;
    }
    public static int mergesort(int arr[],int start,int end)
    {
        int invco = 0;
        if(start > end)
        {
        int mid = (start+end)/2;
        invco = mergesort(arr,start,mid);
        invco += mergesort(arr,mid+1,end);
        invco += merge(arr,start,mid,end,invco);
        }
        return invco;
    }
    public static void main(String args[])
    {
        int arr[] = {1,2,3,4,5};
        int start = 0;
        int end = arr.length-1;
        System.out.println(mergesort(arr,start,end));

        for (int i = 0 ; i < arr.length ; i++)
        {
            System.out.print(" "+arr[i]);
        }
        System.out.println();
    }
}
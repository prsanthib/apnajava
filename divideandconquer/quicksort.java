// worst case occurs if pivot element is least or greatest 
// O(n^2)
class quicksort
{
    public static int quick(int arr[],int start,int end)
    {
        int pivot = arr[end];
        int i = start-1;
        for(int j = start; j<end ; j++)
        {
            if(arr[j]<=pivot){
            i++;
            //swap
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
            }         
        }
        i++;
        int temp = pivot;
            arr[end]= arr[i];
            arr[i] = temp;
    return i;
    }
    public static void quicksort(int arr[],int start, int end)
    {
        if(start>=end)
        return;
        int part = quick(arr,start,end);
        quicksort(arr,part+1,end);
        quicksort(arr,start,part-1);

    }
    public static void main(String args[])
    {
        int arr[] = {5,4,3,2,1};
        quicksort(arr,0,arr.length-1);

        for (int i = 0 ; i< arr.length ; i++)
        {
            System.out.print(" "+arr[i]);
        }
    }
}

/*class quicksort
{
    public static int quick(int arr[],int start,int end)
    {
        int pivot = arr[end];
        int k = start-1; // if cond satisfies then it is incremented and swapped
        for(int i = start ; i < end ; i++)
        {
            if(arr[i] <= pivot)
            {
                k++;
                int temp = arr[k];
                arr[k] = arr[i];
                arr[i] = temp;
            }
            k++;
            int temp = pivot;
            arr[end] = arr[k];
            arr[k] = temp;
        }
        return k;
    }
    public static void quicksort(int arr[], int start , int end)
    {
        if(start>=end)
        return;
    
        int lock = quick(arr,start,end);
        quicksort(arr,lock+1,end);
        quicksort(arr,start,lock-1);
    }
    public static void main(String args[])
    {
        int arr[] = {5,4,3,2,1};
        quicksort(arr,0,arr.length-1);

        for(int i = 0 ; i < arr.length ; i++)
        {
            System.out.print(" "+arr[i]);
        }
    }
}*/
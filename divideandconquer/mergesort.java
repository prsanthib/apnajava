class mergesort
{
    public static void merge(int arr[],int start,int mid,int end)
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
    }
    public static void mergesort(int arr[],int start,int end)
    {
        if(start>=end)
        return;
        int mid = (start+end)/2;
        mergesort(arr,start,mid);
        mergesort(arr,mid+1,end);
        merge(arr,start,mid,end);
    }
    public static void main(String args[])
    {
        int arr[] = {5,4,3,2,1};
        int start = 0;
        int end = arr.length-1;
        mergesort(arr,start,end);

        for (int i = 0 ; i < arr.length ; i++)
        {
            System.out.print(" "+arr[i]);
        }
        System.out.println();
    }
}
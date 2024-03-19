class optimisedbubblesort
{
    public static void bubble(int arr[])
    {
        boolean swap = false;
        for(int i = 0 ; i< arr.length ; i++)
        {
            for(int j = 0 ; j < arr.length-i-1 ; j++)
            {
                if(arr[j+1] < arr[j]) //ascending order
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap = true;
                }
            }
            if (swap == false)
            break;
        }
    }
    public static void main(String args[])
    {
        int arr[] = {1,2,3,4,5};
        bubble (arr);

        for (int i = 0 ; i<arr.length ; i++)
        {
            System.out.print(" "+arr[i]);
        }
        System.out.println();
    }
}
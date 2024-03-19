class duplicates
{
    public static void main(String args[])
    {
        //int []arr = {1,2,3,4,4,5,4,5,6,2,7,4};
          int arr[] = {1,2,3,4,5,6,7};
        //duplicate elements;
        int flag = 0;
        for(int i = 0 ; i < arr.length ; i++)
        {
            for(int j = i+1 ; j<arr.length ; j++)
            {
                if(arr[i] == arr[j])
                {
                    flag = 1;
                    break;
                }
            }

        }
        if(flag == 1)
        {
            System.out.println("duplicates found");
        }
        else
        {
            System.out.println("duplicates not found");
        }
    }
}
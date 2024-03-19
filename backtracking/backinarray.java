class backinarray
{
    public static void changearray(int arr[] , int i , int value)
    {
        //base case
        if(i == arr.length-1)
        {
            printarray(arr);
            return;
        }
        //recursion
        arr[i] = value;
        changearray(arr,i+1,value+1);
        arr[i] = arr[i]-2;//backtracking step
    }
    public static void printarray(int arr[])
    {
        for(int i = 0 ; i< arr.length ; i++)
        {
            System.out.print(" "+arr[i]);
        }
        System.out.println();
    }
    public static void main(String args[])
    {
        int arr[] = new int[5];
        changearray(arr,0,1); // array,index,vallule
        printarray(arr);
    }
}

//here at base condition the arrar is {1,2,3,4,5} and after backtracking the array is {-1,0,1,2,3}
//this is what backtracking is.
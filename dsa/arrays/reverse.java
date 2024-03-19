class reverse
{
    public static void main(String args[])
    {
        int a[] = {4,3,2,5,3,2,4};
        int start = 0;
        int end = a.length -1;
            while(start < end)
            {
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end --;
            }
            System.out.println("reverse of the array is");
            for(int i = 0; i<a.length ; i++)
            {
                System.out.print(" "+a[i]);
            }

        }
}
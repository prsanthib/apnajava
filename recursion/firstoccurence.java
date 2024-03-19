class firstoccurence
{
    public static int first(int a[], int key, int i)
    {
        if(i==a.length)
        return -1;
        if(a[i] == key)         //we compared first
        return i;
        return first(a,key,i+1); // then called fun
    }
    public static void main(String[] args)
    {
        int a[] = {1,2,3,4,5,6,2,3,4};
        int key = 3;
        System.out.println(first(a,key,0));
    }
}
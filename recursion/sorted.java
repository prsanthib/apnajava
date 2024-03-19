class sorted
{
    public static boolean sort(int a[] , int n)
    {
        if( n == a.length-1)
        return true;
        if (a[n]>a[n+1])
        return false;
        return sort(a,n+1);
    }
    public static void main(String args[])
    {
        int a[] = {1,2,3,4,5,6};
        System.out.println(sort(a,0));
    }
}
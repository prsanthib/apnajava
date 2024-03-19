/*class lastoccurence
{
    public static int first(int a[], int key, int i)
    {
        if(i == 0)
        return -1;
        if(a[i] == key)
        return i;
        return first(a,key,i-1);
    }
    public static void main(String[] args)
    {
        int a[] = {1,2,3,4,5,6,2,3,4};
        int key = 3;
        System.out.println(first(a,key,a.length-1));
    }
}*/

class lastoccurence
{
    public static int last(int a[], int key, int i)
    {
        if(i==a.length)
        return -1;
        int isfound = last(a,key,i+1); // we first called
        if(isfound == -1 && a[i] == key)
        {
            return i;
        }
        return isfound;
    }
    public static void main(String[] args)
    {
        int a[] = {1,2,3,4,5,6,2,3,4};
        int key = 3;
        System.out.println(last(a,key,0));
    }
}
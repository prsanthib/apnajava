class nonrepeatingelement
{
    public static int non(int a[])
    {
        for(int i = 0 ; i< a.length ; i++)
        {
            int k = a[i];
            for(int j = 0 ; j< a.length ; j++)
            {
            if((k & a[j]) != )
            {
                return k;
            }
            }
        }
    }
    public static void main(String args[])
    {
        int a[] = {1,1,1,2,2,2,3,4,5,5,6};
        non(a);
    }
}
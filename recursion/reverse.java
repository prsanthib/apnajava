class reverse
{
    public static void pri(int n)
    {
        if (n == 1)
        {
            System.out.print(""+n);
            return;
        }
        pri(n-1);
        System.out.print(" "+n);
        
    }
    public static void main(String args[])
    {
        pri(5);
    }
}
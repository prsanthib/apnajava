class numbers
{
    public static void printnum(int n)
    {
        if (n == 0)
        {
            return;
        }
        System.out.print(" "+n);
        printnum(n-1);
    }
    public static void main(String args[])
    {
        printnum(10);
    }
}
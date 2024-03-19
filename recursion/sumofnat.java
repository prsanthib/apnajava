class sumofnat
{
    public static int sum(int n)
    {
        int s;
        if(n == 0)
        return 0;
        s = n + sum(n-1);
       return s;
    }
    public static void main(String args[])
    {
         System.out.println(""+sum(5));                                      
    }
}
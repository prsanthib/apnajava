class factorial
{
    public static int fact(int x)
    {
        if(x == 0)
        return 1;
        //int fnm1 = fact(x-1);
        int fn = x*fact(x-1);
        return fn;
    }
    public static void main(String args[])
    {
       System.out.println(""+fact(5));
    }
}
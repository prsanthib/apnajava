class powern
{
    public static int power(int a , int b)
    {
        if(b == 0)
        return 1;
        //int p = a*a;
        //power(p,b-1);
        //return p;
        return a*power(a,b-1);
    }
    public static void main(String args[])
    {
        System.out.println(power(10,2));
    }
}
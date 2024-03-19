class countsetbits
{
    public static int count(int n)
    {
        int countt = 0;
        while(n!=0)
        {
        if((n&1)== 1)
        countt ++;
        n = n>>1;
        }
        return countt;

    }
    public static void main(String args[])
    {
        System.out.println(""+count(7));
    }
}
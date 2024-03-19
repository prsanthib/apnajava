//position of only set bit
class onlysetbit
{
    public static void position(int n)
    {
        int count = 0;
        while((n & 1) != 1)
        {
            count++;
            n = n>>1;
        }
        System.out.println("POSITION OF ONLY SET BIT IS "+count);
    }
    public static void main(String args[])
    {
        position(16);
        //16 = 10000
        //     43210 
    }
}
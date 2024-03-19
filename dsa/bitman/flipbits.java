class flipbits
{
    public static int countflipbits(int a , int b)
    {
        int count = 0;
        while(a != 0 && b != 0)
        {
            int k = a&1;
            int l = b&1;
            if(k != l)
            {
                count++;
            }
           a = a>>1;
           b = b>>1;
        }
        return count;
    }
    public static void main(String args[])
    {
        int a = 8;
        int b = 7;
        System.out.println("no of bits needed to be flipped to convert "+a+" to "+b+" are "+countflipbits(a,b));
    }
}
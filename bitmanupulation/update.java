import java.util.*;
class update
{
    public static int clear(int n , int i)
    {
        int bitmask = 1<<i;
        return n & ~(bitmask);
    }
    public static int set(int n , int  i)
    {
        int bitmask = 1<<i;
        return n | bitmask ;
    }
    public static int updatee(int n , int i, int newbit)
    {
        if(newbit == 1)
        {
            return set(n,i);
        }
        return clear(n,i);
    }
    public static void main(String args[])
    {
            int n = 5; //101
            int i = 0 ;
            int newbit = 0;
            System.out.println(updatee(n,i,newbit)+"");

    }
}
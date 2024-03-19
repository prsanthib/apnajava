import java.util.*;
class clear
{
    public static int clearr(int n , int i)
    {
        int bitmask  = 1 << i;//~(0010) & 101
        return n&~(bitmask);
    }
    public static void main(String args[])
    {
        int n = 5;//101
        int i = 1;
        System.out.println(clearr(n,i)+"");
    }
}
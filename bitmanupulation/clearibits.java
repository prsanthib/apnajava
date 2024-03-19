import java.util.*;
class clearibits
{
    public static int ib(int n , int i)
    {
        int bitmask = (~0)<<i; //~0 = 11111111
        return bitmask & n;
    }
    public static void main(String args[])
    {
        int n = 15;//01111
        int i = 2; 
        System.out.println(ib(n,i)+"");
    }
}
import java.util.*;
class clearrange
{
    public static int clear(int n , int i , int j)
    {
        int a = ((~0)<<(j+1));//00001111
        int b = (1<<i)-1;
        int bitmask = a|b;
        return n & bitmask; 
    }
    public static void main(String args[])
    {
        int n =15;//00001111
        int i = 2;
        int j = 5;
        System.out.println(clear(n,i,j)+"");
    }
}
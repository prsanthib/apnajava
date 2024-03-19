import java.util.*;
class countset
{
    public static int set(int n)
    {
        int count = 0;
        while(n>0)
        {
            if((n&1)!= 0)
            count++;
            n = n>>1;
        }
        return count;
    }
    public static void main(String args[])
    {
        int n = 15;//01111
        System.out.println(set(n)+"");
    }
}
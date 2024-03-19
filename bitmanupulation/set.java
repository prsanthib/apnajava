import java.util.*;
class set
{
    public static int sett(int n , int i)
    {
        int bitmask = 1<<i;
        n = n | bitmask;
        return n;
    }
    public static void main(String args[])
    {
        
        int n = 5; // 101
        int i = 1;
        int k = sett(n,i);
        System.out.println(""+n);
    
    }
}
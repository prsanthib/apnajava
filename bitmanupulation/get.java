import java.util.*;
class get
{
    public static int gett(int n , int i)
    {
        int bitmask = 1<<i;
        int result = n & bitmask;
        if(result == 1)
        {
            return 1;
        }
        return 0;
    }
    public static void main(String args[])
    {
        
        int n = 5; // 101
        int i = 1;
        int k = gett(n,i);
        System.out.println(""+k);
    
    }
}
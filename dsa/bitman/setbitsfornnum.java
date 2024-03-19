import java.util.*;
class setbitsfornnum
{
    public static int count(int n)
    {
        int totalcount = 0;
        for(int i = 1 ; i < n ; i++)
        {
            int ck = 0;
            int curr = i;
            while(curr != 0)
            {
                int bitmask = curr&1;
                if(bitmask == 1)
                {
                    ck++;
                }
               curr =  curr>>1;
            }
            totalcount += ck;
        }
        return totalcount;
    }
    public static void main(String args[])
    {
        //count setbits from 1 to n numbers
        int n = 10;
        System.out.println("no of set bits upto "+n+" is "+count(n));
    }
}
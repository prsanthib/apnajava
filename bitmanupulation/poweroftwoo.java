import java.util.*;
class poweroftwoo
{
    public static boolean poweroftwo(int n)
    {
        if(((n)&(n-1)) == 0)
        return true;
        return false;
    }
    public static void main(String args[])
    {
        int n = 25;
        System.out.println(poweroftwo(n)+"");
    }
}
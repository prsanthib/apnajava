import java.util.*;
class climbingstairs
{
    public static int climb(int n)
    {
        if(n == 0 )
        {
            return 1;
        }
        if(n<0)
        {
            return 0;
        }

        return climb(n-1)+climb(n-2);
    }
    public static int climbmem(int n , int f[])
    {
        if(n == 0)
        return 1;

        if(n<0)
        return 0;

        if(f[n] != -1)
        {
            return f[n];
        }

        f[n] = climbmem(n-1,f)+climbmem(n-2,f);

        return f[n];
    }

    public static int climbtab(int n)
    {
        int f[] = new int[n+1];
        f[0] = 1;

        for(int i = 1 ; i<=n ; i++)
        {
            if(i == 1)
            {
                f[n] = climbtab(n-1);
            } else{
            f[n] = climbtab(n-1)+climbtab(n-2);
            }
        }
        return f[n];
    }
    public static void main(String args[])
    {
        int n = 5;
        System.out.println(climb(n));

        //memoization
        int f[] = new int[n+1];
        Arrays.fill(f,-1);
        System.out.println(climbmem(n,f));

        //tabulation
        System.out.println(climbtab(n));
    }
}
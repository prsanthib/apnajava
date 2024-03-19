/*class fibonacci
{
    public static int fib(int n , int f[])
    {
        if(n == 0 || n == 1)
        {
            return n;
        }

        if(f[n] != 0)
        {
            return f[n];
        }

        f[n] = fib(n-1 , f)+fib(n-2,f);
        return f[n];
    }
    public static void main(String args[])
    {
        int n = 6 ;
        int f[] = new int [n+1];
        System.out.println(fib(n , f));
    }
}
*/

class fibonacci
{
    //recursion
    public static int fib(int n)
    {
        if(n == 0 || n == 1)
        {
            return n;
        }

        return fib(n-1)+fib(n-2);
    }

    //memoization 
    //storing the solution of sub problem and using whenever required
    public static int fibmem(int n , int[] f)
    {
        if(n == 0 || n ==1)
        {
            return n;
        }

        if(f[n] != 0)
        {
            return f[n];
        }

        f[n] = fibmem(n-1 , f) + fibmem(n-2 , f);

        return f[n];
    }

    //tabulation

    public static int fibtab(int n)
    {
        int f[] = new int[n+1];
        f[0] = 0;
        f[1] = 1;

        for(int i = 2 ; i<=n ; i++)
        {
            f[i] = f[i-1]+f[i-2];
        }

        return f[n];
    }
    public static void main(String args[])
    {
        int n = 5;
        //recursion
        System.out.println(fib(n));

        //memoization
        int f[] = new int[n+1];
        System.out.println(fibmem(n,f));

        //tabulation
        System.out.println(fibtab(n));
    }
}
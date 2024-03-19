import java.util.*;
class knapsack
{

    public static int tab(int val[],int wt[],int W ,int n)
    {
        int f[] = new int[n+1];
        int max;

        if(W == 0 || n == 0)
        {
            f[n] == 0;
        } 

        for(int i = n-1 ; i>= 0 ;i--)
        {
        if(wt[i] <= W) // valid
        {
            //include
            int ans1 = val[i]+
            //exclude
            int ans2 = tab(val,wt,W,n-1);

            max = Math.max(ans1,ans2);
        }
        else
        {
            max = tab(val,wt,W,n-1);
        }

        f[n-1] = max;
        }
        return f[n-1];
    }
        
    public static int mem(int val[],int wt[],int W ,int n,int f[])
    {
        if(W == 0 || n == 0)
        {
            return 0;
        }

        if(f[n-1] != 0)
        {
            return f[n-1];
        } 

        if(wt[n-1] <= W) // valid
        {
            //include
            int ans1 = val[n-1]+mem(val,wt,W-wt[n-1],n-1,f);
            //exclude
            int ans2 = mem(val,wt,W,n-1,f);

            f[n-1] = Math.max(ans1,ans2);
        }
        else
        {
            f[n-1] = mem(val,wt,W,n-1,f);
        }

        return f[n-1];
    }
    public static int rec(int val[],int wt[],int W ,int n)
    {
        int max;

        if(W == 0 || n == 0)
        {
            return 0;
        }

        if(wt[n-1] <= W) // valid
        {
            //include
            int ans1 = val[n-1]+rec(val,wt,W-wt[n-1],n-1);
            //exclude
            int ans2 = rec(val,wt,W,n-1);

            max = Math.max(ans1,ans2);
        }
        else
        {
            max = rec(val,wt,W,n-1);
        }

        return max;
    }
    public static void main(String args[])
    {
        int val[] = {15,14,10,45,30};
        int wt[] = {2,5,1,3,4};
        int W = 7;
        System.out.println("max is "+rec(val,wt,W,val.length));

        //memoization
        int f[] = new int[wt.length+1];
        System.out.println("max is "+mem(val,wt,W,val.length,f));

        //tabulation
         System.out.println("max is "+tab(val,wt,W,val.length));

    }
}
// we can go either right or down to reach the last cell
// so for right i+1 and for down j+1
class gridways
{
    public static int ways(int i , int j , int m , int n)
    { 
        //we have two base cases
        if(i == m-1 && j == n-1)
        {
            return 1;
        }
       else if( i == m || j == n)
        {
            return 0;
        }
        
        int w1 = ways(i+1,j,m,n);
        int w2 = ways(i,j+1,m,n);
        return w1+w2;
    }
    public static void main(String args[])
    {
        int m = 3;
        int n = 3;
        int arr[][] = new int[m][n];
       System.out.println(""+ways(0,0,m,n));
    }
}
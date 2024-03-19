import java.util.Scanner;
class trappedRainwater
{
    public static int amount(int a[],int n)
    {
        //left maximum
        int leftmax[] = new int[n]; 
        leftmax[0] = a[0];
        for (int i = 1 ; i<n ; i++)
        {
            leftmax[i] = Math.max(a[i],leftmax[i-1]);  
        }
        //right maximum
        int rightmax[] = new int[n];
        rightmax[n-1] = a[n-1];
        for (int i = n-2 ; i>=0 ; i--)
        {
            rightmax[i] = Math.max(a[i],rightmax[i+1]);
        }
        int trappedwater = 0;
        //water level is min of left and right maximum
        for (int i = 0 ; i<n ; i++){
        
        int waterlevel = Math.min(leftmax[i],rightmax[i]);
        
        //trapped water is water level - current blockheight
        
        trappedwater += (waterlevel - a[i]);
        }
        return trappedwater;
    
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER NO OF ELEMENTS OF ARRAY");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("ENTER THE ELEMENTS OF ARRAY");
        for (int i = 0;i<n ; i++)
        {
            a[i] = sc.nextInt();
        }
        int k = amount(a,n);
        System.out.println("total trapped water is " +k);
    }
}
// find best day to buy or sell the stock 
import java.util.Scanner;
class buyorsellstock
{
    public static int buyandsellstock(int a[], int n)
    {
        int buyingprice = Integer.MAX_VALUE;
        int maxprofit = Integer.MIN_VALUE;
        
        for (int i = 0 ; i<n ; i++)
        {
            int sellingprice = a[i]; 
            if (buyingprice < sellingprice){
                int profit = sellingprice - buyingprice;
               /* if (profit > maxprofit)
                {
                    maxprofit = profit;
                }*/
                maxprofit = Math.max(maxprofit,profit);//we can also use this insted of if statement
            }
            else
            {
                buyingprice = sellingprice;
            }
        }
        return maxprofit;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER NO OF DAYS");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("ENTER THE PRICES OF STOCK ");
        for (int i = 0 ; i< n ; i++)
        {
            a[i] = sc.nextInt();
        }
        int k = buyandsellstock(a,n);
        System.out.println("MAX PROFIT IS " +k);
    }
}
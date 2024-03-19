import java.util.*;
class search
{
    /*public static boolean sea(int a[][],int key)
    {
        int row = 0;
        int col = a[0].length-1;
        while(row < a.length && col>=0)
        {
            if (a[row][col] == key)
                {
                   System.out.println("key found at ("+row+","+col+")");
                   return true;
                }
            else if (key > a[row][col])
                {
                    row++;
                }
            else 
                {   
                    col--;
                }
        }
        return false;
    }*/
    public boolean sea1(int a[][],int key)
    {
        int col= 0;
        int row = a.length-1;
        while(col < a[0].length && row >=0)
        {
            if (a[row][col] == key)
                {
                   System.out.println("key found at ("+row+","+col+")");
                   return true;
                }
            else if (key > a[row][col])
                {
                    col++;
                }
            else 
                {   
                    row--;
                }
        }
        return false;
    }
    
    public static void main(String args[])
    {
        search p = new search();
        Scanner sc = new Scanner(System.in);
        int[][] a = {{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        //System.out.println("enter the key");
        //int key = sc.nextInt();
        int key = 33;
        //sea(a,key);
        p.sea1(a,key);
    }
}
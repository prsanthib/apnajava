import java.util.*;
class spiral
{
    public static void sp(int a[][])
    {
        int startrow = 0;
        int endrow = a.length-1;
        int startcol = 0 ;
        int endcol = a[0].length-1;
        while(startrow <= endrow && startcol <= endcol)
        {
            //top
            for(int j = startcol ; j <= endcol ; j++ )
            {
                System.out.print(a[startrow][j]+" ");
            }
            //right
            for (int i = startrow + 1 ; i <= endrow ; i++)
            {
                System.out.print(a[i][endcol]+" ");
            }
            //bottom
            for (int j = endcol-1 ; j >= startcol ; j--)
            {
                System.out.print(a[endrow][j]+" ");
                if(startrow == endrow)
                {
                    break;//already printed in top
                }
            }
            //left
            for(int i = endrow - 1 ; i >= startrow + 1;i--)
            {
                System.out.print(a[i][startcol]+" ");
                if (startcol == endcol)
                {
                    break;//already printed in the right
                }
            }
            startrow++;
            startcol++;
            endrow--;
            endcol--;
            
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER NO OF ROW AND COLUMNS");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] a = new int[m][n];
        for(int i = 0 ; i < m ; i++)
        {
            for (int j = 0 ; j< n ; j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
        //spiral x = new spiral();
        sp(a);

    }
}
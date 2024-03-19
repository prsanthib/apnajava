import java.util.*;
class transpose
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NO OF ROWS AND COLUMNS");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int [][]a = new int[m][n];
        for (int i = 0 ; i<m ; i++)
        {
            for (int j = 0 ; j< n ; j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("THE MATRIX IS");
        for (int i = 0 ; i<m ; i++)
        {
            for (int j = 0 ; j< n ; j++)
            {
                System.out.print(" "+a[i][j]);
            }
            System.out.println();
        }
        //transpose
       /* int b[][] = new int[n][m];
        for(int i = 0 ; i< n; i++)
        {
            for (int j = 0 ; j< m ; j++)
            {
                b[i][j] = a[j][i];
            }
        }*/
        System.out.println("THE TRANSPOSE OF THE MATRIX IS");
        for (int i = 0 ; i<m; i++)
        {
            for (int j = 0 ; j< n ; j++)
            {
                System.out.print(" "+a[j][i]);//+b[i][j]
            }
            System.out.println();
        }
    }
}
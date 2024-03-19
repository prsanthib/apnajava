import java.util.*;
class dia //sum of principal diagonal and secondary diagonal
{
    public int di(int a[][])
    {   int sum = 0;
    /*  it has time complexity of O(n^2)
        for(int i = 0 ; i<a.length;i++)
        {
            for (int j = 0 ; j<a.length; j++)
            {
                if(i == j)
                {
                    sum += a[i][j];
                }
                else if(i+j = n-1)
                {
                    sum += a[i][j];
                }
                else
                {
                    return;
                }
            }
        }return sum;
    */
        //it is the optimised way with order O(1)
        for (int i = 0 ; i <= a.length-1 ; i++)
        {
            
            //sum of principal diagonal
            sum += a[i][i];
            //sum of secondary diagonal
            if(i != a.length-1-i)
            sum += a[i][a.length-1-i];

        }
        System.out.println(sum+" ");
        return sum;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        dia p = new dia();
        System.out.println("enter no of rows of square matrix");
        int m = sc.nextInt();
        int a[][] = new int[m][m];
        for(int i = 0 ; i< m ; i++)
        {
            for (int j = 0 ; j< m ;j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
        int k = p.di(a);
        System.out.println(k+" is the sum ");

    }

}
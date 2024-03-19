import java.util.Scanner;
class patterns
{
    public static void hollowrectangle(int m,int n)
    {
        for (int i = 1 ; i <= m;i++)
        {
            for (int j = 1 ; j<=n ;j++)
            {
                if (i == 1 || i == m || j==1 || j==n )
                {
                    System.out.print("*");
                }
                else 
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void invhalfpyramid(int n)
    {
        for (int i =1 ; i<=n ; i++)
        {
            for (int j = 1 ; j <=n-i ; j++)
            {
                System.out.print(" ");
            }
            for (int k = 1;k<=i;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void inhapy(int n)
    {
        for (int i = 1;i<=n;i++)
        {
            for (int j = 1;j<=n-i+1;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void bin(int n)
    {
        for (int i = 1;i<=n;i++)
        {
            for (int j =1 ; j<=i;j++)
            {
                if ((i+j)%2 == 0)
                {
                    System.out.print("1");
                }
                else
                {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
    public static void diamond(int n)
    {
        for (int i = 1; i<=n;i++)
        {
            for (int j = 1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for (int k = 1 ;k<=2*i-1;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n-1 ; i>=1;i--)
        {
            for (int j = 1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for (int k = 1 ;k<=2*i-1;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    } 
    public static void butterfly(int n)
    {
        for (int i =1;i<=n;i++)
        {
            for (int j=1 ;j<=i;j++)
            {
                System.out.print("*");
            }
            for(int j = 1; j <= 2*(n-i) ; j++ )
            {
                System.out.print(" ");
            }
            for (int j = 1;j <= i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n;i>=1 ;i--)
        {
            for (int j=1 ;j<=i;j++)
            {
                System.out.print("*");
            }
            for(int j = 1; j<=2*(n-i) ; j++ )
            {
                System.out.print(" ");
            }
            for (int j = 1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }    
    public static void rhombus(int n)
    {
        for (int i = 1; i<= n ; i++)
        {
            for (int j = 1; j<= n-i ; j++)
            {
                System.out.print(" ");
            }
            for (int k =1 ; k<= n;k++)
            {
                    System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void hollowrhombus(int n)
    {
        for (int i = 1; i<= n ; i++)
        {
            for (int j = 1; j<= n-i ; j++)
            {
                System.out.print(" ");
            }
            for (int k =1 ; k<= n;k++)
            {
                if(k==1 || k==n || i==1||i==n)
                {
                    System.out.print("*");
                }   
                else{
                    System.out.print(" ");
                } 
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of rows");
        int m = sc.nextInt();
        System.out.println("enter the no of columns");
        int n = sc.nextInt();
        hollowrectangle(m,n);
        invhalfpyramid(n);
        bin(n);
        diamond(n);
        inhapy(n);
        butterfly(n);
        rhombus(n);
        hollowrhombus(n);
    }
}
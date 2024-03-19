
class love
{
    public static void main(String args[])
    {
        int start = 0;
        int end = 6;

        for(int i = start ; i<=end; i++)
        {
            for(int j = start ; j <= end ; j++)
            {
                if(i == j || j == end-i )
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
               
            }
            System.out.println();
             if(i == end/2)
              {
                break;
              }       
        }

        for(int i = 0 ; i < 3 ; i++)
        {
            for(int j = 0 ; j <=4; j++)
            {
                if( j == 3)
                System.out.print("*");
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
        for(int i = 0 ; i< 7 ;i++)
        {
            for(int j = 0 ; j< 4 ; j++ )
            {
                if(i==0 || i==6 || j==0 || j==3 || i== 3)
                {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                } 

            }
            System.out.println();
        }
        System.out.println();
        for(int i = start ; i <= end; i++)
        {
            for(int j = start ; j <= end ; j++)
            {
                if(i == j || j == end-i )
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
               
            }
            System.out.println();
             if(i == end/2)
              {
                break;
              }       
        }
    }
}

/*import java.util.*;
class love
{
    public static void main(String args[])
    {
        int n = 5;
        for(int i = 0 ; i <= n ; i++)
        {
            for(int j = n-i ; j >= 0 ; j-- )
            {
                System.out.print(" ");
            }

            System.out.print("*");
            
            for(int k = 0; k < 2*i ; k++)
            {
                if(i == 3 && k<=i)
                {
                    System.out.print("*");
                }
                System.out.print(" ");
            }
            if(i != 3)
            {
            System.out.print("*");
            }
            System.out.println();
        }
        
        
    }
}


/*class love
{
    public static void main(String args[])
    {
        for(int i = 0 ; i <= 6 ; i++)
        {
            for(int j = 0 ; j <= 6 ; j++)
            {
                if(i == 3)
                {
                    System.out.print("* ");
                }
                if(i == 0 || i == 6 || j== 0 || j == 6 )
                {
                    System.out.print("* ");
                }
                else{
                    
                    System.out.print(" ");
                }
               
            }
            System.out.println();
        }
    }
}*/
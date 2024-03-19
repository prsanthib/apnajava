import java.util.Scanner;
class nump
{
    public static void main(String args[])
    {
        //first we have to print spaces next numbers after that space
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("ENTER NO N");
        for (int i = 1; i <=n ;i++)
        {   //spaces
            for (int j = 1;j<=n-i;j++ )
            {
                System.out.print(" ");
            }
            //numbers
            for (int k = 1; k<=i ; k++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
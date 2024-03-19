/*for patterns
to find solution
1.see outer loop(no of lines)
2.inner loop(no of elements in each line)
3.what to print
*/
import java.util.Scanner;
class inverted
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i<=n; i++)
        {
            for (int j=n-i+1; j>=1;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        } 
    }
}
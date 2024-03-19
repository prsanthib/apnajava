import java.util.Scanner;
class nnum
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int count = 1;
        int n = sc.nextInt();
        while(count <= n )
        {
            System.out.print(count+"\t");
            count++;
        }
    }
}
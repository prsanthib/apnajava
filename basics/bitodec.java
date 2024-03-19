import java.util.Scanner;
class bitodec
{
    public static void decimal(int n)
    {
        int power = 0;
        int dec = 0;
        while(n>0)
        {
        int n1 = n%10;
        dec = (int)(dec+n1*Math.pow(2,power));
        power++;
        n = n/10;
        }
        System.out.println("NUMBER IN DECIMAL IS "+dec);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER IN BINARY");
        int n = sc.nextInt();
        decimal(n);    
    }
}
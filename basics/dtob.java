import java.util.Scanner;
class dtob
{
    public static void binary(int n)
    {
        int bin = 0;
        int power = 0;
        while (n > 0)
        {
            bin = (int)(bin+(n%2)*Math.pow(10,power));
            n = n/2;
            power++;
        }
        System.out.println("NUMBER IN BINARY IS "+bin);
    }
    public static void main(String args[])

    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER IN DECIMAL");
        int n = sc.nextInt();
        binary(n);
        
    }
}
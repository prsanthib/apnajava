import java.util.Scanner;
class btodndtob
{
    public static void dectobi(int n)
    {
        int bin = 0;
        int power = 0;
        while (n>0)
        {
            
            bin = (int)(bin+(n%2)*Math.pow(10,power));
            n = n/2;
            power++;                                    
        }
        System.out.println("binary no is "+bin);
    }
    public static void bintodec(int n)
    {
        int dec = 0;
        int power = 0;
        while(n>0)
        {
            dec = (int)(dec +(n%10)*Math.pow(2,power));
            power++;
            n = n/10;
        }
        System.out.println("decimal no is"+dec);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER NO IN BINARY");
        int num1 = sc.nextInt();
        bintodec(num1);
        System.out.println("ENTER NO IN DECIMAL");
        int num2 = sc.nextInt();
        dectobi(num2);
    }
}
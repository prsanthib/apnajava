import java.util.Scanner;
class calc
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter a and b");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        System.out.println("ENTER 1.ADDITION \n 2.SUBTRACTION \n 3.MULTIPLICATION \n 4.DIVISION \n 5.MODULUS");
        int c = sc.nextInt();
        switch (c)
        {
            case 1:
            System.out.println(a+b);
            break;
            case 2:
            System.out.println(a-b);
            break;
            case 3:
            System.out.println(a*b);
            break;
            case 4:
            System.out.println(a/b);
            break;
            case 5:
            System.out.println(a%b);
            break;
            default:
            System.out.println("INVALID REQUEST"); 

        }
    }
}
import java.util.*;
class swap
{
    public static void swap(int a, int b)
    {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a is "+a);
        System.out.println("b is "+b);
    }
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("BEFORE SWAPPING");
        System.out.println("a is "+a);
        System.out.println("b is "+b);
        System.out.println("AFTER SWAPPING");
        swap(a,b);   //this is call by value
        /*in java method takes a copy of the original and after the execution of method this copy will be deleted
        System.out.println("a is "+a);
        System.out.println("b is "+b);
        it gives the values without swapping */
    }
}
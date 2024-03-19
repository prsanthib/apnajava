import java.util.Scanner;
class array
{
    public static void main(String args[])
    {   
        int a[] = new int[10];
        int b[] = {1,2,3,4};
        Scanner sc = new Scanner(System.in);
        a[0] = sc.nextInt();
        a[1] = sc.nextInt();
        a[2] = sc.nextInt();
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println("length of arrays is");
        System.out.println(a.length);
        a[0] = a[0] + 1;
        a[1] = 49;
        a[2] = a[0] + a[1];
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        //In java we can find length of an array by simply placing .length after arrayb name
        System.out.println("length of arrays is");
        System.out.println(a.length);
        //System.out.println();
    }
}
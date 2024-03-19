//convert numbers to strings
//ex: 1235 == one two three five
public class numtostr
{
    static String arr[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};
    public static void convertto(int x)
    {
        if (x == 0)
        return;
        int lastdigit = x%10;
        convertto(x/10);
        System.out.print(arr[lastdigit]+" ");
    }
    public static void main(String args[])
    {
        convertto(1234);
        System.out.println();
    }
}
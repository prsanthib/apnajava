//Write a program to find Length of a String using Recursion
class lengthofstr
{
    public static int len(String str)
    {
        if(str.length() == 0)
        {
            return 0;
        }
        return len(str.substring(1))+1; // substring starts from index 1
    }
    public static void main (String arga[])
    {
        String str = "hello world";
        System.out.println(""+len(str));
        System.out.println(str.substring(1));
    }
}
// function overloading means same function with different no of parameters
class funoverloading
{
    public static void sum(int a,int b)
    {
        System.out.println("sum is "+(a+b));
        
    }
    public static void sum(int a,int b,int c)
    {
        System.out.println("sum is "+(a+b+c));
    }
    public static float sum(float a,float b)
    {
        System.out.println("sum is "+(a+b));
        return a+b;
    }
    public static void main(String args[])
    {
      sum(2,3);
      sum(4,5,6);
      sum(2.9f,3.1f);
    }
}
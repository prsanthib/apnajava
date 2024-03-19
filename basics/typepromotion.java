public class typepromotion
{
public static void main(String args[])
{
    int a = 10;
    //float b = 15.0;
    double c = 12;
    byte d = 2;
    double enter = a+c+d;
   // int e = a+c+d;   throws an error as all the variables gets converted to double
    System.out.println(enter);
    System.out.println(e);
}
}
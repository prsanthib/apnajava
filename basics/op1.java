class op1
{
    public static void main (String args[])
    {
        int x = 2,y = 5;

        int exp1 = (x*y/x);
        int exp2 = (x*(y/x)); //5/2 = 2.5 but as it is of int data type 2.5 is considered as 2
        System.out.print(exp1+ ",");
        System.out.print(exp2);
    }
}
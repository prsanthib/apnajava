class Accessmodifiers
{
    public static void main(String args[])
    {
        bank obj = new bank();
        //obj.a = 10;
        obj.b = 20;
        obj.c = 30;
        obj.d = 50;
        //System.out.println(obj.a); //throws an error
        System.out.println(obj.b);
        System.out.println(obj.c);
        System.out.println(obj.d);

    }
}

class bank extends Accessmodifiers
{
    private int a;
    protected int b;
    public int c;
    int d;
}
// the ability of a message to be displayed in more than one form.
class polymorphism
{
public static void main(String args[])
{
    poly p = new poly();
    p.msg();
    p.msg(4);
    p.msg(5,4);

}
}
class poly
{
    void msg()
    {
        System.out.println("HIII");
    }
    void msg(int a)
    {
        System.out.println("prashu "+a);
    }
    void msg(int a, int b)
    {
        System.out.println(""+(a+b));
    }

}
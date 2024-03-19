interface a 
{
    void cook();
}
interface b
{
    void eat();
}

class c implements a,b
{
    public void cook()
    {
        System.out.println("cooking is completed");
    }
    public void eat()
    {
        System.out.println("eating is completed");
    }
}

class multipleinheritance
{
    public static void main(String args[])
    {
    c obj = new c();
    obj.cook();
    obj.eat();
}
}
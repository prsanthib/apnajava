class Constructor
{
    public static void main(String args[])
    {
        Up c = new Up();    
        Up c2 = new Up(20);
        Up c3 = new Up("PRASHU");
    }
}

class Up
{
    String name;
    int age;
    Up()            // not parametrized
    {
        System.out.println("HELLO");
    }
    Up(int age)        //paremetrized
    {
        this.age = age;
        System.out.println(age);
    }
    Up(String name)
    {
        this.name = name;
        System.out.println(name);
    }
}
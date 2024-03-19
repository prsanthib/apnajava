public class inheritance
{
    public static void main(String args[])
    {
        Fish d = new Fish();
        d.legs = 4;
        d.fins = 5;
        System.out.println(""+d.legs);
        System.out.println(""+d.fins);
        d.eat();
        d.breathe();
    }
}
class Animal
{
    void eat()
    {
        System.out.println("eats");
    }
    void breathe()
    {
        System.out.println("breathes");
    }
}

//single level inheritance
class Dog extends Animal
{
    int legs;
}

// multilevel
// extends sub class
class Fish extends Dog{
    int fins;
}


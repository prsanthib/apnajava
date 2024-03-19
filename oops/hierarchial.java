public class hierarchial
{
    public static void main(String args[])
    {
        Fish d = new Fish();
        Dog c = new Dog();
        c.legs = 4;
        d.fins = 5;
        System.out.println(""+c.legs);
        System.out.println(""+d.fins);
        d.eat();
        d.breathe();
        c.eat();
        c.breathe();
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

class Dog extends Animal
{
    int legs;
}

class Fish extends Animal
{
    int fins;
}
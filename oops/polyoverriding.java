//overriding means same method used differently in different classes
class polyoverriding
{
    public static void main(String args[])
    {
        Dog d = new Dog();
        d.eat();
        Cat c = new Cat();
        c.eat();
    }
}

class Animal
{
    void eat()
    {
        System.out.println("eats anything");
    }
}

class Dog extends Animal
{
    void eat()
    {
        System.out.println("eats chicken");
    }
}

class Cat extends Animal
{
    void eat()
    {
        System.out.println("eats rat");
    }
}
abstract class Animal
{
    Animal()
    {
        System.out.println("animal constructor");
    }
    abstract void msg(); // cannot initialise in abstract in class
    void hi()
    {
        System.out.println("hii guys");
    }
}
 // Animal -> dog -> dogg
class abstractt
{
    public static void main(String args[])
    {
        dogg d = new dogg();
    }
}

class dog extends Animal
{
    dog()
    {
       System.out.println("constructor dog invoked");  
    }
    void msg()
    {
           System.out.println("this is abstract method");
    }
}
class dogg extends dog
{
    dogg()
    {
        System.out.println("dogg constructor");
    }
}

class cat extends Animal{
    cat()
    {
        System.out.println("cat constructor");
    }
    void msg()
    {
        System.out.println("method msg invoked");
    }
}
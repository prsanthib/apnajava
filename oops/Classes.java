/*public class Classes
{
public static void main(String args[])
{
    Student obj = new Student();
    obj.name = "prashu";
    System.out.println(obj.name);
    obj.hello();

} 
}

class Student
{
    String name;

    void hello()
    {
        System.out.println("HELLO WORLD");
    }

}
*/

public class Classes
{
    public static void main(String args[])
    {
        Student s1 = new Student();
        s1.name = "PRASANTHI";
        s1.clas = 9;
        System.out.println(""+s1.name);
        System.out.println(""+s1.clas);
        s1.setName("tarun");
        s1.setClas(5);
        System.out.println(""+s1.name);
        System.out.println(""+s1.clas);

        Pen p1 = new Pen();
        p1.setColor("pink");
        p1.setCost(10);
        System.out.println(""+p1.color);
        System.out.println(""+p1.cost);
    }
}

class Student
{
    String name;
    int clas;
    void setName(String newName)
    {
        name = newName;
    }
    void setClas(int newClas)
    {
        clas = newClas;
    }
}

class Pen
{
    String color ;
    int cost;
    void setColor(String newColor)
    {
        color = newColor;
    }
    void setCost(int newCost)
    {
        cost = newCost;
    }
}
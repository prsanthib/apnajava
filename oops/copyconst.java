class copyconst
{
    public static void main(String args[])
    {
        hi p1 = new hi();
       // hi p2 = new hi("prashu");
       //hi p3 = new hi(18);
        p1.name = "TARUN";
        p1.age = 17;
        p1.password = "abcd";
        p1.marks[0] = 100;
        p1.marks[1] = 90;
        p1.marks[2] = 80;
        
        hi c1 = new hi(p1);
        c1.password = "xyz";   // password can be changed
        p1.marks[2]  = 70; // it dont change in deep copy
        System.out.println(""+c1.password);
        for (int i=0 ; i < 3;i++)
        {
            System.out.println(""+c1.marks[i]);
        }

    }
}
class hi
{
    String name;
    int age;
    String password;
    int marks[];

    // shallow copy constructor
    // marks can be updated
   /* hi(hi p1)
    {
        marks = new int[3];
        this.name = p1.name;
        this.age = p1.age;
        this.marks = p1.marks;
    }*/
    //deep copy constructor
    //we cannot change marks of single sub
    hi (hi p1)
    {
        marks = new int[3];
        this.name = p1.name;
        this.age = p1.age;
        for (int i = 0 ; i< marks.length ; i++)
        {
            this.marks[i] = p1.marks[i];
        }
    }

    hi()
    {
         marks = new int[3];
        //System.out.println("hello this is constructor");
    }
    hi(String name)
    {
        marks = new int[3];
        this.name = name;
       // System.out.println(""+name);
    }
    hi(int age)
    {
        marks = new int[3];
        this.age = age;
        //System.out.println(""+age);
    }
}
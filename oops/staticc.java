class a
{
    String name ;
    int rollno ;
    static String schoolName ; //static keyword

    static void hi()   //static method
    {
        System.out.println("hello this is static method");
    }

    static
    {
        System.out.println("this is static block");
    }

    void setRollno(int rollno)
    {
        this.rollno = rollno;
    }
    int getRollno()
    {
        return this.rollno;
    }
    void setName(String name)
    {
        this.name = name;
    }
    String getName()
    {
        return this.name;
    }

    public static class clas{
        void k(){
        System.out.println("this is static class");
        }
        }
}

class staticc
{
    public static void main(String args[])
    {
        a b = new a();
        a.clas p = new a.clas();
        p.k();
        b.name = "PRASANTHI";
        b.rollno = 02;
        b.schoolName = "rgukt";
        a b2 = new a(); // here we did no initialized b2.schoolname
        System.out.println(""+b2.schoolName);//as schooolName is static it is same for every obj
        b2.hi();
    }
}
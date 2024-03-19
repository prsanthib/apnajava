 class copyconstructor
{
    public static void main(String args[])
    {
       Student s1 = new Student();
        Student s2 = new Student("PRASANTHI");
        Student s3 = new Student(18);

    }
}

class Student
{
    String name;
    int age;
    Student(Student s2)
    {
        
    }
    Student()
    {
        System.out.println("HELLO WORLD");
    }
    Student(String name)
    {
        this.name = name;
        System.out.println(name);
    }
    Student(int age)
    {
        this.age = age;
        System.out.println(age);
    }
}
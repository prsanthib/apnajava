//getters and setters
//get to return value
//set to modify value
class Getset
{
    public static void main(String args[])
    {
        Student obj = new Student();
        obj.setname("PRASHU");
        System.out.println(obj.getname());
        obj.setage(18);
        System.out.println(obj.getage());
    }
}

class Student
{
    private String name;
    private int age;
 void setname(String name)
 {
    this.name = name;
 }
 String getname()
 {
   return this.name;
 }

void setage(int age)
 {
    this.age = age;
 }
 int getage()
 {
   return this.age;
 }
}
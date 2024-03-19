interface Animal{
    void color();
}

class dog implements Animal{
   public  void color()
    {
        System.out.println("black,brown");
    }
}

class cat implements Animal{
  public  void color()
    {
        System.out.println("cat color");
    }
}

class interfaces
{
    public static void main(String args[])
    {
        cat c = new cat();
        c.color();
        dog d = new dog();
        d.color();
        
    }
}
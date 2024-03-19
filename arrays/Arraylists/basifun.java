//array has fixed memory so we cannot change it
//so array lists have dynamic memory
import java.util.ArrayList;
class basifun
{
    public static void main(String args[])
    {
        //classname objname = new classname();
        //it is similar to the obj creation of obj
        //Arraylist is the class and list is the object and new Arraylist gives creation of space for obj

        ArrayList<Integer> list = new ArrayList<>();

        //add enables to add an element to the arraylist
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1,4); // at index 1 4 is added
        System.out.println(list);

        // delete
        list.remove(1); // removes element at index 1
        System.out.println(list);
        //get returns value at index
       System.out.println(list.get(1));

       //set    sets the value at index
       list.set(1,5);
       System.out.println(list);
    
       //contains returns true or false
       System.out.println(list.contains(5));
       System.out.println(list.contains(10));

    }
}
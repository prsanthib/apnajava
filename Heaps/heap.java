import java.util.*;
class heap
{
    static class heapp
    {
        ArrayList<Integer> al = new ArrayList<>();

        //add
        public void add(int data)
        {
            al.add(data);
            int x = al.size()-1;
            int par = (x-1)/2;

            while(al.get(par) > al.get(x))
            {
                //swap

                int temp = al.get(x);
                al.set(x,al.get(par));
                al.set(par,temp);

                x = par;
                par = (x-1)/2;
            }
        }

        public boolean isEmpty()
        {
            return al.size() == 0;
        }
        public int peek()
        {
            return al.get(0);
        }

        public void heapify(int i)
        {
            
            int min = i;
            int left = 2*i + 1;
            int right = 2*i + 2;

            if(left < al.size()-1 && al.get(left) < al.get(min))
            {
                min = left;
            }

            if(right < al.size()-1 && al.get(right) < al.get(min))
            {
                min = right;
            }

            if(min != i)
            {
                //swap
                int temp = al.get(i);
                al.set(i,al.get(min));
                al.set(min , temp);

                heapify(min);
            }

            
        }
        public int remove()
        {
            int data = al.get(0);

            //swap 1st and last node

            int temp = al.get(0);
            al.set(0,al.get(al.size()-1));
            al.set(al.size()-1,temp);
            
            //delete last element

            al.remove(al.size()-1);

            //heapify
            heapify(0);
            return data;
        }
    }
    public static void main(String args[])
    {
        heapp hp = new heapp();
        hp.add(5);
        hp.add(2);
        hp.add(4);
        hp.add(1);

        while(!hp.isEmpty())
        {
            System.out.println(hp.peek());
            hp.remove();
        }
    }
}
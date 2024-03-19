/*import java.util.ArrayList;
import java.util.LinkedList;
class implement
{
    static class HashMap<K,V>
    {
        private class Node
        {
            K Key;
            V Value;

            public Node(K Key , V Value)
            {
                this.Key = Key;
                this.Value = Value;
            }
        }
        private LinkedList<Node> buckets[];
        private int N;
        private int n;//no of nodes

        @SuppressWarnings("unchecked")
        public HashMap()
        {
            this.N = 4;
            this.buckets = new LinkedList[4];

            for(int i = 0 ; i < 4 ; i++)
            {
                this.buckets[i] = new LinkedList<>();
            }            
        }
        
        public int hashfun(K Key)
        {
            int hc = Key.hashCode();
            return Math.abs(hc) % buckets.length;
        }

        public int Searchinll(K Key , int bi)
        {
           LinkedList<Node> ll = buckets[bi];

           // int di = 0;
           for(int i = 0 ; i < ll.size() ; i++)
           {
                if(ll.get(i).Key == Key)
                {
                    return i;
                }
             //   di++;
           }
            return -1;
        }

        private void rehash()
        {
            //copied bucket to other
            LinkedList<Node> oldbucks[] = buckets;
            // double the size of the array
            N = 2*N;
            //create the buckets with new size
            for(int i = 0 ; i < N ; i++)
            {
                buckets[i] = new LinkedList<Node>();
            }
            //copy
            for(int i = 0 ; i < N ; i++)
            {
                LinkedList<Node> ll = oldbucks[i];
                for(int j = 0 ; j < ll.size() ; j++)
                {
                    Node node = ll.remove();
                    put(node.Key , node.Value);
                }
            }
        }
        private void put(K Key , V Value)
        {
            int bi = hashfun(Key);
            int di = Searchinll(Key , bi); 

            if(di != -1)
            {
                Node node = buckets[bi].get(di);
                node.Value = Value;
            } else {
                Node node = new Node(Key ,Value);
                buckets[bi].add(node);  
                n++;              
            }

            double lambda = (double)n/N;
             if(lambda > 2.0) 
             {
                rehash();
             }
        }

        private V get (K Key)
    {
        int bi = hashfun(Key);
        int di = Searchinll(Key , bi); 

            if(di != -1)
            {
                Node node = buckets[bi].get(di);
                return node.Value;
            } else {
                return null;              
            }
    }

        private boolean containskey(K Key)
        {
            int bi = hashfun(Key);
            int di = Searchinll(Key , bi); 

            if(di != -1)
            {
                return true;
            } else {
                return false;              
            }
        }
        private V remove(K Key)
        {
            int bi = hashfun(Key);
            int di = Searchinll(Key , bi); 

            if(di != -1)
            {
                Node node = buckets[bi].remove(di);
                return node.Value;
            } else {
                return null;           
            }
        }
        public ArrayList<K> keyset()
        {
            ArrayList<K> keys = new ArrayList<>();
            for(int i = 0 ; i< buckets.length ; i++)
            {
                LinkedList<Node> ll = buckets[i];
                for(int j = 0 ; j < ll.size() ; j++)
                {
                    keys.add(ll.get(j).Key);
                }
            }
            return keys;
        }
    }

    
    public static void main(String args[])
    {
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("INDIA" , 100);
        hm.put("USA" , 150);
        hm.put("CHINA" , 200);
        hm.put("SRILANKA",50); 

       ArrayList<String> al =hm.keyset();
        for(int i = 0 ; i < al.size() ; i++)
        {
            System.out.println(al.get(i));
        }        

        System.out.println(hm.remove("INDIA"));
        System.out.println(hm.get("INDIA"));
        System.out.println(hm.containskey("SRILANKA"));
    }
}
*/

/*
import java.util.*;
class implement
{
    public static void main(String args[])
    {
        //get,put,isEmpty,containsKey,remove takes O(1)
        //it returns random order
        //LinkedList is used in it
        //if elements are greater than 8 then tree datav structure is used
        HashMap<String , Integer> hm = new HashMap<>();
        hm.put("INDIA" ,100);
        hm.put("USA",150);
        hm.put("CHINA",200);

        System.out.println(hm);

        //get,put,isEmpty,containsKey,remove takes O(1)
        //it returns inserted order
        //the printed order is same as the given order
        //doubly linked list is used
        LinkedHashMap<String , Integer> lhm = new LinkedHashMap<>();
        lhm.put("INDIA" ,100);
        lhm.put("USA",150);
        lhm.put("CHINA",200);

        System.out.println(lhm);

        //insertion , deletion takes O(log n)
        //it gives the sorted order
        //red and black trees(a type of self balancing trees) are used

        TreeMap<String , Integer> tm = new TreeMap<>();
        tm.put("INDIA" ,100);
        tm.put("USA",150);
        tm.put("CHINA",200);

        System.out.println(tm);

    }
}

*/

/*
//maximum element i.e max repeating element
//we need to print the elements which repeats for morethan arr.length/3
import java.util.*;
class implement
{
    public static void main(String args[])
    {
        int arr[] = {1,2,1,3,1,2,1,3};
        // arr element , no of times it was repeated
        HashMap<Integer,Integer> hm = new HashMap<>();

       // for(int i = 0 ;  i < arr.length ; i++)
       // {
       //     if(hm.containsKey(arr[i]))
       //     {
       //        hm.put(arr[i],hm.get(arr[i])+1);
       //      } else {
       //         hm.put(arr[i],1);
       //     }
       //  } 

        //shortcut for above code
        
        for(int i = 0 ; i< arr.length ; i++)
        {
            hm.put(arr[i] , hm.getOrDefault(arr[i],0)+1);
        }

       // Set<Integer> keyset = hm.keySet();

       // System.out.println(keyset);

        for(Integer key : hm.keySet())//for(Integer key: keyset)
        {
            if(hm.get(key) > arr.length/3)
            {
                System.out.println(key);
            }
        }
    }
}

*/

//valid anagram
import java.util.*;
class implement
{
    public static void main(String args[])
    {
        String s = "heart";
        String t = "erth";

        char a[] = s.toCharArray();
        char b[] = t.toCharArray();

        if (s.length() != t.length() )
        {
            System.out.println("Not Anagrams");
            return;
        }

        HashMap<Character , Integer> hm = new HashMap<>();

        //inserting s to hash map
        for(int i = 0 ; i < s.length() ; i++)
        {
            hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i), 0) + 1);
        }

        //deleting t from hash map

        for(int i = 0 ; i < t.length() ; i++)
        {
            if(hm.containsKey(t.charAt(i)))
            {
                hm.put(t.charAt(i) , hm.get(t.charAt(i))-1);
            } else {
                System.out.println("not anagrams");
                return;
            }

            if(hm.get(t.charAt(i)) == 0)
            {
                hm.remove(t.charAt(i));
            }
        }

        if(hm.isEmpty())
        {
            System.out.println("ANAGRAMS");
        } else {
            System.out.println("NOT ANAGRAMS");
        }

    }
}
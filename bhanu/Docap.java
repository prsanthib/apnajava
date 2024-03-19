import java.util.*;
class Docap 
{
    static class time
    {
        int hrs;
        int mins;

        public time(int hrs,int mins)
        {
            this.hrs = hrs;
            this.mins = mins;
        }
    }

    public static ArrayList<ArrayList<String>> blockedtimes()
    {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the blocked time details");
        
            ArrayList<ArrayList<String>> al = new ArrayList<ArrayList<String>>();
        
            System.out.println("ENTER NO OF SLOTS");
            int  k = sc.nextInt();

            System.out.println("ENTER THE TIMINGS");
            for(int i = 0 ; i < k ; i++)
            {
                al.add(new ArrayList<String>(i));
                if(i == 0)
                {
                    String m = sc.nextLine();
                    String n = sc.nextLine();
                    al.get(0).add(0,m);
                    al.get(0).add(1,n);
                } else {
                String s1 = sc.nextLine();
                String s2 = sc.nextLine();
                al.get(i).add(0,s1);
                al.get(i).add(1,s2);
                }
            }  

            return al;    
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        ArrayList<ArrayList<String>> al = new ArrayList<ArrayList<String>>();
        al.add(new ArrayList<String>(0));


        for()
         String m = sc.nextLine();
         String n = sc.nextLine();
        al.get(0).add(0,m);
        al.get(0).add(1,n);
        al.add(new ArrayList<String>(1));
        al.get(1).add(0,"pichi");
        al.get(1).add(1,"upma");
        System.out.println(al);

      /*  String s = al.get(0).get(0);
      //  int i = Integer.parseInt(al.get(0).get(0));
        StringBuilder s1 = new StringBuilder(""); 
        StringBuilder s2 = new StringBuilder("");  
        for(int j = 0 ; j<2;j++)
        {
            s1.append(s.charAt(j));
        }
        for(int j = 3 ; j < 5 ; j++)
        {
            s2.append(s.charAt(j));
        }
       // System.out.println(s1);
        String s11 = s1.toString();
        String s22 = s2.toString();
        int k = Integer.parseInt(s11);
        System.out.println(k);

      // System.out.println(blockedtimes()); */
              
    }
}
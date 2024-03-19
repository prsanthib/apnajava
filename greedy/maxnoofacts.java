//return max no of activities a person can do if he can do 
//a single work at a time where starting and ending times were give
//we are given start an dend times based on endtime order basis
/*import java.util.*;
class maxnoofacts
{
    public static void main(String args[])
    {
        int start[] = {1,3,0,5,8,5};
        int   end[] = {2,4,6,7,9,9};
        ArrayList<Integer> al = new ArrayList<>();

        int maxacts = 0;

        //for 1st activity
        maxacts = 1;
        al.add(0);
       int lastend = end[0]; 
        for(int i = 1 ; i < start.length; i++)
        {
               if(start[i] >= lastend)
               {
                maxacts++;
                lastend = end[i];
                al.add(i);
               }
        }
        System.out.println("max activities can be done is "+maxacts);
        for(int i = 0 ; i< al.size() ; i++)
        {
            System.out.print("A"+al.get(i)+" ");
        }
        System.out.println();
}
}*/

// if it is given in starttime sorting order then
// we have to sort in end time sorting order because
//we need the work which completes faster so that we can do max works

import java.util.*;
class maxnoofacts
{
    public static void main(String args[])
    {
        int start[] = {3,5,5,1,0,8};
        int end[]   = {4,7,9,2,6,9};
        int maxacts = 0;
        ArrayList<Integer> al = new ArrayList<>();

        int activities[][] = new int[start.length][3];
        for(int i = 0 ; i<end.length ; i++)
        {
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        } 

        // sorting by lambda function
        Arrays.sort(activities,Comparator.comparingDouble(o -> o[2]));
        //1st activity
        maxacts = 1;
        al.add(activities[0][0]);
        int lastend = activities[0][2];

        for(int i = 1 ; i < end.length; i++)
        {
            if(activities[i][1] >= lastend)
            {
                al.add(activities[i][0]);
                maxacts++;
                lastend = activities[i][2];
            }
        }
        
        for(int i=0 ; i< al.size(); i++)
        {
            System.out.print("A"+al.get(i)+" ");
        }
        System.out.println();
        System.out.println("max no of activities is "+maxacts);
    }
}
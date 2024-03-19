//job time and profit were given and each job completes in a fixed time
//select jobs such that max profit can be gained

import java.util.*;
class jobsequence
{
    static class Job
    {
        int profit;
        int deadline;
        int id;
        Job(int i , int d , int p)
        {
            profit = p;
            deadline = d;
            id = i;
        }
    }
    public static void main(String args[])
    {
        int jobInfo[][] = {{4,20},{1,10},{1,40},{1,30}};

        //convert the array to obj so that we can sort them using collections framework
        ArrayList<Job> al = new ArrayList<>();
        for(int i = 0 ; i<jobInfo.length ; i++)
        {
            al.add(new Job(i,jobInfo[i][0],jobInfo[i][1]));
        } 

        //sort them
        Collections.sort(al , (obj1 ,obj2) -> (obj2.profit - obj1.profit));

        int time  = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0 ; i<al.size() ; i++)
        {
            Job curr = al.get(i);
            if(time < curr.deadline)
            {
                ans.add(curr.id);
                time++;
            }
        }
        System.out.println("the jobs can be done to max profits "+ans.size());

        for(int i = 0 ; i < ans.size() ; i++)
        {
            System.out.println(ans.get(i));
        }
    }
}
//knapsack is a bag
//we have to store the weight of items in knapsack such that we get the highest value

import java.util.*;
class knapsack
{
    public static void main(String args[])
    {
        int value[] = {60,100,120};
        int weight[] = {10,20,30};
        int W = 50;
        double ratio[][] = new double[value.length][2];

        for(int i = 0 ; i<weight.length ; i++)
        {
            ratio[i][0] = i;
            ratio[i][1] = value[i]/(double)weight[i];
        }

        //sorting ratios
        Arrays.sort(ratio,Comparator.comparingDouble(o -> o[1]));

        int finalval = 0;
        int capacity = W;
        for(int i = ratio.length-1; i>=0 ; i--)
        {
            int idx = (int)ratio[i][0];
            if(weight[idx] <= capacity)
            {
                finalval += value[idx];
                capacity -= weight[idx];
            } else {
                finalval += ratio[i][1] * capacity;
                capacity = 0;
                break;
            }
        }
        System.out.println("max value is "+finalval);
    }
}
//here we are given a chocolate and each cut requires different costs
//so if there are many piecies then we are required to cut those piecies which comes under a single cut and multiply them
import java.util.*;
public class chocola
{
    public static void main(String args[])
    {
        int m = 6,n = 4;
        Integer vcost[] = {2,1,3,1,4};
        Integer hcost[] = {4,1,2};

        //sort both the arrays in descending order

        Arrays.sort(vcost , Collections.reverseOrder());
        Arrays.sort(hcost , Collections.reverseOrder());

        int hp = 1, vp = 1;
        int h = 0 , v = 0;
        int cost = 0;
        while(h < hcost.length && v < vcost.length)
        {
            if(vcost[v] <= hcost[h])
            {
                cost += hcost[h]*vp;
                h++;
                hp++;
            } else {
                cost+= vcost[v]*hp;
                v++;
                vp++;
            }
        }

        while(h < hcost.length)
        {
            cost += hcost[h]*vp;
            h++;
            hp++;
        }
        while(v < vcost.length)
        {
            cost+= vcost[v]*hp;
            v++;
            vp++; 
        }
        System.out.println("the minimum cost is "+cost);
    }
}
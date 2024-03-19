// given n pairs if 2nd no of 1st pair is less than
//1st no of 2nd pair then add it to the chain
import java.util.*;
class maxlenchain
{
    public static void main(String args[])
    {
        //pairs

        int pairs[][] = {{5,24},{39,60},{5,28},{27,40},{50,90}};
        
        //sort on the basis of 2nd value
        //Arrays.sort(ratio,Comparator.comparingDouble(o -> o[1]));
        Arrays.sort(pairs,Comparator.comparingDouble (o -> o[1]));
        
        //1st pair selection

        int chainlen = 1;
        int lastend = pairs[0][1];

        for(int i = 0 ; i< pairs.length ; i++)
        {
            if(pairs[i][0] >= lastend)
            {
                chainlen++;
                lastend = pairs[i][1];
            }
        }
        System.out.println("the max length of chain is "+chainlen);

    }
}
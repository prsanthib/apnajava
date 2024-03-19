//here you will be given a value
//you have to return min no of coins/notes can be given
// 590 = 500 + 50 + 20 + 20 (min 4 coins)
import java.util.*;
class indiancoins
{
    public static void main(String args[])
    {
        Integer coins[] = {1,2,5,10,20,50,100,500,2000};

        //to sort in a descending order we have to initialize coins as Integer not int
        Arrays.sort(coins,Comparator.reverseOrder());
        ArrayList<Integer> ans = new ArrayList<>();
        int amount = 10099;
        int count = 0;
        for(int i = 0 ; i < coins.length;i++)
        {
            if(coins[i] <= amount)
            {
                while(coins[i] <= amount)
                {
                    count++;
                    amount -= coins[i];
                    ans.add(coins[i]);
                }
            }
        }
        System.out.println("minimum no of coins or notes are "+count);

        for(int i = 0 ; i<ans.size() ; i++)
        {
            System.out.println(ans.get(i));
        }
    }
}

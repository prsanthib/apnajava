import java.util.*;
class linearsearch
{
    public static int linearsearch(int a[],int key,int k)
    {
        
        for (int i = 0;i<k;i++)
     {
        if (a[i] == key)
        {
            return i;
        }
      }
      return -1;
      
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENETER NO OF ELEMENTS OF AN ARRAY");
        int k = sc.nextInt();
        int arr[] = new int[k];
        System.out.println("ENTER THE ELEMENTS OF THE ARRAY");
        for (int i = 0;i<k;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("ENTER THE ELEMENT TO BE SEARCHED");
        int key = sc.nextInt();
       int p = linearsearch(arr,key,k);
       if (p == -1)
       {
        System.out.println("element not found");
       }
       else
       {
        System.out.println("element found at index "+p);
       }
       
     }
}
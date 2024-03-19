#include<stdio.h>
#include<stdlib.h>

void minheapify(char arr[] , int i ,int size)
    {
        int left = 2*i+1;
        int right = 2*i+2;
        int min = i;

        if(left < size && arr[left] < arr[min])
        {
            min = left;
        }
        if(right < size && arr[right] < arr[min])
        {
            min = right;
        }

        if(min != i)
        {
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

void heapSort(char arr[] , int n)
    {
        //step 1 : minheapify all the non leaf Nodes

        for(int i = n/2 ; i >= 0 ; i--)
        {
            minheapify(arr,i,n);
        }

        //step 2 : is to swap last and 1st elements
        
        for(int i = n-1 ; i>=0 ; i--)
        {
            //swap
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            minheapify(arr,0,i);
        }
    }

int main()
{
    
    char a[] = "GE DKACMIRO";
    printf("before arranging\n");
    for(int i = 0 ; i<11 ; i++)
    {
        printf("%c",a[i]);
    }
    printf("\n");
    
    heapSort(a,11);
    printf("AFTER ARRANGING IN SEQUENCE \n");
    for(int i = 0 ; i<11 ; i++)
    {
        printf("%c",a[i]);
    }
    printf("\n");
    return 0;
}

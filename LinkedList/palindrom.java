class palindrom
{
    public static class Node
    {
        int data;
        Node next;
        public Node(int data)
        {
            this.data = data;
            this.next = next;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size ;

    public void addfirst(int data)
    {
        Node newNode = new Node(data);
        size++;
        if(head == null)
        {
            head = tail = newNode;
            head.next = null;
            return;
        }

        newNode.next = head;
        head = newNode;

    }
    public void printll()
    {
        if(head == null)
        {
            System.out.println("empty list");
        }

        Node temp = head;

        while(temp != null)
        {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public int[] lltoarr()
    {
        int arr[] = new int[size];
        int i = 0;
        Node temp = head;
        while(temp != null)
        {
            arr[i] = temp.data;
            temp = temp.next;
            i++;
        }
        return arr;
    }
    public void printarr(int[] a)
    {
        for(int i = 0 ; i<a.length ; i++)
        {
            System.out.print(" "+a[i]);
        }
        System.out.println();
    }
    public void pal(int arr[])
    {
        int flag = 0 ;
        for(int i = 0;i < (arr.length+1)/2; i++)
        {
            if(arr[i] != arr[arr.length-i-1])
            {
                flag =1;
            }
        }
        if(flag == 0)
        System.out.println("palindrome");
        else
        System.out.println("not a palindrome");
    }
    public static void main(String args[])
    {
        palindrom ll = new palindrom();
        ll.addfirst(1);
        ll.addfirst(1);
        ll.addfirst(2);
        ll.addfirst(2);
        ll.addfirst(1);
        ll.addfirst(1);
        ll.printll();
        ll.pal(ll.lltoarr());        
    }
}
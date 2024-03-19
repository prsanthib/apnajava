class printinRange
{
    static class Node
    {
        int data;
        Node left;
        Node right;
        public Node(int data)
        {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node build(Node root , int n)
    {
        if(root == null)
        {
           root = new Node(n);
           return root;
        }

        if(root.data > n)
        {
            root.left = build(root.left,n);
        }

        if(root.data < n)
        {
            root.right = build(root.right,n);
        }

        return root;
    }
    public static void inorder(Node root)
    {
        if (root == null)
        {
            return ;
        }

        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static void printinrange(Node root , int n1 , int n2)
    {
        if(root == null)
        {
            return;
        }

        if(root.data >= n1 && root.data <= n2)
        {
            printinrange(root.left,n1,n2);
            System.out.print(root.data+" ");
            printinrange(root.right,n1,n2);
        } else if(root.data > n1)
        {
            printinrange(root.left , n1 ,n2);
        } else {
            printinrange(root.right , n1 , n2);
        }
    }
    public static void main(String args[])
    {
        int val[] = {5,1,3,4,2,7};

        Node root = null;
        for(int i = 0 ; i < val.length ; i++)
        {
            root = build(root,val[i]);
        }

         inorder(root);
         System.out.println();
         printinrange(root,1,4);
    }
}
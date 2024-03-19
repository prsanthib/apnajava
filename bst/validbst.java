class validbst
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

    public static boolean isbst(Node root , Node min , Node max)
    {
        if(root == null)
        {
            return true;
        }

        if(min != null && root.data <= min.data)
        {
            return false;
        }

        else if(max != null && root.data >= max.data)
        {
            return false;
        }

        return isbst(root.left , min , root) 
               && isbst(root.right , root , max);
    
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
        } else {
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

    public static void main(String args[])
    {
        int val[] = {1,1,1};

        Node root = null;
        for(int i = 0 ; i < val.length ; i++)
        {
            root = build(root,val[i]);
        }

         inorder(root);
         System.out.println();

         if(isbst(root , null , null))
         {
            System.out.println("bst");
         } else {
            System.out.println("not bst");
         }
    }
}
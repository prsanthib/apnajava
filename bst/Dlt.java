class Dlt
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

    public static Node buildbst(Node root , int n)
    {
        if(root == null)
        {
            root = new Node(n);
            return root;
        }

        if(n < root.data)
        {
          root.left = buildbst(root.left , n);
        } else {
          root.right = buildbst(root.right,n);
        }

        return root;

    }

    public static Node delete(Node root , int data)
    {
        if(root.data > data)
        {
            root.left = delete(root.left,data);
        } else if (root.data < data)
        {
            root.right = delete(root.right,data);
        } else {    // we got the node
            //case 1: leaf Node
            if(root.left == null && root.right == null)
            {
                return null;
            }

            // case 2: one child

            if(root.left == null)
            {
                return root.right ;
            }

            if(root.right == null)
            {
                return root.left;
            }

            //case 3: two children
            Node IS = inorderSuccessor(root.right); // left most node of right subtree
            root.data = IS.data;
            root.right = delete(root.right , IS.data);
        }
        return root;
    }

    public static Node inorderSuccessor(Node root)
    {
        while(root.left != null)
        {
            root = root.left;
        }
        return root;
    }
    public static void inorder(Node root)
    {
        if(root == null)
        {
            return ;
        }

        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static void main(String args[])
    {
        Node root = null;
        int val[] = {8,5,3,1,4,6,10,11,14};

        for(int i = 0 ; i < val.length ; i++)
        {
            root = buildbst(root,val[i]);
        }

        inorder(root);
        System.out.println();

        delete(root , 8);
        System.out.println();
        inorder(root);
    }
}
class buildbst
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
        } else  {
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

    public static boolean search(Node root , int key)
    {
         if(root == null)
        {
            return false;
        } 
        
        if(root.data == key)
        {
            return true;
        }

        if(key > root.data)
        {

            return  search(root.right,key); 

        } else {

            return search(root.left,key);
        
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
       if(search(root,9))
       {
        System.out.println("FOUND");
       } else {
        System.out.println("NOT FOUND");
       }
    }    
    }

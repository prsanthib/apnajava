import java.util.*;
class bt
{
    static class Node
    {
        int data;
        Node left;
        Node right;
        Node(int data)
        {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class binarytree
    {
        static int idx = -1;
        public static Node buildtree(int tree[])
        {
            idx++;
            if(tree[idx] == -1)
            return null;

            Node newNode = new Node(tree[idx]);
            newNode.left = buildtree(tree);
            newNode.right = buildtree(tree);

            return newNode;
        }
    }

    public static void preorder(Node root)
    {
        if (root == null)
        {
            return;
        }
        
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void inorder(Node root)
    {
        if(root == null)
        {
            return;
        }

        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static void postorder(Node root)
    {
        if(root == null)
        {
            return;
        }

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }

    public static void levelorder(Node root)
    {
       Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null); 

        while(!q.isEmpty())
        {
            Node curr = q.remove();
            if(curr == null)
            {
                if(q.isEmpty()){
                break;
                } else {
                    System.out.println();
                    q.add(null);
                }
            } else {
                System.out.print(curr.data+" ");
               if(curr.left != null)
                q.add(curr.left);
               if(curr.right != null)
                q.add(curr.right);
            }
            
        }
        

    }

    public static void main(String args[])
    {
        int []tree = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        binarytree b = new binarytree();
        Node root = b.buildtree(tree);

        System.out.println("preorder is ");
        preorder(root);
        System.out.println();
        System.out.println("inorder is ");
        inorder(root);
        System.out.println();
        System.out.println("postorder is ");
        postorder(root);
        System.out.println();
        System.out.println("level order is " );
        levelorder(root);
        System.out.println();
    }
}
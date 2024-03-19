import java.util.*;
class inverted
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

    public static Node mirror(Node root)
    {
        if(root == null)
        {
            return null;
        }

        Node rootleft = mirror(root.left);
        Node rootright = mirror(root.right);

        root.left = rootright;
        root.right = rootleft;

        return root;
    }
    
    public static void swap(Node root)
    {
        if(root.left == null && root.right == null)
        {
            return;
        }
        if(root.left != null || root.right != null)
        { 

        Node temp = root.left;
        root.left = root.right;
        root.right = temp;
        }    

        swap(root.left);
        swap(root.right);
    }
    
    public static void preorder(Node root)
    {
        if(root == null)
        {
            return;
        }

        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String args[])
    {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println("BEFORE SWAPPING");
        preorder(root);
        System.out.println();
        mirror(root);
        System.out.println("AFTER SWAPPING");
        preorder(root);
        System.out.println();
    }
}
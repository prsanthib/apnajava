import java.util.*;
class printpaths
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

    public static void print(ArrayList<Integer> path)
    {
        for(int i = 0 ; i < path.size() ; i++)
        {
            System.out.print(path.get(i)+"->");
        }
        System.out.print("NULL");
        System.out.println();
    }
    public static void printpath(Node root,ArrayList<Integer> path)
    {
        
        if (root == null)
        return ;
        path.add(root.data);

        if(root.left == null && root.right == null)
        {
            print(path);
        }

        printpath(root.left,path);
        printpath(root.right,path);
        path.remove(path.size()-1);

    }
    public static void main(String args[])
    {
        int val[] = {5,1,3,4,2,7};
        Node root = null;
        for(int i = 0 ; i< val.length ; i++)
        {
            root = build(root , val[i]);
        }

        ArrayList<Integer> path = new ArrayList<>();
        printpath(root,path);
    }
}
import java.util.*;
class mergeTwobst
{
    static class Node
    {
        int data;
        Node right;
        Node left;

        public Node(int data)
        {
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }
    
    public static void inorder(Node root,ArrayList<Integer> al)
    {
        if(root == null)
        {
            return ;
        }

        inorder(root.left,al);
        al.add(root.data);
        inorder(root.right,al);
    }
    public static void sort(ArrayList<Integer> al1 , ArrayList<Integer> al2, ArrayList<Integer> al)
    {
        int s1 = 0;
        int s2 = 0;
        while(s1<al1.size() && s2<al2.size())
        {
        if(al1.get(s1) < al2.get(s2))
        {
            al.add(al1.get(s1));
            s1++;
        } else {
            al.add(al2.get(s2));
            s2++;
        }
        }

        while(s1<al1.size())
        {
            al.add(al1.get(s1));
            s1++;
        }

        while(s2 < al2.size())
        {
            al.add(al2.get(s2));
            s2++;
        }
    }

    public static void preorder(Node root)
    {
        if(root == null)
        return;

        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static Node buildbst(ArrayList<Integer> al , int s , int e)
    {
        if(s>e)
        return null;

        int mid = (s+e)/2;
        Node root = new Node(al.get(mid));
        root.left = buildbst(al,s,mid-1);
        root.right = buildbst(al,mid+1,e);

        return root;
    }
    public static Node merge(Node root1,Node root2)
    {
        ArrayList<Integer> al1 = new ArrayList<>();
        ArrayList<Integer> al2 = new ArrayList<>();
        ArrayList<Integer> al = new ArrayList<>();
        inorder(root1,al1);
        inorder(root2,al2);

        sort(al1,al2,al);
        
        Node root = buildbst(al,0,al.size()-1);

        return root;
    }
    public static void main(String args[])
    {
        Node root1 = new Node(2);
        root1.right = new Node(4);
        root1.left = new Node(1);

        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);

        Node root = merge(root1,root2);
        preorder(root);
    }
}
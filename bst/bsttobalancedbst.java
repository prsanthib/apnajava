import java.util.*;
class bsttobalancedbst
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

    public static Node createbst(ArrayList<Integer> al, int st ,int end)
    {
        if(st>end)
        {
            return null;
        }        
        int mid = (st+end)/2;
        Node root = new Node(al.get(mid));
        root.left = createbst(al,st,mid-1);
        root.right = createbst(al,mid+1,end);
        return root;
    }

    public static Node tobbst(Node root)
    {
        //create inorder array list
        ArrayList<Integer> al = new ArrayList<>();
        inorder(root,al);
        //create the balanced bst
        root = createbst(al,0,al.size()-1);

        return root;
    }
    public static void inorder(Node root , ArrayList<Integer> al)
    {
        if(root == null)
        {
            return;
        }

        inorder(root.left,al);
        al.add(root.data);
        inorder(root.right,al);
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
        Node root = new Node(8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);
        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);
        System.out.println("before conversion");
        preorder(root);
        root = tobbst(root);
        System.out.println("After conversion");
        preorder(root);
    }
}
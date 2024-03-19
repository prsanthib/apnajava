/*import java.util.*;
class la2
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

    public static boolean getpath(Node root , ArrayList<Node> p1 ,int n1)
    {

        if(root == null)
        {
            return false;
        }

        p1.add(root);

        if(root.data == n1)
        {
            return true;
        }

        boolean left = getpath(root.left,p1,n1);
        boolean right = getpath(root.right,p1,n1);

        if(left || right)
        {
            return true;
        }
        p1.remove(root);
        return false;
    }
    public static Node lca(Node root,int n1 , int n2)
    {
        ArrayList<Node> p1 = new ArrayList<>();
        ArrayList<Node> p2 = new ArrayList<>();
        getpath(root,p1,n1);
        getpath(root,p2,n2);
        Node lca;
        int i = 0 ;
        for( ; i < p1.size() && i < p2.size() ; i++)
        {
            if(p1.get(i) != p2.get(i))
            {
                break;
            }
        }
        lca = p1.get(i-1);
        return lca;
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
        int n1 = 4;
        int n2 = 7;
        System.out.println(lca(root , n1,n2).data);
    }
}
*/
import java.util.*;
class la2
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

    public static Node lca(Node root ,int n1 , int n2)
    {
        if (root == null)
        return null;

        if(root.data == n1 || root.data == n2)
        return root;

        Node leftlca = lca(root.left,n1,n2);
        Node rightlca = lca(root.right,n1,n2);

        if(leftlca == null)
        return rightlca;

        if(rightlca == null)
        return leftlca;

        return root;
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

        int n1 = 4;
        int n2 = 6;
        System.out.println(lca(root,n1,n2).data);
    }
}
//it returns the lowest commen ancestor of the two nodes
import java.util.*;
class lowestancestor
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
    public static boolean getpath(Node root , int n , ArrayList<Node> path)
    {
        if(root == null)
        {
            return false;
        }
        path.add(root);
         
        if(root.data == n)
        {
            return true;
        }

        boolean foundleft = getpath(root.left, n,path);
        boolean foundright = getpath(root.right, n,path);

        if(foundleft || foundright)
        {
            return true;
        }

        path.remove(root);

        return false;
    }
    public static Node lca(Node root,int n1,int n2)
    {
        ArrayList<Node> p1 = new ArrayList<>();
        ArrayList<Node> p2 = new ArrayList<>();

        getpath(root,n1,p1);
        getpath(root,n2,p2);

        int i = 0;
        for( ; i<p1.size() && i <p2.size() ; i++)
        {
            if(p1.get(i)!=p2.get(i))
            {
                break;
            }
        }
        Node Lca = p1.get(i-1);

         return Lca;
    }
    public static void main(String ars[])
    {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int n1 = 4;
        int n2 = 5;
        System.out.println("lowest common ancester is "+lca(root,n1,n2).data);
    }
}
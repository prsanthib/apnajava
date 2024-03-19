//print all the nodes of the givel level
/*class kthlevel
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

    public static void printklevel(Node root , int level , int k)
    {
        if (root == null)
        {
            return;
        }

        if(level == k)
        {
            System.out.print(root.data+" ");
            return;
        }

        printklevel(root.left , level+1 , k);
        printklevel(root.right , level+1 , k);
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

            int k = 3;

            printklevel(root , 1 , k);
            System.out.println();
    }
}
*/

//by using level order traversal
import java.util.*;
class kthlevel
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
    public static void printklevel(Node root ,int level , int k)
    {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty())
        {
            Node curr = q.remove();
            if(curr == null)
            {
                if(q.isEmpty())
                {
                    break;
                } else {
                    level++;
                    q.add(null);
                }
            } else {
                if(level == k){
                System.out.print(curr.data+" ");
                }
                if(curr.left != null)
                {
                    q.add(curr.left);
                }
                if(curr.right != null)
                {
                    q.add(curr.right);
                }
            }
        }
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
            int k = 3;
            printklevel(root , 1 , k);
            System.out.println();
    }
}
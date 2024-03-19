import java.util.*;
class diameter
{
    static class Node
    {
        int data;
        Node right;
        Node left;
        public Node(int data)
        {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int height(Node root)
    {
        if(root == null)
        return 0;

        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh,rh)+1;
    }
    public static int diameter(Node root)  //O(n^2)
    {
        if(root == null)
        return 0;

        int lh = height(root.left);
        int rh = height(root.right);
        int ld = diameter(root.left);
        int rd = diameter(root.right);

        int selfdiameter = lh+rh+1;

        return Math.max(Math.max(ld,rd),selfdiameter);
    }

    //approach 2 O(n)
    static class Info
    {
        int diameter;
        int height;
        public Info(int diameter , int height)
        {
            this.diameter = diameter;
            this.height = height;
        }
    }

    /*// we use a single function which calculates both height and diamater
     public static Info diameter2(Node root)
     {
        if(root == null)
        {
            return new Info(0,0) ;
        }
        
        Info leftInfo = diameter2(root.left);
        Info rightInfo = diameter2(root.right);

        int dia = Math.max(Math.max(leftInfo.diameter,rightInfo.diameter),leftInfo.height+rightInfo.height+1);
        int ht = Math.max(leftInfo.height , rightInfo.height);

        return new Info(diameter,height);
     }*/

     public static Info diameter2(Node root)
     {
        if(root == null)
        {
            return new Info(0,0);
        }

        Info LI = diameter2(root.left);
        Info RI = diameter2(root.right);

        int dia = Math.max(Math.max(LI.diameter , RI.diameter),LI.height+RI.height+1);
        int ht = Math.max(LI.height,RI.height)+1;

        return new Info(dia,ht);
     }

    public static void main(String args[])
       {
            Node root = new Node(1);
            root.left = new Node(2);
            root.right = new Node(3);
            root.left.left = new Node(4);
            //root.right.left = new Node();
            root.left.right = new Node(5);
            root.right.right = new Node(6);

            System.out.println(diameter2(root).diameter);
            System.out.println(diameter2(root).height);
        }

}
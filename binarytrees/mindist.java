class mindist
{
    static class Node
    {
        int data;
        Node left ;
        Node right;
        public Node(int data)
        {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node lca(Node root , int n1,int n2)
    {

        if(root == null ||root.data == n1 || root.data == n2)
        return root;

        Node leftlca = lca(root.left,n1,n2);
        Node rightlca = lca(root.right,n1,n2);

        if(leftlca == null)
        return rightlca;

        if(rightlca == null)
        return leftlca;

        return root;
    }

    public static int distance(Node root , int n)
    {
        if(root == null)
        return -1;

        if(root.data == n)
        return 0;

        int left = distance(root.left,n);
        int right = distance(root.right,n);

        if(left == -1 && right == -1)
        {
            return -1;
        } else if(left == -1)
        {
            return right+1;
        } else {
            return left+1;
        }

    }
    public static int mindistance(Node root , int n1,int n2)
    {
        Node la = lca(root,n1,n2);
        int dist1 = distance(la,n1);
        int dist2 = distance(la,n2);

        return dist1 + dist2;
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
        System.out.println(mindistance(root,n1,n2));
    }
}
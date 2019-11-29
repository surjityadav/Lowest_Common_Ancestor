
import java.util.Scanner;


public class Lowest_Common_Ancestor 
{
    static Node root;
    static class Node 
    {
        int data;
        Node left,right;
        Node(int data)
        {
            this.data=data;
            left=right=null;
        }
    }
    static Node lc_ancestor(Node root,int x,int y)
    {
        if(root == null)
            return root;
        if(root.data == x || root.data == y)
            return root;
        Node left=lc_ancestor(root.left,x,y);
        Node right=lc_ancestor(root.right,x,y);
        if(left !=null && right!=null)
            return root;
        if(left!=null)
            return left;
        else
            return right;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Lowest_Common_Ancestor lc=new Lowest_Common_Ancestor();
        root=new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);
        root.left.left=new Node(40);
        root.left.right=new Node(50);
        root.right.left=new Node(60);
        root.right.right=new Node(70);
        
        System.out.println("Enter two values whose LCA is to find");
        int n=sc.nextInt();
        int m=sc.nextInt();
        Node res=lc_ancestor(root,n,m);
        System.out.println("LCA of "+n+" and "+m+" = "+res.data);
    }
}

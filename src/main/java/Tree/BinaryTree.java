package Tree;
// height = root to child = max number of nodes.
//Binary Search Tree
//PreOrder Inorder PostOrder LevelOrder traversals
//creating a tree

import java.util.LinkedList;
import java.util.Queue;

class Node{
    int data;
    Node left;
    Node right;

    Node(int data)
    {
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
public class BinaryTree {

    static int i=-1;
    static Node createBinaryTree(int[] arr)
    {
        i++;
        if(arr[i] == -1)
        {
            return null;
        }

        Node n=new Node(arr[i]);
        n.left= createBinaryTree(arr);
        n.right= createBinaryTree(arr);

        return n;
    }

    //DFS - approach
    //1   2   4   5   3   6
    static void preOrder(Node node)
    {//TC:O(N)
        if(node == null)
        {
            return;
        }
        System.out.print(node.data+ "   ");
        preOrder(node.left);
        preOrder(node.right);
    }

    //4   2   5   1   3   6
    static void inOrder(Node node)
    {//TC:O(N)

        if(node == null)
        {
            return;
        }

        inOrder(node.left);
        System.out.print(node.data+ "   ");
        inOrder(node.right);
    }

    //4   5   2   6   3   1
    static void postOrder(Node node)
    {//TC:O(N)

        if(node == null)
        {
            return;
        }

        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data+ "   ");

    }
      public static void levelOrder(Node root)
      {
          if(root == null)
          {
              return;
          }
          Queue<Node> q=new LinkedList<>();

          q.add(root);
          q.add(null);// null is used to as indication to tell

          while(!q.isEmpty())
          {
              Node curr=q.remove();
              if(curr == null)
              {
                  System.out.println(" ");
                  if(q.isEmpty())
                  {
                      break;
                  }
                  else{
                      q.add(curr);
                  }
              }
              else{
                  System.out.print(curr.data+"   ");
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


    public static void main(String[] args)
    {
        //create a binary tree
        //every node will have left and right children
        //0 to 2
        //-1 consider it as null node

        int[] arr= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        Node root=createBinaryTree(arr);
        System.out.println("----Starting Node of created Tree-----");
        System.out.println(root.data);
        System.out.println("  ");
        System.out.println("----PreOrder-----");
        preOrder(root);
        System.out.println(" ");
        System.out.println("----InOrder-----");
        inOrder(root);
        System.out.println(" ");
        System.out.println("----PostOrder-----");
        postOrder(root);
        System.out.println(" ");
        System.out.println("----LevelOrder-----");
        levelOrder(root);

    }

}

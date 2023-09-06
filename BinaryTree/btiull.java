// class is about for implemention of the binary tree and display using three types of traversals as pre order, in order, post order on the binary tree implemented using linked list i.e., btiull
package BinaryTree;
import java.util.*;
class btiull{
    // declaring the root node pointer globally
    private Node root;
    private Scanner read;   // making the read as global object for the main
    class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    btiull(){
        read = new Scanner(System.in); // creating the instance of the read in the main method constructor
    }
    Node create(){
        Node root = null;
        System.out.print("Data : ");
        int data = read.nextInt();
        if(data == -1){
            return null;
        }
        root = new Node(data);
        System.out.print("Left Data of " + data + "  ");
        root.left = create();
        System.out.print("Right Data of " + data + "  ");
        root.right = create();
        return root;
    }
    // preot - pre order traversal
    public void preot(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preot(root.left);   // left child
        preot(root.right);  // right child
    }
    // inot - in order traversal
    public void inot(Node root){
        if(root == null){
            return;
        }
        inot(root.left);    // left child
        System.out.print(root.data + " ");
        inot(root.right);   // left child
    }
    // postot - post order traversal
    public void postot(Node root){
        if(root == null){
            return;
        }
        postot(root.left);  // left child
        postot(root.right); // right child
        System.out.print(root.data + " ");
    }
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        btiull bt = new btiull();
        while(true){
            System.out.print("Operation Case : ");
            int p = read.nextInt();
            switch(p){
                // creation of the tree
                case 1:
                    bt.root = bt.create();
                    break;
                // pre order traversal of the binary tree
                case 2:
                    System.out.print("Pre Order Binary Tree : ");
                    bt.preot(bt.root);
                    System.out.println();
                    break;
                // in order traversal of the binary tree
                case 3:
                    System.out.print("In Order Binary Tree : ");
                    bt.inot(bt.root);
                    System.out.println();
                    break;
                // post oreder traversal of the binary tree
                case 4:
                    System.out.print("Post Order Binary Tree : ");
                    bt.postot(bt.root);
                    System.out.println();
                    break;
                // switch breaks when other number is enterred except the provided case numbers
                default:
                    read.close();
                    System.exit(0);
            }
        }
    }
}
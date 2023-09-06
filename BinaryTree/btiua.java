// class is about for implemention of the binary tree and display using three types of traversals as pre order, in order, post order on the binary tree implemented using arrays i.e., btiua
package BinaryTree;
import java.util.*;
class btiua{
    private int[] a;
    // globally stores the size of an array a getting from the Main function as size
    private int n;
    private Scanner read;   // making the read as global object for the main
    btiua(int size){
        n = size;
        a = new int[size];
        read = new Scanner(System.in); // creating the instance of the read in the main method constructor
    }
    public void create(){
        System.out.print("Data : ");
        for(int i=0; i<n; i++){
            int ele = read.nextInt();
            a[i] = ele;
        }
    }
    // preot - pre order traversal
    public void preot(int l){
        if(l<n && a[l]!=0){
            System.out.print(a[l] + " ");
            preot((2 * l) + 1); // left child
            preot((2 * l) + 2); // right child
        }
    }
    // inot - in order traversal
    public void inot(int l){
        if(l<n && a[l]!=0){
            inot((2 * l) + 1); // left child
            System.out.print(a[l] + " ");
            inot((2 * l) + 2); // right child
        }
    }
    // postot - post order traversal
    public void postot(int l){
        if(l<n && a[l]!=0){
            postot((2 * l) + 1); // left child
            postot((2 * l) + 2); // right child
            System.out.print(a[l] + " ");
        }
    }
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        System.out.print("Size : ");
        int size = read.nextInt();
        btiua bt = new btiua(size);
        while(true){
            System.out.print("Operation Case : ");
            int p =read.nextInt();
            switch(p){
                // creation of a tree node
                case 1:
                    bt.create();
                    break;
                // pre order traversal of a tree
                case 2:
                    System.out.print("Pre Order Bianry Tree : ");
                    bt.preot(0);    // 0 shows the tree root index in an array a
                    System.out.println();
                    break;
                // in order traversal of a tree
                case 3:
                    System.out.print("In Order Bianry Tree : ");
                    bt.inot(0);    // 0 shows the tree root index in an array a
                    System.out.println();
                    break;
                // post order traversal of a tree
                case 4:
                    System.out.print("Post Order Bianry Tree : ");
                    bt.postot(0);    // 0 shows the tree root index in an array a
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
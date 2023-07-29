package Stacks;
import java.util.*;
class Main{
    private Node top;
    private int cap;
    private int n;
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public Main(int size){
        top = null;
        cap = size;
        n = 0;
    }
    public boolean isEmpty(){
        return n == 0;
    }
    public boolean isFull(){
        return n == cap;
    }
    public void push(int data){
        if(isFull()){
            System.out.print("Stack is Overflow, cannot push " + data);
            return;
        }
        Node new_node = new Node(data);
        new_node.next = top;
        top = new_node;
        n = n + 1;
        System.out.print("Pushed " + data + " onto the stack.");
    }
    public int pop(){
        if(isEmpty()){
            System.out.print("Stack is Underflow, cannot pop.");
            return -1;
        }
        int pop_data = top.data;
        top = top.next;
        n = n - 1;
        System.out.print("Popped " + pop_data + " from the stack.");
        return pop_data;
    }
    public int peek(){
        if(isEmpty()){
            System.out.print("Stack is Empty.");
            System.out.println();
            return -1;
        }
        return top.data;
    }
    public int size(){
        return n;
    }
    public void display(){
        if(isEmpty()){
            System.out.print("Stack is Empty.");
            System.out.println();
            return;
        }
        System.out.print("Stack : ");
        Node temp = top;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        System.out.print("Stack size : ");
        int size = read.nextInt();
        Main s = new Main(size);
        while(true){
            System.out.print("Operation Case : ");
            int p = read.nextInt();
            switch(p){
                // pushing onto a stack
                case 1:
                    System.out.print("Data : ");
                    int data = read.nextInt();
                    s.push(data);
                    System.out.println();
                    s.display();
                    break;
                // popping from a stack
                case 2:
                    s.pop();
                    System.out.println();
                    s.display();
                    break;
                // finding the peek value of a stack
                case 3:
                    int peek = s.peek();
                    System.out.print("Top element of a stack is : " + peek);
                    System.out.println();
                    break;
                // check if status is empty
                case 4:
                    boolean empty = s.isEmpty();
                    System.out.print("Is stack is empty : " + empty);
                    System.out.println();
                    break;
                // check if status is full
                case 5:
                    boolean full = s.isFull();
                    System.out.print("Is stack is full : " + full);
                    System.out.println();
                    break;
                // knowing the size of a stack
                case 6:
                    int s_size = s.size();
                    System.out.print("Size of a stack is : " + s_size);
                    System.out.println();
                    break;
                // traversing the stack
                case 7:
                    s.display();
                    break;
                default:
                    System.exit(0);
            }
        }
    }
}
package Stacks;
import java.util.*;
class Main{
    private int n;
    private int top;
    private int[] a;
    Main(int size){
        n = size;
        top = -1;
        a = new int[n];
    }
    public void push(int data){
        if(top == n-1){
            System.out.print("Stack is Overflowed, cannot push " + data);
            return;
        }
        top = top + 1;
        a[top] = data;
        System.out.print("Pushed " + data + " onto the stack.");
    }
    public int pop(){
        if(top == -1){
            System.out.print("Stack is Underflowed, cannot pop.");
            return -1;
        }
        int pop_data = a[top];
        top = top - 1;
        System.out.print("Popped " + pop_data + " from the stack.");
        return pop_data;
    }
    public int peek(){
        if(top == -1){
            System.out.print("Stack is empty.");
            System.out.println();
            return -1;
        }
        return a[top];
    }
    public boolean isEmpty(){
        return top == -1;
    }
    public boolean isFull(){
        return top == n-1;
    }
    public int size(){
        return top + 1;
    }
    public void display(){
        if(top == -1){
            System.out.print("Stack is empty.");
            System.out.println();
            return;
        }
        System.out.print("Stack : ");
        for(int i=top; i>=0; i--){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        System.out.print("Stack Size : ");
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
                // popping from the stack
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
                // check if stack is empty
                case 4:
                    boolean empty = s.isEmpty();
                    System.out.print("Is stack is empty : " + empty);
                    System.out.println();
                    break;
                // check if stack is full
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
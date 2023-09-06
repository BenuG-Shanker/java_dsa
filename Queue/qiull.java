// class is about for implementing of the enqueue operation, dequeue operation, isEmpty, isFull, front value, rear value, queue size, and display of the queue implemented using linked list i.e., qiull
package Queue;
import java.util.*;
class qiull{
    private Node f;
    private Node r;
    private int n;
    private int cap;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    qiull(int size){
        f = null;
        r = null;
        cap = size;
        n = 0;
    }
    public boolean isEmpty(){
        return n == 0;
    }
    public boolean isFull(){
        return n == cap;
    }
    public void enqueue(int data){
        if(isFull()){
            System.out.print("Queue is Overflow, cannot enqueue " + data);
            return;
        }
        else{
            Node new_node = new Node(data);
            if(f==null && r==null){
                f = new_node;
                r = new_node;
            }
            else{
                r.next = new_node;
                r = r.next;
            }
            n = n + 1;
            System.out.print("Enqueued " + data + " onto the queue");
        }
    }
    public void dequeue(){
        if(isEmpty()){
            System.out.print("Queue is Underflow, cannot dequeue.");
            return;
        }
        int dequeue_data = f.data;
        f = f.next;
        n = n - 1;
        System.out.print("Dequeued " + dequeue_data + " from the queue");
    }
    public int front(){
        if(isEmpty()){
            return -1;
        }
        return f.data;
    }
    public int rear(){
        if(isEmpty()){
            return -1;
        }
        return r.data;
    }
    public int size(){
        return n;
    }
    public void display(){
        if(isEmpty()){
            System.out.print("Queue is empty");
            System.out.println();
            return;
        }
        System.out.print("Queue : ");
        Node temp = f;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        System.out.print("Queue Size : ");
        int size = read.nextInt();
        qiull q = new qiull(size);
        while(true){
            System.out.print("Operation Case : ");
            int p = read.nextInt();
            switch(p){
                // enqueueing onto the queue
                case 1:
                    System.out.print("Data : ");
                    int data = read.nextInt();
                    q.enqueue(data);
                    System.out.println();
                    q.display();
                    break;
                // dequeueing from the queue
                case 2:
                    q.dequeue();
                    System.out.println();
                    q.display();
                    break;
                // checking queue is empty
                case 3:
                    boolean empty = q.isEmpty();
                    System.out.print("Queue is : " + empty);
                    System.out.println();
                    break;
                // checking queue is empty
                case 4:
                    boolean full = q.isFull();
                    System.out.print("Queue is : " + full);
                    System.out.println();
                    break;
                // getting front value of a queue
                case 5:
                    int f = q.front();
                    System.out.print("Front value of the queue is : " + f);
                    System.out.println();
                    break;
                // getting front value of a queue
                case 6:
                    int r = q.rear();
                    System.out.print("Rear value of the queue is : " + r);
                    System.out.println();
                    break;
                // knowing the size of the queue
                case 7:
                    int s_size = q.size();
                    System.out.print("Size of the queue is : " + s_size);
                    System.out.println();
                    break;
                // traversing the queue
                case 8:
                    q.display();
                    break;
                default:
                    read.close();
                    System.exit(0);
            }
        }
    }
}
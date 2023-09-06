// class is about for implementing of the enqueue operation, dequeue operation, isEmpty, isFull, front value, rear value, queue size, and display of the queue implemented using arrays i.e., qiua
package Queue;
import java.util.*;
class qiua{
    private int f;
    private int r;
    private int n;
    private int[] a;
    qiua(int size){
        f = -1;
        r = -1;
        n = size;
        a = new int[n];
    }
    public void enqueue(int data){
        if(r == n-1){
            System.out.print("Queue is Overflow, cannot enqueue " + data);
            return;
        }
        else{
            if(f==-1 && r==-1){
                f = 0;
                r = 0;
            }
            else{
                r = r + 1;
            }
            a[r] = data;
            System.out.print("Enqueued " + data + " onto the queue");
        }
    }
    public void dequeue(){
        if(f==-1 || r==-1){
            System.out.print("Queue is Underflow, cannot enqueue.");
            return;
        }
        int dequeue_data = a[f];
        f = f + 1;
        System.out.print("Dequeued " + dequeue_data + " from the queue");
    }
    public boolean isEmpty(){
        return f==-1;
    }
    public boolean isFull(){
        return r==n-1;
    }
    public int front(){
        return f;
    }
    public int rear(){
        return r;
    }
    public int size(){
        return r-f;
    }
    public void display(){
        if(f == -1){
            System.out.print("Queue is empty");
            System.out.println();
            return;
        }
        System.out.print("Queue : ");
        for(int i=f; i<=r; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        System.out.print("Queue Size : ");
        int size = read.nextInt();
        qiua q = new qiua(size);
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
                    System.out.print("Queue is empty : " + empty);
                    System.out.println();
                    break;
                // checking queue is empty
                case 4:
                    boolean full = q.isFull();
                    System.out.print("Queue is  full : " + full);
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
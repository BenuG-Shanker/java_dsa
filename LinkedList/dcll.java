// class is about for implementing of the creation of the node, insertion of a new node, deletion of the existed node, and displaying of the node from the Doubly Circullar Linked List i.e., dcll
package LinkedList;
import java.util.Scanner;
class dcll{
    static class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    Node head = null;
    Node tail = null;
    public void create(){
        Scanner read = new Scanner(System.in);
        System.out.print("Data : ");
        int data = read.nextInt();
        Node new_node = new Node(data);
        if(head == null){
            head = new_node;
            tail = new_node;
            tail.next = head;
            head.prev = tail;
            new_node.next = new_node;
            new_node.prev = new_node;
        }
    }
    public void insert(){
        Scanner read = new Scanner(System.in);
        int n, m, p, data;
        do{
            System.out.print("Data : ");
            data = read.nextInt();
            Node new_node = new Node(data);
            System.out.print("Insertion Case : ");
            m = read.nextInt();
            switch(m){
                // insertion in beginning
                case 1:
                    new_node.next = head;
                    head.prev = new_node;
                    head = new_node;
                    tail.next = head;
                    head.prev = tail;
                    break;
                // insertion in any position
                case 2:
                    Node temp = head;
                    Node ptr = temp.next;
                    System.out.print("Position : ");
                    p = read.nextInt();
                    for(int i=0; i<(p-1); i++){
                        temp = ptr;
                        ptr = ptr.next;
                    }
                    new_node.next = ptr;
                    ptr.prev = new_node;
                    temp.next = new_node;
                    new_node.prev = temp;
                    break;
                // insertion in end
                case 3:
                    tail.next = new_node;
                    new_node.prev = tail;
                    tail = new_node;
                    tail.next = head;
                    head.prev = tail;
                    break;
            }
            System.out.print("Insertion Continue : ");
            n = read.nextInt();
        }
        while(n==1);
    }
    public void delete(){
        Scanner read = new Scanner(System.in);
        int n, m, p;
        do{
            if(head == null){
                System.out.print("Doubly Circullar Linked List is empty.");
            }
            else{
                System.out.print("Deletion Case : ");
                m = read.nextInt();
                switch(m){
                    // deletion in beginning
                    case 1:
                        Node temp = head;
                        temp = temp.next;
                        head = temp;
                        head.prev = tail;
                        tail.next = head;
                        break;
                    // deletion in any position
                    case 2:
                        Node temp1 = head;
                        Node ptr = temp1.next;
                        System.out.print("Position : ");
                        p = read.nextInt();
                        for(int i=0; i<(p-1); i++){
                            temp1 = ptr;
                            ptr = ptr.next;
                        }
                        temp1.next = ptr.next;
                        ptr.next.prev = temp1;
                        break;
                    // deletion in end
                    case 3:
                        tail = tail.prev;
                        tail.next = head;
                        head.prev = tail;
                        break;
                }
            }
            System.out.print("Deletion Continue : ");
            n = read.nextInt();
        }
        while(n==1);
    }
    public void traverse(){
        Node temp = head;
        if(head == null){
            System.out.print("Doubly Circullar Linked List does not exist.");
        }
        else{
            do{
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            while(temp!=head);
        }
    }
    public static void main(String[] args){
        dcll ll = new dcll();
        ll.create();
        ll.traverse();
        System.out.println();
        Scanner read = new Scanner(System.in);
        int n, m, p, r;
        do{
            System.out.print("Operation Case : ");
            m = read.nextInt();
            switch(m){
                // insertion in doubly circullar linked list
                case 1:
                    do{
                        ll.insert();
                        ll.traverse();
                        System.out.println();
                        System.out.print("Repeat Insertion : ");
                        p = read.nextInt();
                    }
                    while(p==1);
                    ll.traverse();
                    System.out.println();
                    break;
                // deletion in doubly circullar linked list
                case 2:
                    do{
                        ll.delete();
                        ll.traverse();
                        System.out.println();
                        System.out.print("Repeat Deletion : ");
                        r = read.nextInt();
                    }
                    while(r==1);
                    ll.traverse();
                    System.out.println();
                    break;
            }
            System.out.print("Operation Continue : ");
            n = read.nextInt();
        }
        while(n==1);
        ll.traverse();
        read.close();
    }
}
package LinkedList;
import java.util.*;
class sll{
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node head = null;
    public void create(){
        Scanner read = new Scanner(System.in);
        System.out.print("Data : ");
        int data = read.nextInt();
        Node new_node = new Node(data);
        if(head == null){
            head = new_node;
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
                    head = new_node;
                    break;
                // insertion in any position
                case 2:
                    Node temp = head;
                    System.out.print("Position : ");
                    p = read.nextInt();
                    for(int i=0; i<(p-1); i++){
                        temp = temp.next;
                    }
                    new_node.next = temp.next;
                    temp.next = new_node;
                    break;
                // insertion in end
                case 3:
                    Node temp1 = head;
                    while(temp1.next!=null){
                        temp1 = temp1.next;
                    }
                    temp1.next = new_node;
                    break;
                default:
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
                System.out.print("Singly Linked List is empty.");
            }
            else{
                System.out.print("Deletion Case : ");
                m = read.nextInt();
                switch(m){
                    // deleteion in beginning
                    case 1:
                        Node temp = head;
                        temp = temp.next;
                        head = temp;
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
                        break;
                    // deletion in end
                    case 3:
                        Node temp2 = head;
                        Node ptr1 = temp2.next;
                        while(ptr1.next!=null){
                            temp2 = ptr1;
                            ptr1 = ptr1.next;
                        }
                        temp2.next = null;
                        break;
                    default:
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
            System.out.print("Singly Linked List does not exist.");
        }
        else{
            while(temp!=null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    }
    public static void main(String[] args){
        sll ll = new sll();
        ll.create();
        ll.traverse();
        System.out.println();
        Scanner read = new Scanner(System.in);
        int n, m, p, r;
        do{
            System.out.print("Operation Case : ");
            m = read.nextInt();
            switch(m){
                // insertion in singly linked list
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
                // deletion in singly linked list
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
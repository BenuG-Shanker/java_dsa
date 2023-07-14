package Array;
import java.util.*;
class creation_traversing_1d{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            int ele = read.nextInt();
            a[i] = ele;
        }
        for(int i=0; i<n; i++){
            System.out.print(a[i] + " ");
        }
        read.close();
    }
}
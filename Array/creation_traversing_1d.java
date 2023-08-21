// class is about for creating and traversing the stored data thoroughly in a 1d Array
package Array;
import java.util.*;
class creation_traversing_1d{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        System.out.print("Size : ");
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
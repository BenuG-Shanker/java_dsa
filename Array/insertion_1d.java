// class is about for inserting the stored data into a 1d Array
package Array;
import java.util.*;
class insertion_1d{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        System.out.print("Size : ");
        int n = read.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            int ele = read.nextInt();
            a[i] = ele;
        }
        System.out.print("Data : ");
        int d = read.nextInt();
        System.out.print("Position : ");
        int p = read.nextInt();
        // temp array
        int[] b = new int[n+1];
        for(int i=0; i<n+1; i++){
            if(i<p){
                b[i] = a[i];
            }
            else if(i==p){
                b[i] = d;
            }
            else{
                b[i] = a[i-1];
            }
        }
        for(int i=0; i<n+1; i++){
            System.out.print(b[i] + " ");
        }
        read.close();
    }
}

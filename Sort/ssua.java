// class is about for implemention of the selection sort implementation on the arrays i.e., ssua
package Sort;
import java.util.*;
class ssua{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        System.out.print("Data : ");
        int n = read.nextInt();
        System.out.print("Elements : ");
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            int ele = read.nextInt();
            a[i] = ele;
        }
        for(int i=0; i<n-1; i++){
            int p = i;
            for(int j=i+1; j<n; j++){
                if(a[j] < a[p]){
                    p = j;
                }
            }
            int temp = a[i];
            a[i] = a[p];
            a[p] = temp;
        }
        System.out.print("Sorted Elements : ");
        for(int i=0; i<n; i++){
            System.out.print(a[i] + " ");
        }
        read.close();
    }
}
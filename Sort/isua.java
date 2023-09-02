// class is about for implemention of the insertion sort implementation on the arrays i.e., isua
package Sort;
import java.util.*;
class isua{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        System.out.print("Size : ");
        int n = read.nextInt();
        System.out.print("Elements : ");
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            int ele = read.nextInt();
            a[i] = ele;
        }
        int j=0;
        for(int i=1; i<n; i++){
            int temp = a[i];
            j = i-1;
            while(j>=0 && temp<a[j]){
                a[j+1] = a[j];
                j = j-1;
            }
            a[j+1] = temp;
        }
        System.out.print("Sorted Elements : ");
        for(int i=0; i<n; i++){
            System.out.print(a[i] + " ");
        }
        read.close();
    }
}
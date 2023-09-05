// class is about for implemention of the quick sort implementation on the arrays i.e., qsua
package Sort;
import java.util.*;
class qsua{
    public static int partition(int[] a, int s, int e){
        int pindex = s + (int)(Math.random() * (e - s + 1)); // randomly pivot is getting selected from the limits of the index of the array
        int pivot = a[pindex];
        int temp = a[e];
        a[e] = a[pindex];
        a[pindex] = temp;
        pindex = s - 1;
        for(int i=s; i<=e-1; i++){
            if(a[i] < pivot){
                pindex = pindex + 1;
                temp = a[pindex];
                a[pindex] = a[i];
                a[i] = temp;
            }
        }
        pindex = pindex + 1;
        temp = a[pindex];
        a[pindex] = a[e];
        a[e] = temp;
        return pindex;
    }
    public static void qs(int[] a, int s, int e){
        if(s < e){
            int p = partition(a, s, e);
            qs(a, s, p-1);
            qs(a, p+1, e);
        }
    }
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
        qs(a, 0, n-1);
        System.out.print("Sorted Array : ");
        for(int i=0; i<n; i++){
            System.out.print(a[i] + " ");
        }
        read.close();
    }
}
// class is about for implemention of the merge sort implementation on the arrays i.e., msua
package Sort;
import java.util.*;
class Main{
    public static void merge(int[] a, int s, int m, int e){
        int l = m - s + 1;  // size of the left array
        int r = e - m;  // size of the right array
        int[] la = new int[l];  // initialization of the left array
        int[] ra = new int[r];  // initialization of the right array
        for(int i=0; i<l; i++){
            la[i] = a[s + i];   // inserting the requirred elements in the left array
        }
        for(int i=0; i<r; i++){
            ra[i] = a[m + 1 + i];   // inserting the requirred elements in the right array
        }
        int i = 0;
        int j = 0;
        int k = s;
        while(i<l && j<r){  // helps in sorting the two seperate arrays i.e., left array array and right array
            if(la[i] <= ra[j]){
                a[k] = la[i];  // update the array element by putting the small left array element by comparring the remaining right array elements 
                i = i + 1;
            }
            else{
                a[k] = ra[j];  // update the array element by putting the small right array element by comparring the remaining left array elements 
                j = j + 1;
            }
            k = k + 1;
        }
        while(i<l){ // updating the array element by comparring the last left array element with the left array size
            a[k] = la[i];
            i = i + 1;
            k = k + 1;
        }
        while(j<r){ // updating the array element by comparring the last right array element with the right array size
            a[k] = ra[j];
            j = j + 1;
            k = k + 1;
        }
    }
    public static void ms(int[] a, int s, int e){
        if(s < e){
            int m = (s + e) / 2;    // calculating the middle index in an array
            ms(a, s, m);
            ms(a, m+1, e);
            merge(a, s, m, e);
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
        ms(a, 0, n-1);
        System.out.print("Sorted Elements : ");
        for(int i=0; i<n; i++){
            System.out.print(a[i] + " ");
        }
        read.close();
    }
}
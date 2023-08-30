// class is about for implemention of the binary search implementation on the arrays i.e., bsua
package Search;
import java.util.*;
class bsua{
    public static int bs(int[] a, int b, int c){
        int l = 0;  // lower index pointer of an array
        int h = c-1;  // higher index pointer of an array
        while(l<=h){
            int m = (l+h)/2;  // middle index pointer of an array
            if(a[m]==b){
                return m;  // return the index when elements matches with need one
            }
            else if(a[m]<b){
                l = m+1;  // update the l value to the right side of the m value in an array
            }
            else if(a[m]>b){
                h = m-1;  // update the h value to the left side of the m value in an array
            }
        }
        return -1;
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
        System.out.print("Element to be Searched : ");
        int d = read.nextInt();
        int s = bs(a, d, n);    // recursive way
        if(s!=-1){
            System.out.print("Data exist at position " + s + " in a data structure.");
        }
        else{
            System.out.print("Data does not exist");
        }
        read.close();
    }
}
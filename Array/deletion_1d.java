package Array;
import java.util.*;
class deletion_1d{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            int ele = read.nextInt();
            a[i] = ele;
        }
        int p = read.nextInt();
        int[] b = new int[n];
        for(int i=0; i<n; i++){
            if(i<p){
                b[i] = a[i];
            }
            else if(i==p){
                continue;
            }
            else{
                b[i-1] = a[i];
            }
        }
        for(int i=0; i<n-1; i++){
            System.out.print(b[i] + " ");
        }
        read.close();
    }
}
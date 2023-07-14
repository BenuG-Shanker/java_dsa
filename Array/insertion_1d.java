package Array;
import java.util.*;
class insertion_1d{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            int ele = read.nextInt();
            a[i] = ele;
        }
        int d = read.nextInt();
        int p = read.nextInt();
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

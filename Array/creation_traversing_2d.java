package Array;
import java.util.*;
class creation_traversing_2d{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int m = read.nextInt();
        int[][] a = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                int ele = read.nextInt();
                a[i][j] = ele;
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        read.close();
    }
}
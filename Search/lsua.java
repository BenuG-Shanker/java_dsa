// class is about for implemention of the linear search implementation on the arrays i.e., lsua
package Search;
import java.util.*;
class lsua{
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
		int p = read.nextInt();
		int count = 0;
		int pos = 0;
		for(int i=0; i<n; i++){
			if(a[i] == p){
				count = count + 1;
				pos = i;
				break;
			}
		}
		if(count == 1){
			System.out.print("Data exist at position " + pos + " in a data structure.");
		}
		else{
			System.out.print("Data does not exist ");
		}
        read.close();
	}
}
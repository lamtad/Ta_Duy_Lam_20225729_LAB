import java.util.*;
public class Sort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		mergeSort(a, 0, n-1);
		int sum = 0;
		for(int i = 0; i < n; i++) {
			System.out.print(a[i]+ " ");
			sum += a[i];
		}
		
		System.out.println("\n"+sum);
		double avg  = sum*1.0/(n*1.0);	
		System.out.printf("%.2f", avg);
	}
	
	static void mergeSort(int[] a, int L, int R) {
		if(L<R) {
			int M = (L+R)/2;
			mergeSort(a, L, M);
			mergeSort(a, M+1, R);
			merge(a, L, M , R);
		}
	}
	static void merge(int[] a, int L, int M, int R) {
		int n1 = M - L + 1;
		int n2 = R - M;
		
		int[] l = new int[n1];
		int[] r = new int[n2];
		
		for(int i=0;i<n1;i++) {
			l[i] = a[L+i];
		}
		for(int i=0;i<n2;i++) {
			r[i] = a[M+1+i];
		}
		int i = 0, j = 0;
		int k = L;
		while(i < n1 && j < n2) {
			if(l[i] <= r[j]) {
				a[k] = l[i];
				i++;
			}else {
				a[k] = r[j];
				j++;
			}
			k++;
		}
		while(i < n1) {
			a[k++] = l[i++];  
		}
		while(j < n2) {
			a[k++] = r[j++];
		}
	}
}

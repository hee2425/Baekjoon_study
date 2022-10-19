import java.io.*;
import java.util.*;
public class Bj11004 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		quickSort(arr, 0, n-1, k-1);
		System.out.println(arr[k-1]);
		
	}

	public static void quickSort(int[] arr, int s, int e, int k) {
		if(s<e) {
			int pivot = partition(arr,s,e);
			if(pivot == k) {
				return;
			}else if(k < pivot) {
				quickSort(arr, s, pivot-1, k);
			}else {
				quickSort(arr, pivot+1, e, k);
			}
		}
	}
	
	public static int partition(int[] arr, int s, int e) {
		if(s+1 == e) {
			if(arr[s]>arr[e]) swap(arr,s,e);
			return e;
		}
		int m = (s+e)/2;
		swap(arr, s, m);   //중앙값을 첫번째로 시작
		int pivot = arr[s];  
		int i = s, j=e;
		
		while(i < j) {
			while(pivot < arr[j] ) {  //피벗보다 작은수가 나올때까지
				j--;
			}
			while(i<j && pivot > arr[i]){  //피벗보다 큰 수가 나올때까지
				i++;
			}
			swap(arr, i, j);
		}
		arr[s] = arr[i];
		arr[i] = pivot;
		return i;
	}
	
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}

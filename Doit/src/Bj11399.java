import java.util.*;
public class Bj11399 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		int sum[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=1; i<n; i++) {  //삽입정렬
			int insert_p = i;
			int insert_v = arr[i];
			for(int j=i-1; j>=0; j--) {
				if(arr[j]<arr[i]) {
					insert_p = j+1;
					break;
				}
				if(j == 0) {
					insert_p = 0;
				}
			}
			for(int j = i; j>insert_p; j--) {
				arr[j] = arr[j-1];
			}
			arr[insert_p] = insert_v;
		}
		
		//합 배열
		sum[0] = arr[0];
		for(int i=1; i<n; i++) {
			sum[i] = sum[i-1]+arr[i];
		}
		
		//합의 최소값 구하기
		int s = 0;
		for(int i=0; i<n; i++) {
			s = s+sum[i];
		}
		System.out.println(s);
	}
}

import java.util.Arrays;
import java.util.Scanner;
public class Bj1920 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] A = new int[n];
		for(int i=0; i<n; i++) {
			A[i] = sc.nextInt();
		}
		Arrays.sort(A);  //�̺� Ž���� ���� ����
		
		int m = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < m; i++) {
			
			// ã���� �ϴ� ���� ���� ��� 1, ���� ��� 0�� ����ؾ��Ѵ�.
			if(binarySearch(A, sc.nextInt()) >= 0) {
				sb.append(1).append('\n');
			}
			else {
				sb.append(0).append('\n');
			}
		}
		System.out.println(sb);
	}
	
	
	/**
	 * @param arr ���� �� �迭
	 * @param key ã������ ��
	 * @return key�� ��ġ�ϴ� �迭�� �ε���
	 */
	public static int binarySearch(int[] arr, int key) {
 
		int lo = 0;					// Ž�� ������ ���� �� �ε���
		int hi = arr.length - 1;	// Ž�� ������ ������ �� �ε���
 
		// lo�� hi���� Ŀ���� ������ �ݺ��Ѵ�.
		while(lo <= hi) {
 
			int mid = (lo + hi) / 2;	// �߰���ġ�� ���Ѵ�.
 
			// key���� �߰� ��ġ�� ������ ���� ���
			if(key < arr[mid]) {
				hi = mid - 1;
			}
			// key���� �߰� ��ġ�� ������ Ŭ ���
			else if(key > arr[mid]) {
				lo = mid + 1;
			}
			// key���� �߰� ��ġ�� ���� ���� ���
			else {
				return mid;
			}
		}
 
		// ã���� �ϴ� ���� �������� ���� ���
		return -1;
 
	}
}
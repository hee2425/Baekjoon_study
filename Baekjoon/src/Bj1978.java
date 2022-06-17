/*
 * 소수 개수 출력
 * */
import java.util.Scanner;
public class Bj1978 {
	public int solution(int n, int[] arr) {
		int count = 0;
		
		for(int i=0; i<n; i++) {
			boolean isPrime = true;
			if(arr[i] ==1) { //1일때 패스
				continue;
			}
			for(int j=2; j<=Math.sqrt(arr[i]); j++) {
				if(arr[i]%j == 0) {  //소수 아님
					isPrime = false;
					break;
				}
			}
			if(isPrime) {  //소수인경우 
				count++;
			}
		}
		
		return count;
	}

	public static void main(String[] args) {
		Bj1978 T = new Bj1978();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(T.solution(n, arr));
		
	}

}
/*첫째 줄에 시험장의 개수 N(1 ≤ N ≤ 1,000,000)
둘째 줄에는 각 시험장에 있는 응시자의 수 Ai (1 ≤ Ai ≤ 1,000,000)
셋째 줄에는 B와 C가 주어진다. (1 ≤ B, C ≤ 1,000,000)
B 총 감독관이 감시할 수 있는 응시자 수     각각시험장 총감독1명
C 부감독관이 감시할 수 있는 응시자 수 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj13458 {
	static int n, b, c;
	static int[] arr;  //각 시험장에 있는 응시자 수 배열

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		arr = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());  //띄어쓰기로 문자열 분리
		
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken()); 
		}
		
		StringTokenizer bc = new StringTokenizer(br.readLine());
		b = Integer.parseInt(bc.nextToken());
		c = Integer.parseInt(bc.nextToken());
		
		System.out.println(solution());
		
	}
	public static long solution() {
		long result = 0;  //최소 감독관수
		for(int i=0; i<n; i++) {
			int na = arr[i]-b;    //시험장 응시자수 - 총감독이 감독가능한 수  //감독받지 못하는 응시자
			result++; //1
			
			if(na<=0) continue;
			if(na%c == 0) result += na/c;
			else {
				result += na/c;
				result++;
			}
		}
		return result;
	}

}

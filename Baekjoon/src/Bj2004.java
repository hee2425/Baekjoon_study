import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*조합 0의 개수
 * 팩토리얼 값에 2,5 승수가 겹치는 수 
 * 이항 계수의 공식 사용
 * nCm = n! / (n-m)!m!
 * n!, (n-m)!, m!의 2와 5의 승수를 구함
 * 
 * */

public class Bj2004 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		long n = Long.parseLong(st.nextToken());
		long m = Long.parseLong(st.nextToken());
		
		long five = count5(n) - count5(n-m) - count5(m);
		long two = count2(n) - count2(n-m) - count2(m);
		
		System.out.println(Math.min(five, two)); //2와 5 승수 중 최소값
	}
	
//5의 승수
	static long count5(long num) {
		int count = 0;
		
		while(num >= 5) {
			count += (num / 5);
			num /= 5;
		}
		return count;
	}

//2의 승수
	static long count2(long num) {
		int count = 0;
		while(num >= 2) {
			count += (num/2);
			num /= 2;
		}
		return count;
	}

}
/*
 * 1로 만들기
 * 1. X가 3으로 나누어 떨어지면, 3으로 나눈다.
 * 2. X가 2로 나누어 떨어지면, 2로 나눈다.
 * 3. 1을 뺀다.
 * 
 * 10->5->4->2->1 (x)
 * 10->9->3->1 (o)
 * 
 * dp 이용  bottom-up방식
 * dp[i] = min(3으로 나눔, 2로 나눔, 1뻼);
 * */
import java.io.*;
public class Bj1463 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int X = Integer.parseInt(br.readLine());
		
		int dp[] = new int[X+1];
		dp[0] = dp[1] = 0;  //초깃값
		
		for(int i=2; i<=X; i++) {
			dp[i] = dp[i-1]+1; 	//dp[2] = dp[1]+1
			
			if(i%2 == 0) {
				dp[i] = Math.min(dp[i],  dp[i/2]+1); 
			}
			if(i%3 == 0) {
				dp[i] = Math.min(dp[i],  dp[i/3]+1);
			}
			
		}
		System.out.println(dp[X]);
	}

}

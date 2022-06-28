/*
 * N개의 물건
 * 무게 W 최대 K
 * 가치 V
 * 
 * dp
 * dp[i][j] = dp[i-1][j-Warr[i] + Varr[i]*/
import java.util.Scanner;
public class Bj12865 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		int[] Warr = new int[N+1];
		int[] Varr = new int[N+1];
		
		for(int i=1; i<N+1; i++) {
			Warr[i] = sc.nextInt();
			Varr[i] = sc.nextInt();
		}
		
		int dp[][] = new int[N+1][K+1];
		
		for(int i=1;i<=N;i++) {
			for(int j=1;j<=K;j++) {
				dp[i][j] = dp[i-1][j]; // 이전 가치 저장
				
				if(j - Warr[i] >= 0) { // K에서 Warr무게 빼고도 남으면
					dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-Warr[i]]+Varr[i]); 
					// 이전에서 구한 가치, 남은 무게의 가치 + 현재 가치 중 큰 값
				}
			}
		}
		System.out.println(dp[N][K]);
	}

}

/*
 * N���� ����
 * ���� W �ִ� K
 * ��ġ V
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
				dp[i][j] = dp[i-1][j]; // ���� ��ġ ����
				
				if(j - Warr[i] >= 0) { // K���� Warr���� ���� ������
					dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-Warr[i]]+Varr[i]); 
					// �������� ���� ��ġ, ���� ������ ��ġ + ���� ��ġ �� ū ��
				}
			}
		}
		System.out.println(dp[N][K]);
	}

}

/*
 * 2xn Ÿ�ϸ�
 * 2xn ũ���� ���簢���� 2x1 or 1x2�� ä��� ����� �� 
 * 
 * ��Ģ��Ģ...
 * dp[n] = dp[n-1]+dp[n-2];
 * */
import java.util.Scanner;
public class Bj11726 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int dp[] = new int[1001];
		dp[0] = 0;
		dp[1] = 1;
		dp[2] = 2;
		for(int i=3; i<=n; i++) {
			dp[i] = (dp[i-1] + dp[i-2]) % 10007;
		}
		System.out.println(dp[n]);
	}

}

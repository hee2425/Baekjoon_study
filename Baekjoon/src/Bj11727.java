/*
 * 2Xn 타일링2
 * 2×n 직사각형을 1×2, 2×1과 2×2 타일로 채우는 방법의 수를 구하는 프로그램
 * */
import java.util.Scanner;
public class Bj11727 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int dp[] = new int[1001];
		dp[1] = 1;
		dp[2] = 3;
		for(int i=3; i<=n; i++) {
			dp[i] = (dp[i-1] + (dp[i-2] * 2)) % 10007;
		}
		System.out.println(dp[n]);
	}

}

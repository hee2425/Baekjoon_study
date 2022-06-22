/*
 * 1�� �����
 * 1. X�� 3���� ������ ��������, 3���� ������.
 * 2. X�� 2�� ������ ��������, 2�� ������.
 * 3. 1�� ����.
 * 
 * 10->5->4->2->1 (x)
 * 10->9->3->1 (o)
 * 
 * dp �̿�  bottom-up���
 * dp[i] = min(3���� ����, 2�� ����, 1��);
 * */
import java.io.*;
public class Bj1463 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int X = Integer.parseInt(br.readLine());
		
		int dp[] = new int[X+1];
		dp[0] = dp[1] = 0;  //�ʱ갪
		
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

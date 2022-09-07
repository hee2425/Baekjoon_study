import java.util.Scanner;
public class Bj10986 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] sum = new int[N];
		int[] cnt = new int[M];
		
		int answer = 0;
		sum[0] = sc.nextInt();
		for(int i=1; i<N; i++) {
			sum[i] = sum[i-1] + sc.nextInt(); 
		}
		for(int i=0; i<N; i++) {
			int remainder = sum[i]%M;
			if(remainder == 0) answer++;
			cnt[remainder]++;
		}
		for(int i=0; i<M; i++) {
			if(cnt[i]>1) {
				answer = answer + (cnt[i]*(cnt[i]-1)/2);
			}
		}
		System.out.println(answer);
	}

}

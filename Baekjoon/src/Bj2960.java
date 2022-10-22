import java.util.*;
public class Bj2960 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		boolean[] Prime = new boolean[N+1];
		
		int count = 0;
		
		for(int i=2; i<=N; i++) {
			for(int j=i; j<=N; j+=i) {
				if(Prime[j] == false) {  
					count++;
					Prime[j] = true; //Áö¿ò
				}
				
				if(count == K) {
					System.out.println(j);
					System.exit(0);
				}
			}
		}
	}
}

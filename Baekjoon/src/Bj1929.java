/*
 * M이상 N이하의 소수 출력
 * 
 * */
import java.util.Scanner;

public class Bj1929{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		for(int i=n; i<=m; i++) {
			boolean isPrime = true;
			if(i ==1) { //1일때 패스
				continue;
			}
			for(int j=2; j<=Math.sqrt(i); j++) {
				if(i%j == 0) {  //소수 아님
					isPrime = false;
					break;
				}
			}
			if(isPrime) {  //소수인경우 
				System.out.println(i);
			}
		}
	}
}
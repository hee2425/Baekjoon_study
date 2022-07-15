/*6이 3개 이상 연속으로 들어가는 수
 * 문자열 비교*/

import java.util.Scanner;
public class Bj1436 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int num = 666;
		int count = 1;
		
		while(count != n) {
			num++;
			if(String.valueOf(num).contains("666")) {
				count++;
			}
		}
		System.out.println(num);
		
	}
}

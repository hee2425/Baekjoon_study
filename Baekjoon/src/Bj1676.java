/*
 * N!에서 뒤에서부터 처음 0이 아닌 숫자까지의 0의 개수
 * */
import java.util.Scanner;

public class Bj1676{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int two = 0;
		int five = 0;
		for(int i=1; i<=n; i++) {
			int num=i;
			while(num%2 == 0) {
				two++;
				num /=2;
			}
			while(num%5 == 0) {
				five++;
				num /=5;
			}
		}
		System.out.println(five < two ? five: two);
	}
}

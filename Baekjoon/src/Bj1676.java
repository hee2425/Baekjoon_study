/*
 * N!���� �ڿ������� ó�� 0�� �ƴ� ���ڱ����� 0�� ����
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

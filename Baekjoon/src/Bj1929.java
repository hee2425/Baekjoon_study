/*
 * M�̻� N������ �Ҽ� ���
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
			if(i ==1) { //1�϶� �н�
				continue;
			}
			for(int j=2; j<=Math.sqrt(i); j++) {
				if(i%j == 0) {  //�Ҽ� �ƴ�
					isPrime = false;
					break;
				}
			}
			if(isPrime) {  //�Ҽ��ΰ�� 
				System.out.println(i);
			}
		}
	}
}
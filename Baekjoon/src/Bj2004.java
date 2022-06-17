import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*���� 0�� ����
 * ���丮�� ���� 2,5 �¼��� ��ġ�� �� 
 * ���� ����� ���� ���
 * nCm = n! / (n-m)!m!
 * n!, (n-m)!, m!�� 2�� 5�� �¼��� ����
 * 
 * */

public class Bj2004 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		long n = Long.parseLong(st.nextToken());
		long m = Long.parseLong(st.nextToken());
		
		long five = count5(n) - count5(n-m) - count5(m);
		long two = count2(n) - count2(n-m) - count2(m);
		
		System.out.println(Math.min(five, two)); //2�� 5 �¼� �� �ּҰ�
	}
	
//5�� �¼�
	static long count5(long num) {
		int count = 0;
		
		while(num >= 5) {
			count += (num / 5);
			num /= 5;
		}
		return count;
	}

//2�� �¼�
	static long count2(long num) {
		int count = 0;
		while(num >= 2) {
			count += (num/2);
			num /= 2;
		}
		return count;
	}

}
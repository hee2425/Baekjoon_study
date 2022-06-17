/* ������ ��Ƽ��
 * 2���� ū ¦���� �� �Ҽ��� ��
 * 
 * �����佺�׳׽��� ü�� �Ҽ� ����
 *  2 < N �� 1,000,000
 * */
import java.io.*;
public class Bj17103 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		//�����佺�׳׽��� ü
		//�Ҽ�  = false
		boolean[] prime = new boolean[1000001];
		prime[0] = prime[1] = true;
		for(int i=2; i*i <= 1000000; i++) {
			if(!prime[i]) {
				for(int j=i+i; j<=1000000; j +=i) {
					prime[j] = true;
				}
			}
		}
		while(t>0) {
			int tem = Integer.parseInt(br.readLine());
			int answer = 0;
			for(int j=2; j <= tem/2; j++) {  //���ݱ����� �ݺ�
				if(!prime[j] && !prime[tem -j]) answer++;
			}
			System.out.println(answer);
			t--;
		}
	}

}
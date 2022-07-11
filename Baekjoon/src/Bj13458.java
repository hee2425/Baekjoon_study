/*ù° �ٿ� �������� ���� N(1 �� N �� 1,000,000)
��° �ٿ��� �� �����忡 �ִ� �������� �� Ai (1 �� Ai �� 1,000,000)
��° �ٿ��� B�� C�� �־�����. (1 �� B, C �� 1,000,000)
B �� �������� ������ �� �ִ� ������ ��     ���������� �Ѱ���1��
C �ΰ������� ������ �� �ִ� ������ �� */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj13458 {
	static int n, b, c;
	static int[] arr;  //�� �����忡 �ִ� ������ �� �迭

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		arr = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());  //����� ���ڿ� �и�
		
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken()); 
		}
		
		StringTokenizer bc = new StringTokenizer(br.readLine());
		b = Integer.parseInt(bc.nextToken());
		c = Integer.parseInt(bc.nextToken());
		
		System.out.println(solution());
		
	}
	public static long solution() {
		long result = 0;  //�ּ� ��������
		for(int i=0; i<n; i++) {
			int na = arr[i]-b;    //������ �����ڼ� - �Ѱ����� ���������� ��  //�������� ���ϴ� ������
			result++; //1
			
			if(na<=0) continue;
			if(na%c == 0) result += na/c;
			else {
				result += na/c;
				result++;
			}
		}
		return result;
	}

}

import java.util.Scanner;
/*
 * 2����->8���� 3���� ��� 10������ ��ȯ
 * 8����->2����
 * ���� �ϳ��� 2������ ��ȯ 
 * �� �ռ�����  0�� ����
 * ������ ���� 2���� ��ȯ�� 3ĭ ä���
 * 
 * Integer.toBinaryString() --> 2���� ��ȯ �Լ�
 * */

public class Bj1212 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int sum = 0;
		int len = str.length();
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<len; i++) {
			String answer = Integer.toBinaryString(str.charAt(i)-'0');
			if(answer.length()==2 && i!=0) answer="0"+answer;
			else if(answer.length()==1 && i!=0) answer="00"+answer;
			
			sb.append(answer);
		}
		
		System.out.println(sb);
		
	}
}
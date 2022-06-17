import java.io.*;
/*
 * 2���� -> 8����
 * 3�ڸ��� ���� 10���� ��ȯ -> 8����
 * 
 * ����=1 �ƽ�Ű �ڵ�=49
 * ����=0 �ƽ�Ű�ڵ�=48
 * */

public class Bj1373 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String str = br.readLine();
		int l = str.length();
		if(l % 3 ==1) {  //���ڸ��� �������� ���ڸ� ���� ���
			sb.append(str.charAt(0));
		}else if(l % 3 ==2) {  //���ڸ� ���� ���
			sb.append((str.charAt(0) - '0') *2 +(str.charAt(1) - '0'));			
		}
		
		//������ ���
		for(int i = l%3; i<l; i+=3) {
			sb.append((str.charAt(i)-'0') *4 +(str.charAt(i+1) - '0') *2 + (str.charAt(i+2) - '0'));
			
		}
		
		System.out.println(sb);
	}

}
/*
 * �־��� ���� S
 * S�� ���� �ٸ� �κ� ���ڿ��� ���� ���
 * */
import java.util.*;
public class Bj11478 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		char[] arr = str.toCharArray();
		
		int cnt = 0;
		
		for(int i=arr.length-1; i>=0; i--) {
			for(int j=i; j<arr.length; j++) {
				String tmp1 = str.substring(i+1);  //�޹��ں��� �����ؼ� ������ ���ڿ�
				String tmp2 = str.substring(i, j+1);  //���õ� ���ڱ��� ���� �� �ִ� ��� ���ڿ�
				if(tmp1.contains(tmp2)) {
					continue;
				}else {
					cnt++;
				}
			}
		}
		System.out.println(cnt);
		sc.close();
	}

}
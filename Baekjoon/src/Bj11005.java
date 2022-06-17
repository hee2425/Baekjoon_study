/*
 * ���� ��ȯ2
 * A: 10, B: 11, ..., F: 15, ..., Y: 34, Z: 35
 * 
 * ĳ������ ��̸���Ʈ�� �������ص� 
 * ������ 9���Ͽ� 10�̻��� ��츦 ������ �ƽ�Ű�ڵ尪�� ���� ����Ʈ�� ����
 * ���� ���ϱ� ��� �ڿ������� ����ؾ��ϹǷ� ����Ʈ �Ųٷ� ���
 * 
 * */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Bj11005 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int b = sc.nextInt();
		
		List<Character> list = new ArrayList<>();
		while(n>0) {
			if(n % b <10) {  
				list.add((char)(n%b +'0'));
			}
			else {  //10 �̻��̸� ������ ������ 10 ���� �ƽ�Ű �ڵ� �� A ����
				list.add((char)(n%b -10 +'A'));
			}
			n = n/b;
		}
		for(int i = list.size()-1; i >= 0; i--) {  //����Ʈ �Ųٷ� ���
			System.out.print(list.get(i));
		}
	}

}
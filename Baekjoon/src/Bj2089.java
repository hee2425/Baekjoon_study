/*
 * 10-->-2 ����
 * �������� �׻� ���
 * �������� ����� ����� ���ؼ� �ּ��� ���� ���� �ø�ó�� ����
 * 
 * -13 = -2*6 -1-----------> -13 = -1*7 +1
 * 7 = -2*-4 -1------------> 7 = -2*-3 +1
 * -3 = -2*1 -1------------> -3 = -2*2 +1
 * 2 = -2*-1 +0
 * -1 = -2*0 -1------------> -1 = -2*1 +1
 * 1 = -2*0 +1 
 * 
 * 110111
 * */

import java.util.Scanner;
public class Bj2089 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int input = sc.nextInt();
		
		if(input == 0) {
			System.out.println(0);
		}else {
			while(input != 1) {
				sb.append(Math.abs(input % -2));  //���밪 ��ȯ
				input = (int)Math.ceil((double) input/(-2));  //�ø�
			}
			sb.append(input);
			
			System.out.println(sb.reverse());  //���ڿ� ������
		}
	}

}
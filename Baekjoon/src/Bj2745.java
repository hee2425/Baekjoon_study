/*
 * 10�������� �ٲ� ���
 * 
 * ���� 11005 Ǯ�� ����
 * 
 * 2������ 10�������� ���Ҷ� �� �ڸ� ���ڿ� 2�� 1��, 2��, 3��.. ���� ���Ѵ�
 * ���� �����Ͽ� �� �ڸ��� ���� �� �Է¹��� b�� ��� �����ش�
 * */


import java.util.Scanner;
public class Bj2745 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		int b = sc.nextInt();
		
		int temp = 1;  //�� �ڸ��� �� �����ϱ� ���� ��
		int answer = 0;
		
		for(int i=n.length()-1; i >= 0; i--) {
			char c = n.charAt(i);
			
			if('A' <= c && c <= 'Z') {
				answer += (c -'A'+10)*temp;
			}else {
				answer += (c - '0')*temp;
			}
			temp  = temp*b;
		}
		System.out.println(answer);
		
	}

}
/*
 * �� �ڿ����� �ִ�����, �ּҰ���� ���ϱ�
 * */
import java.util.Scanner;

public class Bj2609 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		String[] arr = n.split(" ");
		
		int n1 = Integer.parseInt(arr[0]);
		int n2 = Integer.parseInt(arr[1]);
		
		int gcf=0;  //�ִ�����
		
		int max_c = Math.min(n1, n2);  
		for(int i=1; i<=max_c; i++) {
			if(n1%i == 0 && n2%i ==0) {
					gcf = i;
			}
		}
		System.out.println(gcf);
		
		int lcm = n1*n2/gcf;  //�ּҰ����
		System.out.println(lcm);
	}

}